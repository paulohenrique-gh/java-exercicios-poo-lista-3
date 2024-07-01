package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Martins", "Assistente", 2000, "RH");

        funcionario.exibirDetalhes();
        System.out.println("===========");

        System.out.println("Promovendo funcionário...");
        funcionario.promover("Analista", 3500, "TI");
        System.out.println("Funcionário promovido!");

        System.out.println("===========");
        funcionario.exibirDetalhes();
    }
}
