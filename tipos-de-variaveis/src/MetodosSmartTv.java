public class MetodosSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
        }
    
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume aumentou para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume diminuiu para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O novo canal é: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("O canal foi alterado para: " + canal);
    }
    
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}