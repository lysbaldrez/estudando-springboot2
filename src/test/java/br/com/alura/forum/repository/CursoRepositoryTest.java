package br.com.alura.forum.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alura.forum.model.Curso;


@RunWith(SpringRunner.class)
// Como é uma classe pra testar um repository 
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTest {
    
    //Anotação pra fazer injeção de dependências por causa das anotações acima
    @Autowired
    private CursoRepository repository;
    
    @Autowired
    private TestEntityManager em;

    @Test
    public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
       String nomeCurso = "HTML 5";
       
       Curso html5 = new Curso ();
       html5.setNome(nomeCurso);
       html5.setCategoria("Programacao");
       em.persist(html5);
       
       Curso curso = repository.findByNome(nomeCurso);
       // Verifica se não esta nulo
       Assert.assertNotNull(curso);
       // Verifica se nomeCurso é exatamente igual curso que veio do banco de dados
       Assert.assertEquals(nomeCurso, curso.getNome());
    }
    
    @Test
    public void naoDeveriaCarregarUmCursoCujoNomeNaoEstejaCadastrado() {
       String nomeCurso = "JPA";
       Curso curso = repository.findByNome(nomeCurso);
       Assert.assertNull(curso);     
    }

}
