package tarefa1;

public class Contato {
    //declaração de variaveis
    String nome;
    String email;
    String telefone;
    
    //construtores
    public Contato() {
    }

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    //métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ": " + email + ", " + telefone; 
    }
    
    
    
}
