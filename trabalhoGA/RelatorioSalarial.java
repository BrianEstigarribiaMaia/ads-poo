package br.com.ftec.poo.trabalhoga;

public class RelatorioSalarial {

	private double somatorioSalario = 0;
	
	public void registrarSalario(Funcionario funcionario){
		somatorioSalario += funcionario.salarioMensal();
	}
	
	public double getSomatorioSalario(){
		return somatorioSalario;
	}
	
}
