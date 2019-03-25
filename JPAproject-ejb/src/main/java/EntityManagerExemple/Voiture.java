package EntityManagerExemple;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Voiture
 *
 */
@Entity

public class Voiture implements Serializable {

	   
	@Id
	private int id;
	private String marque;
	private static final long serialVersionUID = 1L;
	//@ManyToOne
	//private Personnee personne ;
	
	
	public Voiture(int id, String marque) {
		super();
		this.id = id;
		this.marque = marque;
		//this.personne = personne;
	}
//	public Personnee getPersonne() {
//		return personne;
//	}
//	public void setPersonne(Personnee personne) {
//		this.personne = personne;
//	}
	public Voiture() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + "]";
	}
   
}
