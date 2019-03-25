package jpaproject;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity
@Inheritance (strategy=InheritanceType.JOINED)
public class Personne implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private String adresse;
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Contact contact ;	
	
	public Contact getContact() {
		return contact ;
	}
	public void SetContact(Contact contact){
		this.contact = contact ;
	}

	public Personne() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
   
}
