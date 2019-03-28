package EntityManagerExempleService;

import java.util.List;

import javax.ejb.Remote;

import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;

@Remote
public interface ReclamationServiceRemote {
	public void addReclamation(Reclamation R);
	public void removeReclamation(Reclamation R);
	public List findByType(TypeReclamation  type);
	public Reclamation find(Reclamation R);

}
