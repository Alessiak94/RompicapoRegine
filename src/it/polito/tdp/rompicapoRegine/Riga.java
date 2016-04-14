package it.polito.tdp.rompicapoRegine;


public class Riga {
	
	private boolean haRegina;
	private int posizione;
	
	public Riga(){
		haRegina=false;
		posizione=-1;
		
	}
	
	public void setPosizioneRegine(int posizione){
		haRegina=true;
		this.posizione=posizione;
	}

	public int getPosizioneRegina(){
		return posizione;
	}
	
	public boolean haRegina(){
		return haRegina;
	}
	
	public void eliminaRegina(){
		posizione=-1;
		haRegina=false;
	}
	
}
