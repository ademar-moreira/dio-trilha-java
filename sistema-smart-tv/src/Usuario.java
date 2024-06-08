public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Novo canal: " + smartTv.canal);

        System.out.println("Novo volume: " + smartTv.volume);


        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo estatus => TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo estatus => TV Ligada? " + smartTv.ligada);

    }
}
