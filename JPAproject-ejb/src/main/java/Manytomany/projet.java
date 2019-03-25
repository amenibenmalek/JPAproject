package Manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: projet
 *
 */
@Entity

public class projet implements Serializable {

	   
	@Id
	private int id;
	@Temporal(TemporalType.DATE)//if i want date type in sql not Datetime
	private Date Deadline ;
	@OneToMany(mappedBy="projet")
	private List<Tache>taches;
	@Transient //pour dire que cet attribut ne doit pas apparaitre dans la base 
	private int duree;
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}

	private static final long serialVersionUID = 1L;

	public projet() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
