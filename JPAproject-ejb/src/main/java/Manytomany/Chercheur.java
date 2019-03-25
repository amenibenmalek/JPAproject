package Manytomany;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import onetomany_uni.Employee;

/**
 * Entity implementation class for Entity: Chercheur
 *
 */
@Entity

public class Chercheur extends Employee implements Serializable {

	
	private int idChercheur;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="chercheur")
	private List<Tache> taches ;

	public Chercheur() {
		super();
	}   
	public int getId() {
		return this.idChercheur;
	}

	public void setId(int id) {
		this.idChercheur = id;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
   
}
