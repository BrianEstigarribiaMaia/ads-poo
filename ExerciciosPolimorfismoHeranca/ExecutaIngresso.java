package br.com.ftec.poo.exercicios.polimorfismo;

import java.util.Scanner;

public class ExecutaIngresso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao;
		do{
			System.out.println("Digite o tipo de Ingresso que deseja 1 - VIP, 2 - NORMAL");
			opcao = ler.nextInt();
			if(opcao > 2){
				System.out.println("Opção Invalida! Escolha Entre 1 e 2");
			}else if(opcao < 0){
				System.out.println("Opção Invalida! Somente aceita numeros positivos.");
			}else{
				switch(opcao){
				case 1:
					Vip vip = new Vip();
					System.out.println("Digite a quantidade: ");
					int qtVip = ler.nextInt();
					System.out.println(vip.calcularTotalVip(qtVip));
					vip.imprimirTipo();
					break;	
				case 2:
					Normal normal = new Normal();
					System.out.println("Digite a quantidade: ");
					int qtNormal = ler.nextInt();
					System.out.println(normal.valorTotalNormal(qtNormal));
					normal.imprimirTipo();
					break;
				}
			}
		}while(opcao != 0);
		ler.close();
	}
}
