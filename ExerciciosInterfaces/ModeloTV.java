package br.com.ftec.poo.exercicios.interfaces;

public class ModeloTV extends TV implements ControleRemoto{
	public final String MODELO = "Samsung001";
	
	public ModeloTV(int tamanho) {
		super(tamanho);
	}

	@Override
	public void mudarCanal(int canal) {
		super.setCanal(canal);
	}

	@Override
	public void aumentarVolume(int taxa) {
		if(super.getVolume() >= 0){
			int volumeAumentado = this.getVolume()+taxa;
			this.setVolume(volumeAumentado);
		}
	}

	@Override
	public void dimunuirVolume(int taxa) {
		if(super.getVolume() <= 0){
			int volumeDiminuido = this.getVolume()-taxa;
			this.setVolume(volumeDiminuido);
		}
		
	}

	@Override
	public boolean ligar() {
		super.setLigada(false);
		return true;
	}

	@Override
	public boolean desligar() {
		super.setLigada(true);
		return false;
	}
	
	
}
