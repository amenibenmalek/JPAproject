package Manytomany;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tache
 *
 */
@Entity

public class Tache implements Serializable {
	
	@EmbeddedId
	private TachPK tachePK ;
	@ManyToOne
	@JoinColumn(name ="idprojet" , referencedColumnName="id" ,insertable=false ,updatable=false)
	private projet projet ;
	@ManyToOne
	@JoinColumn(name ="idchercheur", referencedColumnName="idChercheur",insertable=false ,updatable=false)
	private Chercheur chercheur;
	
	public TachPK getTachePK() {
		return tachePK;
	}

	public void setTachePK(TachPK tachePK) {
		this.tachePK = tachePK;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	private int duree;
	
	
	public projet getProjet() {
		return projet;
	}

	public void setProjet(projet projet) {
		this.projet = projet;
	}

	public Chercheur getChercheur() {
		return chercheur;
	}

	public void setChercheur(Chercheur chercheur) {
		this.chercheur = chercheur;
	}

	private static final long serialVersionUID = 1L;

	public Tache() {
		super();
	}
   
}
