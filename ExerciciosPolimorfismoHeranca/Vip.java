package br.com.ftec.poo.exercicos.polimorfismo;

public class Vip extends Ingresso{

	private double valorAdicional = 60;
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public void imprimirTipo() {
		System.out.println("Ingresso Vip");
	}
	
	public double calcularTotalVip(int qt){
		double total = qt * (valorAdicional + super.getValor());
		return total;
	}
}
