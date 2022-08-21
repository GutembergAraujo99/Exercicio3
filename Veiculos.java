package Exercicio3;

public class Veiculos {
    public Integer quantidadeRodas;
    public Double pesoVeiculo;
    public String cor;
    public Integer ano;
    public String marcaVeiculo;
    public String modeloVeiculo;
    public Double valorVendaVeiculo;
    public String novoUsado;

    public Veiculos(Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String novoUsado, Double valorVendaVeiculo) {
        this.quantidadeRodas = quantidadeRodas;
        this.pesoVeiculo = pesoVeiculo;
        this.cor = cor;
        this.ano = ano;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.novoUsado = novoUsado;
        this.valorVendaVeiculo = valorVendaVeiculo;
    }

    public String toString() {
        return "Marca: " + getMarcaVeiculo()
                + "\nModelo: " + getModeloVeiculo()
                + "\nPreço: " + getvalorVendaVeiculo() + "00 Mil Reais"
                + "\nAno: " + getAno()
                + "\nTipo de veículo: " + getNovoUsado()
                + "\nCor: " + getCor()
                + "\nPeso do veículo: " + getpesoVeiculo()
                + "\nQuantidade de rodas: " + getQuantidadeRodas()
                + "\nNovo/Usado: " + getNovoUsado();

    }

    public Integer getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public Double getpesoVeiculo() {
        return pesoVeiculo;
    }

    public void setpesoVeiculo(Double pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }


    public Double getvalorVendaVeiculo() {
        return valorVendaVeiculo;
    }

    public void setvalorVendaVeiculo(Double valorVendaVeiculo) {
        this.valorVendaVeiculo = valorVendaVeiculo;
    }

    public String getNovoUsado() {
        return novoUsado;
    }

    public void setNovoUsado(String novoUsado) {
        this.novoUsado = novoUsado;
    }
}
