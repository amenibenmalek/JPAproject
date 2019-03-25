package onetoone_uni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ecole
 *
 */
@Entity

public class Ecole implements Serializable {

	   
	@Id
	private int id;
	@OneToOne
	
	private Eleve eleve ;
	private static final long serialVersionUID = 1L;

	public Ecole() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
