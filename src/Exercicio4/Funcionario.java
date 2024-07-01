package Exercicio4;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.getNome() + "\nCargo: " + this.getCargo() +
                "\nSalário: " + this.getSalario() + "\nDepartamento: " + this.getDepartamento());
    }

    public void promover(String novoCargo, double novoSalario, String novoDepartamento) {
        this.setCargo(novoCargo);
        this.setSalario(novoSalario);
        this.setDepartamento(novoDepartamento);
    }
}
