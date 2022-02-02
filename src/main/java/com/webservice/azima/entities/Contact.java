package com.webservice.azima.entities;

import javax.validation.constraints.NotNull;

public class Contact {
	
	@NotNull(message = "L'email ne peut pas etre vide.")
	private String email;
	
	@NotNull(message = "Le numéro de téléphone ne peut pas etre vide.")
	private String telephone;

	public Contact(@NotNull(message = "L'email ne peut pas etre vide.") String email,
			@NotNull(message = "Le numéro de téléphone ne peut pas etre vide.") String telephone) {
		super();
		this.email = email;
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
