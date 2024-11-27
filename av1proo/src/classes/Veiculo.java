package classes;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public abstract class Veiculo {
    private String placa;
    private int ano; 
    
    public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}

	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPlaca(String placa) {
    	this.placa = placa;
    }
    
    public String getPlaca() {
    	return this.placa;
    }
    
    public void Assegurar(String placa){
        System.out.println("Placa: "+placa);
    }
    
    public abstract double calcularValorSeguro();
    
    public void exibirDetalhes() {
    	System.out.println("----------- Informações sobre o Veiculo ------------");
    	System.out.println("Placa:"+getPlaca());
    	System.out.println("Ano:"+getAno());
    	
    }
}
