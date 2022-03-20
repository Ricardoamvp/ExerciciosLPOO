package questao3;

public class Teste {

    public static void main(String[] args) {


        Televisao televisao = new Televisao();
        ControleRemoto cr = new ControleRemoto(televisao);

        System.out.println(televisao.getCanal());
        System.out.println(televisao.getVolume());

        cr.aumentarCanal();
        cr.aumentarSom();
        System.out.println("\n" + cr.consultarCanal());
        System.out.println(cr.consultarVolume());

        cr.diminuirCanal();
        cr.diminuirSom();
        System.out.println("\n" + cr.consultarCanal());
        System.out.println(cr.consultarVolume());

        cr.trocarCanal(30);
        System.out.println("\n" + cr.consultarCanal());
        cr.trocarCanal(0);


    }

}
