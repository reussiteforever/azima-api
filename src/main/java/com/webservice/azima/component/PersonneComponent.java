package com.webservice.azima.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.webservice.azima.repositories.PersonneRepository;

@Component
public class PersonneComponent implements CommandLineRunner {
	
	private PersonneRepository personneRepo;

	public PersonneComponent(PersonneRepository personneRepo) {
		super();
		this.personneRepo = personneRepo;
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Personne personne = new Personne( "KATOH", "Komlavi David", new Date(), "A",
		 * "+", new Adresse("Lomé", "Maritime", "TOGO"), new
		 * Contact("katohdavid@gmail.com", "+22899463402"), false, new Date(), new
		 * Date());
		 */

		//this.personneRepo.deleteAll();
		//this.personneRepo.save(personne);
		//System.out.println("kglkgkllk");
		
	}

}
