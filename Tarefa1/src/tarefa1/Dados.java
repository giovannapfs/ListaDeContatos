package tarefa1;

import java.util.ArrayList;

public class Dados {
    ArrayList<Contato> contatos = new ArrayList();
    
    //método para cadastrar contato
    public void cadastraContato(Contato contato){
        contatos.add(contato); //inserir um contato na lista
    }
    
    public String numeroDeContatos(){ 
        return contatos.size() + ""; //retornar na telinha a quantidade de contatos cadastrados
    }
}
