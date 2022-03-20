package questao3;

public class ControleRemoto {

    private Televisao tv;

    public ControleRemoto(Televisao tv){
        this.tv = tv;
    }

    public void aumentarSom() {
        if(tv.getVolume()+1 > 100){
            System.out.println("Volume Máximo");
        } else {
            tv.setVolume(tv.getVolume() + 1);
        }
    }

    public void diminuirSom() {
        if(tv.getVolume() - 1 < 0){
            System.out.println("Já está no mudo");
        } else {
            tv.setVolume(tv.getVolume() - 1);
        }
    }

    public void aumentarCanal() {
        tv.setCanal(tv.getCanal() + 1);
    }

    public void diminuirCanal() {
        if(tv.getCanal() - 1 <= 0){
            System.out.println("Canal Inexistente");
        } else {
            tv.setCanal(tv.getCanal() - 1);
        }
    }

    public void trocarCanal(int canal) {
        if(canal <= 0){
            System.out.println("Este canal não existe");
        } else {
            tv.setCanal(canal);
        }
    }

    public int consultarVolume(){
        return tv.getVolume();
    }

    public int consultarCanal() {
        return tv.getCanal();
    }


}
