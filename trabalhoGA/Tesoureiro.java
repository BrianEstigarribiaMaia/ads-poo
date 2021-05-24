package br.com.ftec.poo.trabalhoga;

public class Tesoureiro extends Funcionario implements Autenticavel{

	private String senha;
	
	public Tesoureiro(String nome, String cracha, double salario, double dissidioAnunal) {
		super(nome, cracha, salario, dissidioAnunal);
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha == senha;
	}

	@Override
	public String pegarSehha() {
		return senha;
	}
	
}
