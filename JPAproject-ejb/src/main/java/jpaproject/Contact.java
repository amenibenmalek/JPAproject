package jpaproject;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Contact
 *
 */
@Entity

public class Contact implements Serializable {

	@Id
	private int Id;
	private String Data;
	private static final long serialVersionUID = 1L;

	public Contact() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getData() {
		return this.Data;
	}

	public void setData(String Data) {
		this.Data = Data;
	}
   
}
