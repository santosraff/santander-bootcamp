public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Métodos da interface AparelhoTelefonico:");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar();
        System.out.println("---");

        System.out.println("Métodos da interface NavegadorInternet");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println("---");

        System.out.println("Métodos da interface ReprodutorMusica");
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();
        System.out.println("---");
    }
}
