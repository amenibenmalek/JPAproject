package jpaproject;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Femme
 *
 */
@Entity

public class Femme extends Personne implements Serializable {

	   
	
	private String phoneNb;
	private static final long serialVersionUID = 1L;

	public Femme() {
		super();
	}   
	   
	public String getPhoneNb() {
		return this.phoneNb;
	}

	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}
   
}
