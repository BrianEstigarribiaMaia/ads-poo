package br.com.ftec.poo.exercicios.abstracao;

public class Vendedor extends Funcionario{
	
	private double comissao;
	
	public Vendedor(String nome, int codigo, double salarioBase, double comissao) {
		super(nome, codigo, salarioBase);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	double calcularSalario() {
		double salarioVendedor = comissao + salarioBase;
		return salarioVendedor;
	}
	
	public String toString(){
		String texto = "Nome: "+nome+ "\nCódigo:" +codigo+ "\nSalario Base: "+salarioBase;
		return texto;
	}

}
