package ManyToMany_bi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Technicien
 *
 */
@Entity

public class Technicien implements Serializable {

	@Id
	private int idTechnicien;
	private static final long serialVersionUID = 1L;
	@ManyToMany
	private List<Competence> competences ;

	public List<Competence> getCompetences() {
		return competences;
	}
	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}
	public Technicien() {
		super();
	}   
	public int getId() {
		return this.idTechnicien;
	}

	public void setId(int id) {
		this.idTechnicien = id;
	}
   
}
