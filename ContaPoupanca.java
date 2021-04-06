package br.com.ftec.poo.aulas;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.getSaldo() < o.getSaldo()){
			return -1;
		}
		
		if(this.getSaldo() > o.getSaldo()){
			return 1;
		}
		
		return 0;
	}

}
