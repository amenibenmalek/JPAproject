package jpaproject;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Homme
 *
 */
@Entity

public class Homme extends Personne implements Serializable {

	   
	
	private String code;
	private static final long serialVersionUID = 1L;

	public Homme() {
		super();
	}   
	

	   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
   
}
