package subclasses;

import classes.Veiculo;
import interfaces.manutencao;

public class Moto extends Veiculo implements manutencao {
	private int cilindrada;
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Moto(String placa, int ano, int cilindrada) {
		super(placa, ano);
		this.cilindrada = cilindrada;
	}
	@Override
    public String realizarManutencao() {
        return "Manutenção da moto realizada.";
    }
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public double calcularValorSeguro() {
        double valorCilindrada = 0.8; // Supondo que a cada porta aumenta R$2,00 no valor do seguro
        double valorSeguro = getCilindrada() * valorCilindrada;
        return valorSeguro;
    }
	
	

}
