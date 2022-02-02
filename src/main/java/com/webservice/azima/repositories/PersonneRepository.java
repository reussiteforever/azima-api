package com.webservice.azima.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.webservice.azima.entities.Personne;

@Repository
public interface PersonneRepository extends MongoRepository<Personne, String>{

	@Query("{'id':?0,'isdelete':false}")
	Optional<Personne> findById(String id);
	
	/**
	 * Request to find persons by blood group
	 * @param groupe
	 * @return
	 */
	@Query("{'groupe':{$regex : '^?0$', $options: 'i'},"
			+ "'isdelete':false}")
	List<Personne> findByGroupe(String groupe);
	
	/**
	 * Request to find persons by reuses
	 * @param rhesus
	 * @return
	 */
	@Query("{'rhesus':?0,"
			+ "'isdelete':false}")
	List<Personne> findByRhesus(Boolean rhesus);
	
	/**
	 * Request to find persons by first and last name
	 * @param personneNom
	 * @param personnePrenom
	 * @return
	 */
	@Query("{'personneNom':{$regex : '^?0$', $options: 'i'}, "
			+ "'personnePrenom':{$regex : '^?1$', $options: 'i'}, "
			+ "'isdelete':false}")
	Optional<Personne> findByPersonneNomAndPersonnePrenom(String personneNom,String personnePrenom);
	
	/**
	 * Request to find all persons
	 */
	@Query("{'isdelete':false}")
	List<Personne> findAll();
	
	@Query("{'adresse.ville':{$regex : '^?0$', $options: 'i'}"
			+ "}")
	List<Personne> findByVille(String ville);
	
	@Query("{'adresse.pays':{$regex : '^?0$', $options: 'i'}"
			+ "}")
	List<Personne> findByPays(String pays);
	
}
