package it.polito.tdp.rompicapoRegine;

import java.util.LinkedList;
import java.util.List;

public class Scacchiera {
	
	private List<Riga> righe;
	private int lato;
	
	public Scacchiera(int lato){
		this.lato=lato;
		righe= new LinkedList<Riga>(); 
		for(int i=0;i<lato;i++)
			righe.add(new Riga());
	
	}

	public Riga getRiga(int posizione){
		return righe.get(posizione);
	}

	public String stampaScacchiera(){
		String tot="";
		for(int i=0;i<lato;i++)
		{for(int j=0;j<lato;j++)
			{if(righe.get(i).haRegina()==true && righe.get(i).getPosizioneRegina()==j)
				tot+="W";
			else tot+="o";}
		 tot+="\n";
		}
			return tot;
			
	}

	
}