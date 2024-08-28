package br.edu.Animais;

public class Gato extends Felino{

	
	public void fazerBarulho() {
		System.out.println("Miauuuu");
		
	}

	
	public void comer() {
		System.out.println("Comendo" + comida + "...");
		fome = false;
		
	}

}
