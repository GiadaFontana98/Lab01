package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {

	private List <String>parole;
	
			
	public Parole() {	
		parole = new LinkedList<>();   //L'arrayList ci mette più tempo alla LinkedList,quindi è più conveniente.(efficiente)
		
	}
	
	public void addParola(String p) {
	
		parole.add(p);
		
	}
	
	public List<String> getElenco() {
		 List<String>paroleOrd = new LinkedList<String>(parole);
			
	 Collections.sort((paroleOrd),String.CASE_INSENSITIVE_ORDER);
	 return paroleOrd;

	}
	
	public void reset() {
		parole.clear();
	}
   public void cancella(String p)
   {
	   parole.remove(p);
   }
   public void tempo ()
   {
	   
   }
}
