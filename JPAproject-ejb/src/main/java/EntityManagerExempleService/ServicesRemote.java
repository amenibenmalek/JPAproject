package EntityManagerExempleService;

import java.util.List;

import javax.ejb.Remote;

import EntityManagerExemple.*;


@Remote
public interface ServicesRemote {
	
	public void add(Voiture voiture) ;
	public void delete(int id);
	public void addReclamation(Reclamation R);
	public void removeReclamation(Reclamation R);
	public List findByType(TypeReclamation type);
    //public List<Voiture> findAll();
	public List findAll();
	public List findByMarque(String marque);
	
}
