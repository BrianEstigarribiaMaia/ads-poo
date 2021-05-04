package br.com.ftec.poo.exercicios.abstracao;

public abstract class Funcionario {
	
	protected String nome;
	protected int codigo;
	protected double salarioBase;
	
	public Funcionario(String nome, int codigo, double salarioBase) {
		this.nome = nome;
		this.codigo = codigo;
		this.salarioBase = salarioBase;
	}
	
	abstract double calcularSalario();
}
