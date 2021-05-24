package br.com.ftec.poo.trabalhoga.teste;

public class TesteSoftwareRH {

	public static void main(String[] args) {
		RelatorioSalarial relatorio = new RelatorioSalarial();
		
		Testador testador =  new Testador("João", "TES3434", 2000, 100);
		relatorio.registrarSalario(testador);
		System.out.println("Salario do testador: "+ testador.salarioMensal());
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Patricia", "DEV9888", 6000, 300);
		relatorio.registrarSalario(desenvolvedor);
		System.out.println("Salario do desenvolvedor: "+ desenvolvedor.salarioMensal());
		
		Gerente gerente = new Gerente("Felipe","GER1010", 10000, 500, 50);
		relatorio.registrarSalario(gerente);
		System.out.println("Salario do gerente: "+ gerente.salarioMensal());
		
		Secretaria secretaria = new Secretaria("Marcelo", "SEC1000", 1500,90);
		relatorio.registrarSalario(secretaria);
		System.out.println("Salario do secretario: "+ secretaria.salarioMensal());
		
		Tesoureiro tesoureiro = new Tesoureiro("Diogo", "TES4999", 5000, 50);
		relatorio.registrarSalario(tesoureiro);
		System.out.println("Salario do tesoureiro: "+ tesoureiro.salarioMensal());

		System.out.println("Valor total de salários é " + relatorio.getSomatorioSalario() );
	}

}
