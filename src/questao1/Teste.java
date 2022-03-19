package questao1;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Ricardo", LocalDate.of(2002,10,07), 1.77);

        eu.info();
        System.out.println(eu.idade());

    }

}
