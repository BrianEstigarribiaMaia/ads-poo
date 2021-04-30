package br.com.ftec.poo.exercicios.abstracao;

public abstract class CartaoMensagem {

	private String destinatario;
	
	public CartaoMensagem(String nomeDestinatario) {
		this.destinatario = nomeDestinatario;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public abstract void mostrarMensagem();
}
