package it.polito.tdp.parole.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Parole {
	
	private Map<String, String> listaParole; 
		
	public Parole() {
		listaParole = new TreeMap<String, String>();
	}
	
	public void addParola(String p) {
		listaParole.put(p.toLowerCase(), p);
	}
	
	public List<String> getElenco() {
		List<String> risultato = new LinkedList<String>(listaParole.values());
		return risultato;
	}
	
	public void reset() {
		listaParole.clear();
	}
	
	public void removeParola(String s) {
		listaParole.remove(s);
	}

}
