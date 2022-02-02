package com.webservice.azima.entities;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Adresse {
	
	@NotNull(message = "La vllle ne peut pas etre vide.")
	private String ville;
	
	@NotNull(message = "La région ne peut pas etre vide.")
	private String region;
	
	@NotNull(message = "Le pays ne peut pas etre vide.")
	private String pays;
	
	@NotNull(message = "La longitude ne peut pas etre vide.")
	private Double longitude;
	
	@NotNull(message = "La latitude ne peut pas etre vide.")
	private Double latitude;
	
	public Adresse(@NotNull(message = "La vllle ne peut pas etre vide.") String ville,
			@NotNull(message = "La région ne peut pas etre vide.") String region,
			@NotNull(message = "Le pays ne peut pas etre vide.") String pays,
			@NotNull(message = "La longitude ne peut pas etre vide.") Double longitude,
			@NotNull(message = "La latitude ne peut pas etre vide.") Double latitude) {
		super();
		this.ville = ville;
		this.region = region;
		this.pays = pays;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	
}