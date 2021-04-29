package br.com.ftec.poo.exercicios.polimorfismo;

public class ExecutaFuncionario {

	public static void main(String[] args) {
		Administrativo assistenteAdm = new Administrativo();
		assistenteAdm.setNome("Mario");
		assistenteAdm.setAdicionalNoturno(100);
		assistenteAdm.setMatricula(5556);
		
		assistenteAdm.exibirDados();
		
		Tecnico assistenteTec = new Tecnico();
		assistenteTec.setNome("Luigi");
		assistenteTec.setMatricula(4456);
		
		assistenteTec.exibirDados();
		
	}
}
