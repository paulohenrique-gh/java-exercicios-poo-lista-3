package Exercicio2;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String nome, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public void exibirResumo() {
        System.out.println("Codigo do produto: " + this.getCodigo() + "\n" + this.getNome() + " | R$ " + this.getPreco());
    }
}
