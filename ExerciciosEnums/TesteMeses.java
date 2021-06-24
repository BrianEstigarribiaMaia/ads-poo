package br.com.ftec.poo.exercicios.enums;

public class TesteMeses {

	public static void main(String[] args) {
		Meses atual = Meses.jun;
		Meses aniversario = Meses.dez;
		
		System.out.println("Mes atual: "+atual.name());
		System.out.println("Mes aniversário: "+aniversario.name());
	}
}
