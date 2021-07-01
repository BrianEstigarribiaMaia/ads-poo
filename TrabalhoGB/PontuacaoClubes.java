package br.com.ftec.poo.trabalhogb;

import java.util.Comparator;

public class PontuacaoClubes implements Comparator<Clube>{

	@Override
	public int compare(Clube c1, Clube c2) {
		if(c1.getPontos() < c2.getPontos()){
			return 1;
		} else if (c1.getPontos() > c2.getPontos()) {
			return -1;
		} else if (c1.getPontos() == c2.getPontos()) {
			if (c1.getVitorias() < c2.getVitorias()){
				return 1;
			} else if(c1.getVitorias() > c2.getVitorias()){
				return -1;
			} else if(c1.getVitorias() == c2.getVitorias()){
				if(c1.getSaldoDeGols() < c2.getSaldoDeGols()){
					return 1;
				} else if (c1.getSaldoDeGols() > c2.getSaldoDeGols()){
					return -1;
				} 
			}
		}
		return 0;
	}

}
