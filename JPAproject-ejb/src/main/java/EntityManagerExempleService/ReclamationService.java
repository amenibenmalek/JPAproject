package EntityManagerExempleService;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;

/**
 * Session Bean implementation class ReclamationService
 */
@Stateless
@LocalBean
public class ReclamationService implements ReclamationServiceRemote, ReclamationServiceLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName="JPAproject-ejb")
	EntityManager em;
	
    public ReclamationService() {
        // TODO Auto-generated constructor stub
    }

    @Override
	public void addReclamation(Reclamation R) {
		// TODO Auto-generated method 
    	
		em.persist(R);
		
	}

	@Override
	public void removeReclamation(Reclamation R) {
		// TODO Auto-generated method stub
		if (em.contains(R)){
		     em.remove(R);
		}
		else 
			System.out.println("Reclamation inexistante");
		
	}

	@Override
	public List findByType(TypeReclamation type) {
		// TODO Auto-generated method stub
		return em.createQuery(
			    "SELECT c FROM Reclamation c WHERE c.type = :Rtype")
			    .setParameter("Rtype",type )
			    .getResultList();
	}

	@Override
	public Reclamation find(Reclamation R) {
		// TODO Auto-generated method stub
		return  em.find(Reclamation.class, R) ;
	}


}
