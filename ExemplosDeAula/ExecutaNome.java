package br.com.ftec.poo.aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutaNome {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Luke");
		lista.add("Shiwie");
		lista.add("Leia");
		System.out.println(lista);
	
		Collections.sort(lista);
		System.out.println(lista);
	}
}
