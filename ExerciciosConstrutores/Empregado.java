package br.com.ftec.poo.exercicios.construtores;

public class Empregado {
	
	private String nome, sobrenome;
	private double salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if(salario < 0){this.salario = salario = 0;}
		else{this.salario = salario;}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentarSalario(){
		 double salarioAumentado = this.getSalario() + salario * 0.10; 
		 return salarioAumentado;
	}
	
	public String toString(){
		String texto = "Nome: "+nome+ "\nSobrenome: "+sobrenome+ "\nSalario: "+salario;
		return texto;
	}
}
