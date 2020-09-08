package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

    List<Topico> findByCursoNome(String nomeCurso);
    
//    Outro jeito de escrever o código acima sem usar o find
//    @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//    List <Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
    

}
