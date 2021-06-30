package br.com.ftec.poo.trabalhogb;

public class Clube implements Comparable<Clube>{
	private int pontos, vitorias, saldoDeGols;
	private String nome;
	
	public Clube(int pontos, int vitorias, int saldoDeGols, String nome) {
		super();
		this.pontos = pontos;
		this.vitorias = vitorias;
		this.saldoDeGols = saldoDeGols;
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getSaldoDeGols() {
		return saldoDeGols;
	}

	public void setSaldoDeGols(int saldoDeGols) {
		this.saldoDeGols = saldoDeGols;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override 
	public int compareTo(Clube outroClube){
		int valorComparacao = 0;
		
		if(this.getPontos() > outroClube.getPontos()){
			valorComparacao = - 1;
		}else if(this.getPontos() < outroClube.getPontos()){
			valorComparacao = 1;
		}else{
			if(this.getVitorias() > outroClube.getVitorias()){
				valorComparacao = - 1;
			}else if(this.getVitorias() < outroClube.getVitorias()){
				valorComparacao = 1;
			}else{
				if(this.getSaldoDeGols() > outroClube.getSaldoDeGols()){
					valorComparacao = - 1;
				}else if(this.getSaldoDeGols() < outroClube.getSaldoDeGols()){
					valorComparacao = 1;
				}
			}
		}
		return valorComparacao;
	}
}
