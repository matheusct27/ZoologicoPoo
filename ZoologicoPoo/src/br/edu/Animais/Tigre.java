package br.edu.Animais;

public class Tigre extends Felino
{

	
	public void fazerBarulho() {
		System.out.println("GRRRRRRR");
		
	}

	
	public void comer() {
		System.out.println("Comendo" + comida + "...");
		fome = false;
		
	}

}
