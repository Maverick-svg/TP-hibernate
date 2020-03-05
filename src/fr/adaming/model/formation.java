package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Formation")
public class Formation {
	
	@Id
	@GeneratedValue
	private int IdFormation;
	@Column(name="thème")
	private String theme;
	@JoinColumn(name="idLieu")
	@ManyToOne
	private Lieu lieu;
	
	public int getIdFormation() {
		return IdFormation;
	}


	public void setIdFormation(int idFormation) {
		IdFormation = idFormation;
	}


	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}


	@Override
	public String toString() {
		return " la formation possède l'ID : " + IdFormation + " / elle à le thème = " + theme + " / " +lieu;
	}


	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Formation( String theme, Lieu lieu) {
		super();
		this.theme = theme;
		this.lieu = lieu;
	}


	public int getId() {
		return IdFormation;
	}


	public void setId(int IdFormation) {
		this.IdFormation= IdFormation;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}
	
}
