package br.com.ftec.poo.aulas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExecutaComparaInteiros {

	public static void main(String[] args) {
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		
		mapaNomes.put(1, "João");
		mapaNomes.put(2, "Paulo");
		mapaNomes.put(3, "Karla");
		
		Set<Entry<Integer, String>> set = mapaNomes.entrySet();
		Iterator it = set.iterator();
		
		System.out.println("Mostrando todos os valores e chaves \nChave \tValor");
		
		while(it.hasNext()){
			Entry<Integer, String> entry = (Entry)it.next();
			System.out.println(entry.getKey() + "\t"+ entry.getValue());
		}
		
		System.out.println("\nPosição 2 do Map : " + mapaNomes.get(2));
		
	}
}
