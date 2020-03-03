package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Formation")
public class Formation {
	
	@Id
	@GeneratedValue
	private int Id;
	@Column(name="thème_Formation")
	private String theme;
	
	
	@Override
	public String toString() {
		return "formation " + Id + " ==> thème = " + theme ;
	}


	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Formation( String theme) {
		super();
		this.theme = theme;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getTheme() {
		return theme;
	}


	public void setTheme(String theme) {
		this.theme = theme;
	}
	
}
