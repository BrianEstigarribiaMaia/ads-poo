package br.com.ftec.poo.exercicos.polimorfismo;

public class Assistentes extends Funcionario{
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void exibirDados(){
		System.out.println("Matricula: "+matricula);
		System.out.println("Nome"+super.getNome());
	}
	
}
