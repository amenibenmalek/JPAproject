package EntityManagerExempleService;

import java.util.List;

import javax.ejb.Remote;

import EntityManagerExemple.Voiture;

@Remote
public interface ServicesRemote {
	
	public void add(Voiture voiture) ;
	public void delete(int id);
    //public List<Voiture> findAll();
	public List findAll();
	public List findByMarque(String marque);
	
}
