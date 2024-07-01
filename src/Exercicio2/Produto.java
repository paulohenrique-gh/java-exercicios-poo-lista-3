package Exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }

    public void atualizarEstoque() {
        if (this.quantidadeEmEstoque <= 0) {
            System.out.println("Produto fora de estoque");
            return;
        }

        this.setQuantidadeEmEstoque(this.getQuantidadeEmEstoque() - 1);
        System.out.println("Compra efetuada com sucesso");
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome() + "\nPreço: " + this.getPreco() + "\nQuantidade: " + this.getQuantidadeEmEstoque());
    }
}
