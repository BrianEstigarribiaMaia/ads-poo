package br.com.ftec.poo.exercicios.enums;
/* Criar um enum para os dias da semana.
 * - No main exiba o dia (nome e número).
 * */
public enum Semana {

	domingo(1), segunda(2), terca(3), quarta(4), quinta(5), sexta(6), sabado(7);
	private int numero;
	
	Semana(int opcao){
		numero = opcao;
	}
	
	public int getNumero(){
		return numero;
	}
}
