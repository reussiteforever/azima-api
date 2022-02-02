package com.webservice.azima.exceptions;

public class PersonneException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonneException(String message) {
		super(message);
	}
	
	public static String personneNotFoundException(String id) {
		return "L'identifient "+id+" est introuvable.";
	}
	
	public static String personneNotFoundException(String nom,String prenom) {
		return "M./Mlle "+nom+" "+prenom+" est introuvable.";
	}
	
	public static String personnesNotFoundException() {
		return "La liste des personnes est vide.";
	}
	
	public static String personneAlradyExistException() {
		return "Cette personne existe déjà.";
	}

}
