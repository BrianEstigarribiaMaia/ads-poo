package br.com.ftec.poo.exercicos.polimorfismo;

public class Administrativo extends Assistentes{

	private String turnoDia = "Dia", turnoNoite = "Noite";
	private double adicionalNoturno;
	
	public String getTurnoDia() {
		return turnoDia;
	}
	public void setTurnoDia(String turnoDia) {
		this.turnoDia = turnoDia;
	}
	public String getTurnoNoite() {
		return turnoNoite;
	}
	public void setTurnoNoite(String turnoNoite) {
		this.turnoNoite = turnoNoite;
	}
	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}
	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	@Override
	public void exibirDados(){
		System.out.println("Matricula: "+super.getMatricula());
		System.out.println("Nome: "+super.getNome());
	}
}
