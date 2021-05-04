package br.com.ftec.poo.exercicios.abstracao;

public class DiaDosNamorados extends CartaoMensagem{

	public DiaDosNamorados(String nomeDestinatario) {
		super(nomeDestinatario);
	}

	@Override
	public void mostrarMensagem() {
		System.out.println("Feliz dia dos namorados "+getDestinatario());
	}

}
