package br.com.ftec.poo.aulas;

import java.util.Comparator;
import java.util.Map;

public class ComparaInteiros implements Comparator<Integer>{

	Map<Integer, String> base;
	
    public ComparaInteiros(Map<Integer,String> base) {
		this.base = base;
		
	}
	@Override
	public int compare(Integer o1, Integer o2) {
		return base.get(o1).compareTo(base.get(o2));
	}
	

	
}
