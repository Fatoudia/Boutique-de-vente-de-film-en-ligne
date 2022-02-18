package com.spring.demo.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity 
@Table(name = "user") 
@Data
public class User implements Serializable { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private int id;
@Column(name="password")
private String password;
@Column(name="nom")
private String userName;
@Column(name="prenom")
private String prenom;
@Column(name="email")
private String email;

@ManyToMany(cascade={CascadeType.PERSIST, CascadeType. REMOVE},fetch = FetchType.EAGER) 
private List <Role> roles = new ArrayList<Role>(); 
// + getters & setters + addRole & removeRolefetch =  FetchType.EAGER 



}
