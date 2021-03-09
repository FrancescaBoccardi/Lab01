package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ParoleLinkedList {
	
	private List<String> listaParole; 
	
	public ParoleLinkedList() {
		listaParole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		List<String> risultato = new LinkedList<String>(listaParole);
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
