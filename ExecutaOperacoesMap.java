package br.com.ftec.poo.exercicios;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExecutaOperacoesMap {

	public static void main(String[] args) {
		Map<Integer, String> mapaDB = new LinkedHashMap<Integer, String>();
		mapaDB.put(1, "MySQL");
		mapaDB.put(3, "MSSQL");
		mapaDB.put(2, "Oracle");
		mapaDB.put(4, "MongoDB");
		
		/*entrySet() - Retorna um conjunto de Maps contido no mapa configurado,
		podendo ser possível acessar suas chaves e valores.*/
		System.out.println("Mostrando Chave-Valor dos elementos do Map: ");
		for(Map.Entry<Integer, String> entrada: mapaDB.entrySet()){
			System.out.println(entrada.getKey() + " "+entrada.getValue());
			
		}
		System.out.println("------------------------------------------------------");
		
		System.out.println("Quantidade de pares chave-valor no Map:" +mapaDB.size());
		System.out.println("------------------------------------------------------");
		
		System.out.println("Map Original :" +mapaDB);
		mapaDB.clear();
		System.out.println("Novo Map Sem elementos :" +mapaDB);
		System.out.println("------------------------------------------------------");
		
		System.out.println("Verifica se a Chave 1 existe no mapa");
		if(mapaDB.containsKey(1)){
			System.out.println("O Banco de dados com chave 1 está no mapa!");
		}else{
			System.out.println("O Banco de dados com chave 1 não está no mapa!");
		}
		System.out.println("------------------------------------------------------");
		
		mapaDB.put(4, "Redis");
		System.out.println("Verifica se o Valor Redis existe no mapa");
		if(mapaDB.containsValue("Redis")){
			System.out.println("O Banco de dados Redis está no mapa!");
		}else{
			System.out.println("O Banco de dados Redis não está no mapa!");
		}
		System.out.println(mapaDB);
		System.out.println("------------------------------------------------------");
	}
}
