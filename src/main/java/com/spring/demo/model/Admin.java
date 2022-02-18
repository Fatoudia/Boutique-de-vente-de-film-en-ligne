package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.spring.demo.security.User;

import lombok.Generated;

@Entity
//@Bean(name="EntityManagerFactory")
public class Admin {
	
	@Id
	@Column(name="id_admin",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int idAdmin;
	
	 @OneToOne
	 @JoinColumn(name = "id_users")
	 private User user;
	
	
	
	public Admin() {
		super();
	}

	public Admin(int idAdmin, User user) {
		super();
		this.idAdmin = idAdmin;
		this.user = user;
	}

	public int getId() {
		return idAdmin;
	}

	public void setId(int id) {
		this.idAdmin = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Admin [id=" + idAdmin + ", user=" + user + "]";
	}

	

}
