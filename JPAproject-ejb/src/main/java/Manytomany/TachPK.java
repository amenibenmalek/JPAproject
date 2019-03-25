package Manytomany;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TachPK
 *
 */

@Embeddable
public class TachPK implements Serializable {

	
	private int idChercheur;
	private int idProjet;
	private String nom;
	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idChercheur;
		result = prime * result + idProjet;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TachPK other = (TachPK) obj;
		if (idChercheur != other.idChercheur)
			return false;
		if (idProjet != other.idProjet)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}



	public TachPK() {
		super();
	}   
	public int getIdChercheur() {
		return this.idChercheur;
	}

	public void setIdChercheur(int idChercheur) {
		this.idChercheur = idChercheur;
	}   
	public int getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
   
}
