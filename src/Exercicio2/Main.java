package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto mesa = new Produto("Mesa", 150, 10 );

        mesa.exibirDetalhes();

        for (int i = 0; i < 15; i++) {
            System.out.println("Comprando produto...");
            mesa.atualizarEstoque();
            mesa.exibirDetalhes();
            System.out.println("================");
        }
    }
}
