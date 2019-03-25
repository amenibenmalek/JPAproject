package EntityManagerExemple;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personnee
 *
 */
@Entity

public class Personnee implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private String lastname ;
	private static final long serialVersionUID = 1L;
//	@OneToMany(mappedBy="personne")
//	private List<Voiture> voitures ;

	
	
	public Personnee(int id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
//	public List<Voiture> getVoitures() {
//		return voitures;
//	}
//	public void setVoitures(List<Voiture> voitures) {
//		this.voitures = voitures;
//	}
	public Personnee() {
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
   
}
