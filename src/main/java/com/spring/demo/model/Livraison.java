package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Generated;

@Entity
public class Livraison {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="type")
	private String type;
	@Column(name="adresse")
	private String adresse;
	@Column(name="prix")
	private String prix;
	
	
	
	public Livraison() {
		super();
	}
	public Livraison(int id, String type, String adresse, String prix) {
		super();
		this.id = id;
		this.type = type;
		this.adresse = adresse;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Livraison [id=" + id + ", type=" + type + ", adresse=" + adresse + ", prix=" + prix + "]";
	}
	
	
	
}
