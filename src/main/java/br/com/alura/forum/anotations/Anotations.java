package br.com.alura.forum.anotations;

public class Anotations {
   
    // Caso não use um banco de dados em memória (MySql por exemplo) você precisa mudar as dependências 
    // E colocar anotação no teste @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    // Entre parenteses o valor diz pra não substituir o banco de dados que estou configurando para o banco de dados h2
    // É comum ter uma separação dos dados da aplicação de maneira isolada com os dados que uso para os testes (um para o desenvolvimento e um para os testes)
    // Usar o esquema profile
    // Usar spring.datasource.initialization-mode=never pro banco de dados ficar vazio 
    
    //Carrega no contexto do projeto so as classes da parte MVC @WebMvcTest
    
}
