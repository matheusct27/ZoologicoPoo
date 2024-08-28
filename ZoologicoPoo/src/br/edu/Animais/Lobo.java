package br.edu.Animais;

public class Lobo extends Canino{


	public void fazerBarulho() {
		System.out.println("AUUUUUUUUUUUUUUUUUU");
		
	}

	
	public void comer() {
		System.out.println("Comendo" + comida + "...");
		fome = false;
		
	}

}
