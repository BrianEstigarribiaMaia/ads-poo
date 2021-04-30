package br.com.ftec.poo.exercicios.abstracao;

public class Aniversario extends CartaoMensagem{

	public Aniversario(String nomeDestinatario) {
		super(nomeDestinatario);
	}

	@Override
	public void mostrarMensagem() {
		System.out.println("Feliz aniversário "+getDestinatario());
		
	}

}
