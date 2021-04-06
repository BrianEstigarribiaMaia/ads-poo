package br.com.ftec.poo.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutaConta {

	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setSaldo(500);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setSaldo(700);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setSaldo(400);
		
		List<ContaPoupanca> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Collections.sort(contas);
		for(ContaPoupanca contaPoupanca: contas){
			System.out.println(contaPoupanca.getSaldo());
		}
	}
}
