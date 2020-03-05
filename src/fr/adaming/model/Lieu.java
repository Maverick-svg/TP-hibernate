package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lieu")
public class Lieu {

	@Id
	@GeneratedValue
	private int idLieu;
	@Column(name="Adresse")
	private String adresseLieu;
	@Column(name="ville")
	private String villeLieu;
	
	
	
	public Lieu( String adresseLieu, String villeLieu) {
		super();
		this.adresseLieu = adresseLieu;
		this.villeLieu = villeLieu;
		
	}

	public Lieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(int idLieu) {
		this.idLieu = idLieu;
	}

	public String getAdresseLieu() {
		return adresseLieu;
	}

	public void setAdresseLieu(String adresseLieu) {
		this.adresseLieu = adresseLieu;
	}

	public String getVilleLieu() {
		return villeLieu;
	}

	public void setVilleLieu(String villeLieu) {
		this.villeLieu = villeLieu;
	}

	@Override
	public String toString() {
		return " situé au " + adresseLieu + " dans la ville de " + villeLieu + "(ID lieu = " +idLieu+ ") .";
	}
	
	
	
}
