package Exercicio5;

public class Casa {
    private String endereco;
    private int numQuartos;
    private double area;
    private double valor;

    public Casa(String endereco, int numQuartos, double area, double valor) {
        this.endereco = endereco;
        this.numQuartos = numQuartos;
        this.area = area;
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularValorImposto() {
        return this.getValor() * 0.002;
    }

    public void exibirDetalhes() {
        System.out.println("Endereco: " + this.getEndereco() + "\nNúmero de quartos: " + this.getNumQuartos() +
                "\nÁrea: " + this.getArea() + "\nValor: " + this.getValor());
    }
}
