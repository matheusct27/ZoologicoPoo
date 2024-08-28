package br.edu.Animais;

public class Cachorro extends Felino{

	
	public void fazerBarulho() {
		System.out.println("AU AUUU");
		
	}

	
	public void comer() {
		System.out.println("Comendo" + comida + "...");
		fome = false;
	}

}
