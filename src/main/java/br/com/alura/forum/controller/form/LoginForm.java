package br.com.alura.forum.controller.form;

public class LoginForm {

    
    private String email; 
    private String senha;
    
    
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public org.springframework.security.authentication.UsernamePasswordAuthenticationToken converter() {
        
        return new org.springframework.security.authentication.UsernamePasswordAuthenticationToken(email, senha);
    }
    
    
}
