package onetoone_bi;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contact
 *
 */
@Entity

public class Contact1 implements Serializable {//class slaves 

	   
	@Id
	private int id;
	private String data;
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy = "contact")
	private Employe employe ;
	
	public Contact1() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}  
   
}
