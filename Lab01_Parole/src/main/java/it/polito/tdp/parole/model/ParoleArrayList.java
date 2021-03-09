package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParoleArrayList {
	
	
	private List<String> listaParole; 
	
	public ParoleArrayList() {
		listaParole = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		List<String> risultato = new ArrayList<String>(listaParole);
		Collections.sort(risultato);
		return risultato;
	}
	
	public void reset() {
		listaParole.clear();
	}
	
	public void removeParola(String s) {
		listaParole.remove(s);
	}
}
