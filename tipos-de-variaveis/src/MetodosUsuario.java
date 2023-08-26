public class MetodosUsuario {
    public static void main(String[] args) throws Exception{
        MetodosSmartTv Tv = new MetodosSmartTv();

        Tv.aumentarVolume();
        Tv.aumentarVolume();
        Tv.aumentarCanal();
        Tv.aumentarCanal();

        System.out.println("A TV está ligada ? " + Tv.ligada);
        System.out.println("Em qual canal a TV está ? " + Tv.canal);
        System.out.println("Em que volume está a TV ? " + Tv.volume);

        Tv.ligar();
        System.out.println("A TV foi ligada ? " + Tv.ligada);

        Tv.desligar();
        System.out.println("A TV foi desligada ? " + Tv.ligada);

        Tv.mudarCanal(6);
        System.out.println("Novo canal: " + Tv.canal);
    }
}