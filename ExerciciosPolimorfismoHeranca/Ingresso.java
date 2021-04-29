package br.com.ftec.poo.exercicos.polimorfismo;

public class Ingresso {

	private double valor = 100;
	private int quantidade;
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void imprimirTipo(){
		System.out.println("Valor do ingresso");
	}
	
}
