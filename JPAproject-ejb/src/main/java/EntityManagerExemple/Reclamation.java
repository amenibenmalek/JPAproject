package EntityManagerExemple;


import java.util.Date;

import javax.persistence.*;




/**
 * Entity implementation class for Entity: Reclamation
 *
 */

@Entity
public class Reclamation{


	@Id
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_reclamation")
	private Date date_reclamation;
	@Column(name="description")
	private String description;
	@Enumerated(EnumType.STRING)
	@Column(name="type")
	private TypeReclamation type ;
	@Column(name="users_id")
	private int idp ;
	private static final long serialVersionUID = 1L;

	public Reclamation() {
		super();
	}   
	
	
	public Reclamation(int id ,Date date_reclamation, String description, TypeReclamation type, int users) {
		super();
		this.id = id ;
		this.date_reclamation = date_reclamation;
		this.description = description;
		this.type = type;
		this.idp = users;
	}


	


	
	public int getIdp() {
		return idp;
	}


	public void setIdp(int idp) {
		this.idp = idp;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public TypeReclamation getType() {
		return type;
	}


	public void setType(TypeReclamation type) {
		this.type = type;
	}


	
	
   
}

	 