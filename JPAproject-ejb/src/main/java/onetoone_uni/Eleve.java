package onetoone_uni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Eleve
 *
 */
@Entity

public class Eleve implements Serializable {

	   
	@Id
	private int id;
	private static final long serialVersionUID = 1L;

	public Eleve() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
