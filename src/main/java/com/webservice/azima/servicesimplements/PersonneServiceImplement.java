package com.webservice.azima.servicesimplements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.azima.entities.Personne;
import com.webservice.azima.exceptions.PersonneException;
import com.webservice.azima.repositories.PersonneRepository;
import com.webservice.azima.services.PersonneService;

@Service
public class PersonneServiceImplement implements PersonneService{

	@Autowired
	private PersonneRepository personneRepo;
	
	/**
	 * This method allow us to save persons
	 */
	@Override
	public void savePersonne(Personne personne) throws ConstraintViolationException, PersonneException {

		Optional<Personne> optionalPersonne=personneRepo.findByPersonneNomAndPersonnePrenom(
				personne.getPersonneNom(), 
				personne.getPersonnePrenom()
				);
		if(optionalPersonne.isPresent()) {
			throw new PersonneException(PersonneException.personneAlradyExistException());
		}else {
			personne.setCretedAt(new Date(System.currentTimeMillis()));
			personne.setIsdelete(false);
			personneRepo.save(personne);
		}
	}

	/**
	 * This method allow us to retrieve person with first and last name from database
	 */
	@Override
	public Personne findByPersonneNomAndPersonnePrenom(String personneNom, String personnePrenom)
			throws PersonneException {
		Optional<Personne> optionalPersonne=personneRepo.findByPersonneNomAndPersonnePrenom(
				personneNom, 
				personnePrenom
				);
		if(!optionalPersonne.isPresent()) {
			throw new PersonneException(PersonneException.personneNotFoundException(personneNom,personnePrenom));
		}else {
			return optionalPersonne.get();
		}
	}

	/**
	 * This method allow us to retrieve all persons from database
	 */
	@Override
	public List<Personne> findAll(){
		List<Personne> personnes=personneRepo.findAll();
		if(personnes.size()==0) {
			return new ArrayList<Personne>();
		}else {
			return personnes;
		}
	}

	/**
	 * This method allow us to retrieve person by id
	 */
	@Override
	public Personne findById(String id) throws PersonneException {
		Optional<Personne> optionalPersonne=personneRepo.findById(id);
		if(!optionalPersonne.isPresent()) {
			throw new PersonneException(PersonneException.personneNotFoundException(id));
		}else {
			return optionalPersonne.get();
		}
	}

	/**
	 * This method allow us to retrieve persons by id group
	 */
	@Override
	public List<Personne> findByGroupe(String groupe) {
		List<Personne> personnes=personneRepo.findByGroupe(groupe);
		if(personnes.size()==0) {
			return new ArrayList<Personne>();
		}else {
			return personnes;
		}
	}

	
	/**
	 * This method allow us to retrieve persons by reuses
	 */
	@Override
	public List<Personne> findByRhesus(Boolean rhesus) {
		List<Personne> personnes=personneRepo.findByRhesus(rhesus);
		if(personnes.size()==0) {
			return new ArrayList<Personne>();
		}else {
			return personnes;
		}
	}

	@Override
	public List<Personne> findByVille(String ville) {
		List<Personne> personnes=personneRepo.findByVille(ville);
		if(personnes.size()==0) {
			return new ArrayList<Personne>();
		}else {
			return personnes;
		}
	}

	@Override
	public List<Personne> findByPays(String pays) {
		List<Personne> personnes=personneRepo.findByPays(pays);
		if(personnes.size()==0) {
			return new ArrayList<Personne>();
		}else {
			return personnes;
		}
	}
	

}