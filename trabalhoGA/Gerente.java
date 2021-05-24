package br.com.ftec.poo.trabalhoga;

public class Gerente extends Funcionario implements Autenticavel{

	private String senha;
	private double bonus;
	
	public Gerente(String nome, String cracha, double salario, double dissidioAnunal, double bonus) {
		super(nome, cracha, salario, dissidioAnunal);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double salarioMensal() {
		double salarioMensal = super.salarioMensal();
		return salarioMensal + ((100 * bonus) / salarioMensal);
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
