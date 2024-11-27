package subclasses;

import classes.Veiculo;
import interfaces.manutencao;

public class Carro extends Veiculo implements manutencao {
	private int numeroPortas;
	
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carro(String placa, int ano, int numeroPortas) {
		super(placa, ano);
		this.numeroPortas = numeroPortas;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	@Override
    public String realizarManutencao() {
        return "Manutenção do carro realizada.";
    }
	
	
	public double calcularValorSeguro() {
        double valorPorta = 50.8; // Supondo que a cada porta aumenta R$20,00 no valor do seguro
        double valorSeguro = getNumeroPortas() * valorPorta;
        return valorSeguro;
    }
	/*
	@Override
	public void exibirDetalhes() {
		System.out.println("Placa:"+getPlaca());
    	System.out.println("Ano:"+getAno());
	}*/
	
	

}
