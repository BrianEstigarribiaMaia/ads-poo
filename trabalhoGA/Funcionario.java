package br.com.ftec.poo.trabalhoga;

public class Funcionario {

	protected String nome, cracha;
	protected double salario, dissidioAnunal;
	
	public Funcionario(String nome, String cracha, double salario, double dissidioAnunal) {
		this.nome = nome;
		this.cracha = cracha;
		this.salario = salario;
		this.dissidioAnunal = dissidioAnunal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCracha() {
		return cracha;
	}

	public void setCracha(String cracha) {
		this.cracha = cracha;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getDissidioAnunal() {
		return dissidioAnunal;
	}

	public void setDissidioAnunal(double dissidioAnunal) {
		this.dissidioAnunal = dissidioAnunal;
	}
	
	public double salarioMensal() {
		double salarioMes = this.salario + this.dissidioAnunal;
		return salarioMes;
	}
	
	
}
