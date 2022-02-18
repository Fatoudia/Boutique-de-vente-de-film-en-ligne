package com.spring.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Generated;

@Entity
@Table(name = "commande")
public class Commande {

	@Id 
	@Column(name="id_commande",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCommande;
	@OneToOne
	@JoinColumn(name = "client")
	private Client client;
	@Column(name="dateCommande")
	private Date dateCommande;
	@Column(name="nombreCommande")
	private String nombreCommande;
	@OneToOne
	@JoinColumn(name = "livraison")
	private Livraison livraison;
//	@OneToMany(mappedBy = "id.commande")
//	private List detailsCommande;
//	
	
	
	public Commande() {
		super();
	}

	

	public Commande(int idCommande, Client client, Date dateCommande, String nombreCommande, Livraison livraison,
			List detailsCommande) {
		super();
		this.idCommande = idCommande;
		this.client = client;
		this.dateCommande = dateCommande;
		this.nombreCommande = nombreCommande;
		this.livraison = livraison;
//		this.detailsCommande = detailsCommande;
	}



//	public List getDetailsCommande() {
//		return detailsCommande;
//	}
//
//
//
//	public void setDetailsCommande(List detailsCommande) {
//		this.detailsCommande = detailsCommande;
//	}
//


	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getId() {
		return idCommande;
	}

	public void setId(int id) {
		this.idCommande = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getNombreCommande() {
		return nombreCommande;
	}

	public void setNombreCommande(String nombreCommande) {
		this.nombreCommande = nombreCommande;
	}

	public Livraison getLivraison() {
		return livraison;
	}

	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}

	@Override
	public String toString() {
		return "Commande [id=" + idCommande + ", client=" + client + ", dateCommande=" + dateCommande + ", nombreCommande="
				+ nombreCommande + ", livraison=" + livraison + "]";
	}
	
	
	
	
}
