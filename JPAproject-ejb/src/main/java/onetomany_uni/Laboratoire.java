package onetomany_uni;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Laboratoire
 *
 */
@Entity

public class Laboratoire implements Serializable {

	   
	@Id
	private int id;
	@OneToMany
	private List<Employee> employes ;
	private static final long serialVersionUID = 1L;

	public Laboratoire() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<Employee> getEmployes() {
		return this.employes;
	}

	public void setId(List<Employee> employes) {
		this.employes = employes;
	}
   
}
