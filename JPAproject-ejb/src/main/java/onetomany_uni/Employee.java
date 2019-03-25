package onetomany_uni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employe
 *
 */
@Entity

public class Employee implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
