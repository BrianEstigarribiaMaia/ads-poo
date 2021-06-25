package br.com.ftec.poo.exercicios.interfaces;

public class TesteTV {

	public static void main(String[] args) {
		ModeloTV tv = new ModeloTV(50);
		tv.aumentarVolume(10);
		tv.dimunuirVolume(5);
		tv.setCanal(155);
		System.out.println(tv);
	}

}
