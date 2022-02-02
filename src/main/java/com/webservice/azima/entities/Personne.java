package com.webservice.azima.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Personnes")
public class Personne {
	
	//################################
		//Methods
	//################################
	
	@Id
	private String id;
	
	@NotNull(message = "Le nom ne peut pas etre vide.")
	private String personneNom;
	
	@NotNull(message = "Le(s) prénom(s) ne peut/peuvent pas etre vide.")
	private String personnePrenom;
	
	@NotNull(message = "La date de naissance ne peut pas etre vide.")
	private Date dateNaiss;
	
	@NotNull(message = "Le nom ne peut pas etre vide.")
	private String groupe;
	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	@NotNull(message = "Le rhesus ne peut pas etre vide.")
	private boolean rhesus;
	
	@NotNull(message = "Le contact ne peut pas etre vide.")
	private Contact contact;
	
	@NotNull(message = "L'adresse ne peut pas etre vide.")
	private Adresse adresse;
	
	@NotNull(message = "Le mot de passe ne peut pas etre vide.")
	private String personnePassword;
	
	@NotNull(message = "Le mot de passe ne peut pas etre vide.")
	private String personneLogin;
	
	
	private Boolean isdelete;
	private Date cretedAt;
	private Date updtedAt;
	
	public Personne() {
		super();
	}
	
	//################################
		//Constructors
	//################################

	public Personne(@NotNull(message = "Le nom ne peut pas etre vide.") String personneNom,
			@NotNull(message = "Le(s) prénom(s) ne peut/peuvent pas etre vide.") String personnePrenom,
			@NotNull(message = "La date de naissance ne peut pas etre vide.") Date dateNaiss,
			@NotNull(message = "Le nom ne peut pas etre vide.") String groupe,
			@NotNull(message = "Le rhesus ne peut pas etre vide.") Boolean rhesus,
			@NotNull(message = "Le contact ne peut pas etre vide.") Contact contact,
			@NotNull(message = "L'adresse ne peut pas etre vide.") Adresse adresse,
			@NotNull(message = "Le mot de passe ne peut pas etre vide.") String personnePassword,
			@NotNull(message = "Le mot de passe ne peut pas etre vide.") String personneLogin, Boolean isdelete,
			Date cretedAt, Date updtedAt) {
		super();
		this.personneNom = personneNom;
		this.personnePrenom = personnePrenom;
		this.dateNaiss = dateNaiss;
		this.groupe = groupe;
		this.rhesus = rhesus;
		this.contact = contact;
		this.adresse = adresse;
		this.personnePassword = personnePassword;
		this.personneLogin = personneLogin;
		this.isdelete = isdelete;
		this.cretedAt = cretedAt;
		this.updtedAt = updtedAt;
	}
	
	//################################
		//Getters and Setters
	//################################

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonneNom() {
		return personneNom;
	}

	public void setPersonneNom(String personneNom) {
		this.personneNom = personneNom;
	}

	public String getPersonnePrenom() {
		return personnePrenom;
	}

	public void setPersonnePrenom(String personnePrenom) {
		this.personnePrenom = personnePrenom;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public boolean getRhesus() {
		return rhesus;
	}

	public void setRhesus(Boolean rhesus) {
		this.rhesus = rhesus;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Boolean getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Boolean isdelete) {
		this.isdelete = isdelete;
	}

	public Date getCretedAt() {
		return cretedAt;
	}

	public void setCretedAt(Date cretedAt) {
		this.cretedAt = cretedAt;
	}

	public Date getUpdtedAt() {
		return updtedAt;
	}

	public void setUpdtedAt(Date updtedAt) {
		this.updtedAt = updtedAt;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getPersonnePassword() {
		return personnePassword;
	}

	public void setPersonnePassword(String personnePassword) {
		this.personnePassword = personnePassword;
	}

	public String getPersonneLogin() {
		return personneLogin;
	}

	public void setPersonneLogin(String personneLogin) {
		this.personneLogin = personneLogin;
	}
	
}
