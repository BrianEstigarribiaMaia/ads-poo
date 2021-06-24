package br.com.ftec.poo.exercicios.enums;

public class TesteSemana {
	
	public static void main(String[] args) {
		for(Semana op:Semana.values()){
			System.out.println("nome: " +op+ " numero: " +op.getNumero()+"\n");
		}
	}
	
}
