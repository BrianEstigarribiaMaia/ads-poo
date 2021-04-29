package br.com.ftec.poo.exercicios.polimorfismo;

public class Normal extends Ingresso{

	public double valorTotalNormal(int qtIng){
		double total = qtIng * this.getValor();
		return total;
	}
	
	@Override
	public void imprimirTipo() {
		System.out.println("Ingresso Normal");
	}
}
