package br.com.ftec.poo.exercicios.abstracao;

public class Natal extends CartaoMensagem{

	public Natal(String nomeDestinatario) {
		super(nomeDestinatario);
	}

	@Override
	public void mostrarMensagem() {
		System.out.println("Feliz Natal "+getDestinatario());
	}

}
