package ManyToMany_bi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competence
 *
 */
@Entity

public class Competence implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;
	@ManyToMany
	private List<Technicien>techniciens ;
	

	public List<Technicien> getTechniciens() {
		return techniciens;
	}
	public void setTechniciens(List<Technicien> techniciens) {
		this.techniciens = techniciens;
	}
	public Competence() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
