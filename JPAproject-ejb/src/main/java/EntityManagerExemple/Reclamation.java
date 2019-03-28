package EntityManagerExemple;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;





/**
 * Entity implementation class for Entity: Reclamation
 *
 */

@Entity

public class Reclamation implements Serializable {


	@Id
	private int id;
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_reclamation")
	private Date date_reclamation;
	
	@Column(name="description")
	private String description;
	
	@Column(name="type")
	private TypeReclamation  type ; 
	
	@ManyToOne
	private Personnee users;
	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}   
	
	
	public Reclamation(int id ,Date date_reclamation, String description, TypeReclamation  type, Personnee users) {
		super();
		this.id = id ;
		this.date_reclamation = date_reclamation;
		this.description = description;
		this.type = type;
		this.users = users;
	}


	public Personnee getUsers() {
		return users;
	}


	public void setUsers(Personnee users) {
		this.users = users;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate_reclamation() {
		return date_reclamation;
	}
	public void setDate_reclamation(Date date_reclamation) {
		this.date_reclamation = date_reclamation;
	}
	@Override
	public String toString() {
		return "Reclamation [id=" + id + ", date_reclamation=" + date_reclamation + ", description=" + description
				+ ", type=" + type + ", users=" + users + "]";
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public TypeReclamation getType() {
		return type;
	}


	public void setType(TypeReclamation  type) {
		this.type = type;
	}


	
	
   
}

	 