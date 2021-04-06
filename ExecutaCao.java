package br.com.ftec.poo.aulas;

public class ExecutaCao {

	public static void main(String[] args) {
		Cao cao1 = new Cao();
		cao1.nome = ("Curica"); 
		cao1.corDosOlhos = "marrom";
		cao1.peso = 12;
		cao1.quantidadeDePatas = 4;
		System.out.println(cao1.nome);
		cao1.latir();
	
		Cao cao2 = new Cao();
		cao2.nome = "Neguinha";
		cao2.corDosOlhos = "preto";
		cao2.peso = 15;
		cao2.quantidadeDePatas = 4;
		System.out.println(cao2.nome);
		cao2.latir();
	}

}
