package Exercicio3;

public class Carros extends Veiculos {

    public Carros(Integer quantidadeRodas, Double pesoVeiculo, String cor, Integer ano, String marcaVeiculo, String modeloVeiculo, String tipoVeiculo, Double valorVendaVeiculo) {
        super(quantidadeRodas, pesoVeiculo, cor, ano, marcaVeiculo, modeloVeiculo, tipoVeiculo, valorVendaVeiculo);
    }
    public String toString() {
        return "\n---- Carro ---- \n\n"
                + super.toString();
    }
}