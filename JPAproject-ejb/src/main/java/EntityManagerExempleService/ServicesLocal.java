package EntityManagerExempleService;

import java.util.List;

import javax.ejb.Local;

import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;
import EntityManagerExemple.Voiture;

@Local
public interface ServicesLocal {

	public void add(Voiture voiture) ;
	public void delete(int id);
	//public List<Voiture> findAll();
	public List findAll();
	public List findByMarque(String marque);
	public void addReclamation(Reclamation R);
	public void removeReclamation(Reclamation R);
	public List findByType(TypeReclamation type);

}
