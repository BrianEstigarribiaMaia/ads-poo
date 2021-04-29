package br.com.ftec.poo.exercicios.polimorfismo;

public class Tecnico extends Assistentes{

	private double bonusSalarial;

	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	
	@Override
	public void exibirDados(){
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Nome: "+super.getNome());
	}
}
