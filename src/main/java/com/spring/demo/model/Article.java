package com.spring.demo.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@Entity
@Table(name = "article")
public class Article {

	@Id 
    @Column(name="id_article",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArticle;
	@Column(name="libelle")
	private String libelle;
	@Column(name="nombre")
	private int nombre;
	@Column(name="quantite")
	private String quantite;
	@Column(name="description")
	private String description;
	@Column(name="image")
	private String image;
	
	
//	@OneToMany(mappedBy = "id.article")
//	private DetailsCommande detailsCommande;
	public Article() {
		super();
	}
	public Article(int idArticle, String libelle, int nombre, String quantite, String description, String image) {
		super();
		this.idArticle = idArticle;
		this.libelle = libelle;
		this.nombre = nombre;
		this.quantite = quantite;
		this.description = description;
		this.image = image;
	}
	public int getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(int id) {
		this.idArticle = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Article [id=" + idArticle + ", libelle=" + libelle + ", nombre=" + nombre + ", quantite=" + quantite
				+ ", description=" + description + ", image=" + image + "]";
	}
	
	
	
	
}
