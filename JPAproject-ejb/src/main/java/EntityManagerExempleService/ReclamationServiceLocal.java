package EntityManagerExempleService;

import java.util.List;

import javax.ejb.Local;

import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;

@Local
public interface ReclamationServiceLocal {
	public void addReclamation(Reclamation R);
	public void removeReclamation(Reclamation R);
	public List findByType(TypeReclamation type);
	public Reclamation find(Reclamation R);
}
