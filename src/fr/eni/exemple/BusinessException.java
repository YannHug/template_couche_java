package fr.eni.exemple;

import java.util.ArrayList;
import java.util.List;

public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private List<String> listeMessages = new ArrayList<>();

	public List<String> getListeMessages() {
		return listeMessages;
	}
	
	public void ajouterErreur(String message) {
		listeMessages.add(message);
	}
	
	public boolean hasErreur() {
		return !listeMessages.isEmpty();
	}
	
}
