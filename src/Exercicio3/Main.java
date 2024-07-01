package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Filme> filmes = new ArrayList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Exibir lista de filmes");
            System.out.println("2 - Cadastrar novo filme");
            System.out.println("3 - Sair");

            String opcao = scanner.nextLine();

            switch(opcao) {
                case "1":
                    listarFilmes(filmes);
                    break;
                case "2":
                    cadastrarFilme(scanner, filmes);
                    break;
                case "3":
                    flag = false;
            }
        }
    }

    public static void listarFilmes(List<Filme> filmes) {
        if (filmes.isEmpty()) {
            System.out.println("Você ainda não cadastrou nenhum filme");
        }

        for (Filme f : filmes) {
            f.mostrarDetalhes();
            System.out.println("===========");
        }
    }

    public static void cadastrarFilme(Scanner scanner, List<Filme> filmes) {
        System.out.println("Digite o nome do filme: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite o nome do diretor: ");
        String nomeDiretor = scanner.nextLine();
        System.out.println("Digite a categoria do filme: ");
        String categoria = scanner.nextLine();

        Filme filme = new Filme(titulo, nomeDiretor, categoria);
        filmes.add(filme);
    }
}
