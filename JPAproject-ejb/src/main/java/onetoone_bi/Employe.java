package onetoone_bi;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employe
 *
 */
@Entity

public class Employe implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Contact1 contact ;
	
	public Employe() {
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
   
}
