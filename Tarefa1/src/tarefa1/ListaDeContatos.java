package tarefa1;

import java.util.ArrayList;

public class ListaDeContatos {

    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList();
       
        //criando contatos 
        Contato contato = new Contato ("Giovanna","giovanna.figueirasilva@gmail.com","11932853997");
        Contato contato2 = new Contato ("Bianca","bianca.santos70@fatec.sp.gov.br","11951454836");
        Contato contato3 = new Contato ("Gabriel","gabriel.santos381@fatec.sp.gov.br","11994859435");
        Contato contato4 = new Contato ("Karoline","karoline.silva16@fatec.sp.gov.br","11941695884");
        
        //adicionar objeto
        contatos.add(contato);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);  
                
        //para cada contato, imprimir os dados
        for (Contato c : contatos){
            System.out.println(c);    
        }
        
        //dizer a quantidade de itens da lista 
        System.out.println("Há um total de " + contatos.size() + " contatos na lista");
    }
}
