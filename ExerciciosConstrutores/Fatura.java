package br.com.ftec.poo.exercicios.construtores;

public class Fatura {

	private int coditem, quantidade;
	private String descricao;
	private double precoUnitario;
	
	public Fatura(int coditem, int quantidade, String descricao, double precoUnitario) {
		this.coditem = coditem;
		
		if(quantidade < 0){this.quantidade = quantidade = 0;}
		else{this.quantidade = quantidade; }
		
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
	}
	
	public int getCoditem() {
		return coditem;
	}
	public void setCoditem(int coditem) {
		this.coditem = coditem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public double calcularTotalDaFatura(){
		double total = quantidade * precoUnitario;
		return total;
	}
}
