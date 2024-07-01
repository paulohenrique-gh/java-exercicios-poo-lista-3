package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua das Flores, 22", 4, 800, 150000);

        casa.exibirDetalhes();
        System.out.println("Calculando imposto...");
        double imposto = casa.calcularValorImposto();
        System.out.println("Imposto calculado: " + imposto);
    }
}
