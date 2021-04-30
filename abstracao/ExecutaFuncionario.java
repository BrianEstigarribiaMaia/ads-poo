package br.com.ftec.poo.exercicios.abstracao;

import java.util.Scanner;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
				
		System.out.print("Digite o nome do gerente: \n");
		String nomeGerente = ler.next();
		System.out.println("Digite o código do gerente: ");
		int codigoGerente = ler.nextInt();
		System.out.println("Digite o salario base do gerente: ");
		double salarioBaseGerente = ler.nextDouble();
		Gerente gerente = new Gerente(nomeGerente, codigoGerente, salarioBaseGerente);
		
		System.out.println("DADOS DO GERENTE");
		System.out.println(gerente);
		System.out.println("Salario final: "+gerente.calcularSalario());
		System.out.println("---------------------------------------------------");
		
		System.out.println("Digite o nome do assistente: ");
		String nomeAssistente = ler.next();
		System.out.println("Digite o código do assistente: ");
		int codigoAssistente = ler.nextInt();
		System.out.println("Digite o salario base do assistente: ");
		double salarioBaseAssistente = ler.nextDouble();
		Assistente assistente = new Assistente(nomeAssistente, codigoAssistente, salarioBaseAssistente);
		
		System.out.println("DADOS DO ASSISTENTE");
		System.out.println(assistente);
		System.out.println("Salario final: "+assistente.calcularSalario());
		System.out.println("---------------------------------------------------");
		
		System.out.println("Digite o nome do assistente: ");
		String nomeVendedor = ler.next();
		System.out.println("Digite o código do assistente: ");
		int codigoVendedor = ler.nextInt();
		System.out.println("Digite o salario base do assistente: ");
		double salarioBaseVendedor = ler.nextDouble();
		System.out.println("Digite o salario base do assistente: ");
		double comissaoVendedor = ler.nextDouble();
		Vendedor vendedor = new Vendedor(nomeVendedor, codigoVendedor,salarioBaseVendedor, comissaoVendedor);
		
		System.out.println("DADOS DO VENDEDOR");
		System.out.println(vendedor);
		System.out.println("Salario final: "+vendedor.calcularSalario());
		System.out.println("---------------------------------------------------");
		
		ler.close();
	}

}
