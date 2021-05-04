package br.com.ftec.poo.exercicios.construtores;

public class ExecutaEmpregado {

	public static void main(String[] args) {
		Empregado emp = new Empregado("Paula", "Tejando", 2000);
		
		System.out.println("DADOS DO EMPREGADO");
		System.out.println(emp);
		System.out.println("Aumento de 10% de salário: "+emp.aumentarSalario());


	}

}
