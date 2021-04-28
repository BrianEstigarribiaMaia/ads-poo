package br.com.ftec.poo.aulas;

public class ContaCorrente{

	public double saldo;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public int compareTo(ContaCorrente outra){
		if(this.saldo < outra.saldo){
			return -1;
		}
		
		if(this.saldo > outra.saldo){
			return 1;
		}
		
		return 0;
	}
}
