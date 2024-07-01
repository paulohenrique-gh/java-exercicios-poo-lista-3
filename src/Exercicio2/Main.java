package Exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto mesa = new Produto(1, "Mesa", 150, 2);
        Produto cadeira = new Produto(2, "Cadeira", 70, 8);
        Produto toalha = new Produto(3, "Toalha", 30, 10);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(mesa);
        produtos.add(cadeira);
        produtos.add(toalha);

        boolean flag = true;
        while (flag) {
            imprimirMenu();

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    exibirProdutos(produtos);
                    break;
                case "2":
                    comprarProduto(scanner, produtos);
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void imprimirMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Exibir produtos");
        System.out.println("2 - Comprar produtos");
        System.out.println("3 - Sair");
}

    private static void exibirProdutos(List<Produto> produtos) {
        for (Produto produto : produtos) {
            produto.exibirDetalhes();
            System.out.println("=============");
        }
    }

    private static void comprarProduto(Scanner scanner, List<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto.getQuantidadeEmEstoque() > 0) {
                produto.exibirResumo();
                System.out.println("=============");
            }
        }

        System.out.println("\nInforme o código do produto que deseja comprar: ");

        try {
            int codigo = Integer.parseInt(scanner.nextLine());

            Produto produto = produtos.get(codigo - 1);

            if (produto != null) {
                produto.atualizarEstoque();
            }
        } catch (NumberFormatException e) {
            System.out.println("Código inválido");
        }
    }
}
