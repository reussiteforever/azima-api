package com.webservice.azima.services;

import java.util.List;

import javax.validation.ConstraintViolationException;

import com.webservice.azima.entities.Personne;
import com.webservice.azima.exceptions.PersonneException;

public interface PersonneService {

	/**
	 * Save person
	 * @param personne
	 * @throws ConstraintViolationException
	 * @throws PersonneException
	 */
	public void savePersonne(Personne personne) throws ConstraintViolationException,PersonneException;
	
	/**
	 * Retrieve persons by first and last name
	 * @param personneNom
	 * @param personnePrenom
	 * @return
	 * @throws PersonneException
	 */
	public Personne findByPersonneNomAndPersonnePrenom(String personneNom,String personnePrenom) throws PersonneException;
	
	/**
	 * Find all persons in database
	 * @return List<Personne>
	 */
	public List<Personne> findAll();
	
	/**
	 * Find by group
	 * @param groupe
	 * @return 
	 */
	public List<Personne> findByGroupe(String groupe);
	
	/** Find persons by group
	 * @param rhesus
	 * @return List<Personne>
	 */
	public List<Personne> findByRhesus(Boolean rhesus);
	
	/**
	 * Find person by id
	 * @param id
	 * @return
	 * @throws PersonneException
	 */
	public Personne findById(String id) throws PersonneException;
	
	public List<Personne> findByVille(String ville);
	
	public List<Personne> findByPays(String pays);
	
	
}
