package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.spring.demo.security.User;

import lombok.Generated;

@Entity
public class Client {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="adresse")
	private String adresse;
	@Column(name="telephone")
	private String telephone;
	@OneToOne
	@JoinColumn(name = "id_users", referencedColumnName = "id")
	private User user;
	
	
	
	public Client() {
		super();
	}

	public Client(int id, String adresse, String telephone, User user) {
		super();
		this.id = id;
		this.adresse = adresse;
		this.telephone = telephone;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Livraison [id=" + id + ", adresse=" + adresse + ", telephone=" + telephone + ", user=" + user + "]";
	}
	
	
}
