package br.com.ftec.poo.exercicios.construtores;

public class ExecutaFatura {

	public static void main(String[] args) {
		Fatura fatura =  new Fatura(666, 5, "Paçoca", 1.25);
		
		System.out.println("TOTAL DA FATURA");
		System.out.println(fatura.calcularTotalDaFatura());
	}
	
}
