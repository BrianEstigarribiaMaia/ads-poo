package br.com.ftec.poo.exercicios.abstracao;

public class Assistente extends Funcionario{

	public Assistente(String nome, int codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
	}

	@Override
	double calcularSalario() {
		double salarioAssistente = salarioBase;
		return salarioAssistente;
	}

	public String toString(){
		String texto = "Nome: "+nome+ "\nCódigo:" +codigo+ "\nSalario Base: "+salarioBase;
		return texto;
	}
}
