package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Eduardo", 23, 1.75, 79);

        pessoa.mostrarInformacoes();

        System.out.println("=========");

        System.out.println("\nEngordou 2 kg\n");
        pessoa.engordar(2);
        pessoa.mostrarInformacoes();

        System.out.println("=========");

        System.out.println("\nEmagreceu 1 kg\n");
        pessoa.emagrecer(1);
        pessoa.mostrarInformacoes();

        System.out.println("=========");

        System.out.println("\nEnvelheceu 5 anos\n");
        pessoa.envelhecer(5);
        pessoa.mostrarInformacoes();
    }
}
