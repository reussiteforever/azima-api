package com.webservice.azima.controller;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.azima.entities.Personne;
import com.webservice.azima.exceptions.PersonneException;
import com.webservice.azima.services.PersonneService;

@RestController
@RequestMapping("azima_project/apiV1/")
public class PersonneController {
	
	//################################
	//Attributes
	//################################
	
	@Autowired
	private PersonneService personneService;
	
	
	//################################
	//Methods
	//################################
	
	/**
	 * This is the controller point through witch we can save persons
	 * @param personne
	 * @return
	 */
	@PostMapping("persons")
	public ResponseEntity<?> savePersonne(@RequestBody Personne personne){
		try {
			personneService.savePersonne(personne);
			return new ResponseEntity<Personne>(personne, HttpStatus.OK);
		} catch (ConstraintViolationException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
		} catch (PersonneException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	/**
	 * This is the controller point through witch we can retrieve persons by first and last name
	 * @param personneNom
	 * @param personnePrenom
	 * @return
	 */
	@GetMapping("persons")
	public ResponseEntity<?> getByPersonneNomAndPersonnePrenom(@RequestParam String personneNom,@RequestParam String personnePrenom){
		try {
			Personne personne=personneService.findByPersonneNomAndPersonnePrenom(personneNom, personnePrenom);
			return new ResponseEntity<Personne>(personne, HttpStatus.OK);
		} catch (PersonneException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * Get person by id
	 * @param id
	 * @return
	 */
	@GetMapping("persons/getById")
	public ResponseEntity<?> getById(@RequestParam String id){
		try {
			Personne personne=personneService.findById(id);
			return new ResponseEntity<Personne>(personne, HttpStatus.OK);
		} catch (PersonneException e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * Get All persons from database
	 * @return
	 */
	@GetMapping("persons/getAll")
	public ResponseEntity<?> getAll(){
		List<Personne> personnes=personneService.findAll();
		return new ResponseEntity<>(personnes,personnes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("persons/getByGroupe")
	public ResponseEntity<?> getByGroupe(@RequestParam String groupe){
		List<Personne> personnes=personneService.findByGroupe(groupe);
		return new ResponseEntity<>(personnes,personnes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("persons/getByRhesus")
	public ResponseEntity<?> getByRhesus(@RequestParam Boolean rhesus){
		List<Personne> personnes=personneService.findByRhesus(rhesus);
		return new ResponseEntity<>(personnes,personnes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("persons/getByVille")
	public ResponseEntity<?> getByVille(@RequestParam String ville){
		List<Personne> personnes=personneService.findByVille(ville);
		return new ResponseEntity<>(personnes,personnes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("persons/getByPays")
	public ResponseEntity<?> getByPays(@RequestParam String pays){
		List<Personne> personnes=personneService.findByPays(pays);
		return new ResponseEntity<>(personnes,personnes.size()>0 ? HttpStatus.OK:HttpStatus.NOT_FOUND);
	}
	
	
}