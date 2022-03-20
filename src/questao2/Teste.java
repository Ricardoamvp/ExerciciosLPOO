package questao2;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Ricardo", LocalDate.of(2002,10,07), 1.77);
        agenda.armazenaPessoa("Enzo", LocalDate.of(2002,04,23), 1.80);
        agenda.armazenaPessoa("Alex", LocalDate.of(2002,10,07), 1.77);
        agenda.armazenaPessoa("Marco", LocalDate.of(2002,04,23), 1.80);

        //agenda.removePessoa("Ricardo");

        int busca = agenda.buscaPessoa("Marco");
        System.out.println(busca == -1 ? "Não existe" : busca);

        agenda.imprimeAgenda();
        agenda.imprimeContato(2);

    }

}
