package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetailsCommande {

	@EmbeddedId
	private ArticleCommandePK id;
	
	

	public DetailsCommande() {
		super();
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_article", insertable = false, updatable = false)
	private Article article;

	// bi-directional many-to-one association to FournisseurDepartement
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_commande", insertable = false, updatable = false)
	private Commande commande;

	@Column(name = "quantite")
	private int quantite;
//	

//	public int getId() {
//		return id;
//	}
//
//
//
//	public void setId(int id) {
//		this.id = id;
//	}

	
	public DetailsCommande(ArticleCommandePK id, Article article, Commande commande, int quantite) {
		super();
		this.id = id;
		this.article = article;
		this.commande = commande;
		this.quantite = quantite;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "DetailsCommande [id=" + id + ", quantite=" + quantite + "]";
	}

}
