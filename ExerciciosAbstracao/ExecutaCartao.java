package br.com.ftec.poo.exercicios.abstracao;

import java.util.ArrayList;

public class ExecutaCartao {

	public static void main(String[] args) {
		ArrayList<CartaoMensagem> cartoes = new ArrayList<CartaoMensagem>();
		
		DiaDosNamorados namorados = new DiaDosNamorados("Kévin");
		Natal natal = new Natal("Guilherme");
		Aniversario niver = new Aniversario("Carol");
		
		cartoes.add(namorados);
		cartoes.add(natal);
		cartoes.add(niver);
		
		for(CartaoMensagem card : cartoes){
			card.mostrarMensagem();
		}

	}

}
