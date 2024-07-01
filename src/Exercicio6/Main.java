package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular("Motorola", "G445", 64);

        celular.exibirInformacoes();

        System.out.println("=============");

        System.out.println("Instalando YouTube...");
        celular.instalarAplicativo("YouTube");
        System.out.println("Instalando WhatsApp...");
        celular.instalarAplicativo("WhatsApp");
        System.out.println("Instalando Spotify...");
        celular.instalarAplicativo("Spotify");

        System.out.println("=============");

        celular.exibirInformacoes();
    }
}
