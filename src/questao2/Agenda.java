package questao2;

/*

 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void armazenaPessoa(String nome, LocalDate dataNasc, double altura){
        Pessoa pessoa = new Pessoa(nome, dataNasc, altura);
        contatos.add(pessoa);
        System.out.println(pessoa.getNome() + " foi adicionada a sua lista de contatos.");
    }

    public void removePessoa(String nome){
        for (int i = 0; i < contatos.size(); i++){
            Pessoa contato = contatos.get(i);
            if(contato.getNome().equals(nome)){
                contatos.remove(i);
                System.out.println(contato.getNome() + " foi removido da sua lista de contatos.");
            }
        }

    }

    //Tem que ser int e não void
    public void buscaPessoa(String nome){
        for(int i = 0; i < contatos.size(); i++){
            Pessoa contato = contatos.get(i);
            if(contato.getNome().equals(nome)){
                System.out.println(i);
            }

        }
    }



}
