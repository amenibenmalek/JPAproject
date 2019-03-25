package onetomany_bi;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TravauxPratiques
 *
 */
@Entity
@Table(name = "T_TP")
public class TravauxPratiques implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TP_ID")
	private int tpId;
	@Column(name="TP_SUJET")
	private String tpSujet;
	@Column(name="TP_DUREE")
	private long tpDuree;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="TP")
	private List <Etudiant> Etudiants ;
	
	public TravauxPratiques() {
		super();
	}   
	public int getTpId() {
		return this.tpId;
	}

	public void setTpId(int tpId) {
		this.tpId = tpId;
	}   
	public String getTpSujet() {
		return this.tpSujet;
	}

	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}   
	public long getTpDuree() {
		return this.tpDuree;
	}

	public void setTpDuree(long tpDuree) {
		this.tpDuree = tpDuree;
	}
	public  List <Etudiant> getEtudiants() {
		return this.Etudiants;
	}

	public void setTpId(  List <Etudiant> Etudiants ) {
		this.Etudiants = Etudiants;
	} 
}
