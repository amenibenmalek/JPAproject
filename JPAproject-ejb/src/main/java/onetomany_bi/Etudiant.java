package onetomany_bi;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Etudiant
 *
 */
@Entity

public class Etudiant implements Serializable {

	   
	@Id
	private int Id;
	private String name;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private TravauxPratiques TP ;

	public Etudiant() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
