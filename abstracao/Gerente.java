package br.com.ftec.poo.exercicios.abstracao;

public class Gerente extends Funcionario{

	public Gerente(String nome, int codigo, double salarioBase) {
		super(nome, codigo, salarioBase);
	}

	@Override
	double calcularSalario() {
		double salarioGerente = salarioBase * 2;
		return salarioGerente;
	}

	public String toString(){
		String texto = "Nome: "+nome+ "\nCódigo:" +codigo+ "\nSalario Base: "+salarioBase;
		return texto;
	}
}
