package br.com.ftec.poo.aulas;

public class Conta {

	private String agencia;
	private int numero;
	private double saldo;
	
	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	
	void deposita(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
