package br.com.ftec.poo.exercicios;

import java.util.Scanner;

public class ExecutaManipuladorDeArquivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o arquivo a ser renomeado:\n");
		String caminhoDoArquivo = ler.nextLine();
		
		System.out.println("Informe o novo nome do arquivo: \n");
		String novoNome = ler.nextLine();
		
		ManipuladorDeArquivos.renomearArquivo(caminhoDoArquivo, novoNome);
		ler.close();
		
		

	}

}
