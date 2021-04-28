package br.com.ftec.poo.exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ManipuladorDeArquivos {

	public static void renomearArquivo(String caminhdoDoArquivo, String novoNome){
		File arquivoDeOrigem = new File(caminhdoDoArquivo);
		File arquivoDeDestino = new File(arquivoDeOrigem.getParent() + "\\" + novoNome);
		
		arquivoDeOrigem.renameTo(arquivoDeDestino);
	
	}
	
	public static void ExibirCaminhoDoArquivo(String caminhdoDoArquivo){
		File arquivo = new File(caminhdoDoArquivo);
		System.out.println("Conteudo do diretório: ");
		String diretorio [] = arquivo.list();
		
		for(String item: diretorio){
			System.out.printf("%s", item);
		}
	}

	public static void excluirArquivo(String caminhdoDoArquivoExcluido){
		File arquivo = new File(caminhdoDoArquivoExcluido);
		arquivo.delete();
	}
	
	public static void mostrarConteudoDoArquivo(String caminhdoDoArquivo) throws IOException{
		InputStream is = new FileInputStream(caminhdoDoArquivo);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String nome =  br.readLine();
		while(nome != null){
			System.out.println(nome);
			nome = br.readLine();
		}
		br.close();
	}
}
