package br.com.ftec.poo.aulas;

public class Cao {

	public String nome, corDosOlhos;
	public int peso, quantidadeDePatas;
	
	/*public Cao(String nome){
		this.nome = nome;
	}*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorDosOlhos() {
		return corDosOlhos;
	}
	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getQuantidadeDePatas() {
		return quantidadeDePatas;
	}
	public void setQuantidadeDePatas(int quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}
	
	public void latir(){
		if (this.peso >= 15){
			System.out.println("Woof, Woof!");
		}else{
			System.out.println("Au, Au!");
		}
	}

}
