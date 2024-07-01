package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Celular {
    private String marca;
    private String modelo;
    private int armazenamentoEmGb;
    private List<String> aplicativosInstalados;

    public Celular(String marca, String modelo, int armazenamentoEmGb) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamentoEmGb = armazenamentoEmGb;
        this.aplicativosInstalados = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamentoEmGb() {
        return armazenamentoEmGb;
    }

    public void setArmazenamentoEmGb(int armazenamentoEmGb) {
        this.armazenamentoEmGb = armazenamentoEmGb;
    }

    public List<String> getAplicativosInstalados() {
        return this.aplicativosInstalados;
    }

    public void setAplicativosInstalados(List<String> aplicativosInstalados) {
        this.aplicativosInstalados = aplicativosInstalados;
    }

    public void instalarAplicativo(String aplicativo) {
        if (this.aplicativosInstalados.contains(aplicativo)) {
            return;
        }

        this.aplicativosInstalados.add(aplicativo);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nArmazenamento: " + this.getArmazenamentoEmGb() + "GB");
        this.exibirAplicativosInstalados();
    }

    private void exibirAplicativosInstalados() {
        System.out.println("Aplicativos instalados: ");

        if (this.getAplicativosInstalados().isEmpty()) {
            System.out.println("Nenhum aplicativo instalado");
        }

        for (String aplicativo : this.aplicativosInstalados) {
            System.out.println("- " + aplicativo);
        }
    }
}
