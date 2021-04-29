package br.com.ftec.poo.exercicios.polimorfismo;

public class Funcionario {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibirDados(){
		System.out.println("Dados do Funcioário");
	}
}
