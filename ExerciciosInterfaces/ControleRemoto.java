package br.com.ftec.poo.exercicios.interfaces;

public interface ControleRemoto {
	public void mudarCanal(int canal);
	public void aumentarVolume(int taxa);
	public void dimunuirVolume(int taxa);
	boolean ligar();
	boolean desligar();
}
