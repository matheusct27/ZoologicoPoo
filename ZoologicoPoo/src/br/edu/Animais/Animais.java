package br.edu.Animais;

public abstract class Animais {
	protected String foto;
	protected String comida;
	protected boolean fome;
	protected double limites;
	protected String local;
	
	public abstract void fazerBarulho();
	public abstract void comer();
	public void dormir() {
		System.out.println("Zzz...");
	}
	public void vagar() {
		System.out.println("Vagando...");
		
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public boolean isFome() {
		return fome;
	}
	public void setFome(boolean fome) {
		this.fome = fome;
	}
	public double getLimites() {
		return limites;
	}
	public void setLimites(double limites) {
		this.limites = limites;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	

}
