package it.polito.tdp.rompicapoRegine;

public class Ricerca {

	private int lato;
	private int soluzioni;
	
	public void completaScacchiera(int lato){
		Scacchiera sc= new Scacchiera(lato);
		this.lato=lato;
		soluzioni=0;
		int fatto=0;
		ricercaRegine(sc, fatto);
		System.out.println("Soluzioni: "+soluzioni);
		
	}
	
	private void ricercaRegine(Scacchiera sc, int fatto){
		
		if(fatto==lato){
			System.out.println("Trovata soluzione");
			System.out.println(""+sc.stampaScacchiera());
			soluzioni++;
		
		}
		else{
			for(int i=0;i<lato; i++)
				if(controllo(sc,fatto,i)==true){
					sc.getRiga(fatto).setPosizioneRegine(i);
					ricercaRegine(sc,fatto+1);
					sc.getRiga(fatto).eliminaRegina();
				}
			
		}
		
	}
	
	private boolean controllo(Scacchiera sc, int fatto, int colonna){
		if(sc.getRiga(fatto).haRegina()==true)
			return false;
		
		for (int i=0;i<lato;i++){
			if( sc.getRiga(i).getPosizioneRegina()==colonna)
				return false;
		}
		
		for(int i=1;i<=fatto;i++){
			if(sc.getRiga(fatto-i).getPosizioneRegina()==(colonna-i)||sc.getRiga(fatto-i).getPosizioneRegina()==(colonna+i))
				return false;			
		}
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		Ricerca r= new Ricerca();
		r.completaScacchiera(8);
	}

}