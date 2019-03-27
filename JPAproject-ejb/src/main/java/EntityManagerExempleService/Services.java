package EntityManagerExempleService;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;
import EntityManagerExemple.Voiture;

/**
 * Session Bean implementation class Services
 */
@Stateless
@LocalBean
public class Services implements ServicesRemote, ServicesLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext(unitName="JPAproject-ejb")
	EntityManager em;
	
    public Services() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void add(Voiture voiture) {
		// TODO Auto-generated method stub
		em.persist(voiture);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Voiture voiture = em.find(Voiture.class,id );
		if(voiture!=null)
		{
			em.remove(voiture);
		}
		
	}
	@Override
	public List findAll() {
		//TypedQuery<Voiture> query=em.createQuery("SELECT p  FROM Voiture p  where p.id =:id",Voiture.class);
//		TypedQuery<Voiture> query=em.createQuery("SELECT p  FROM Voiture p  where p.id ='" + id + "'",Voiture.class);
//		return query.getSingleResult();
		//return query.setParameter("id", id).getSingleResult();
		//List<Voiture> list=query.getResultList();
		
		return em.createQuery(
			    "SELECT c FROM Voiture c ")
				.getResultList();
			   
	}
	public List findByMarque(String m)
	{
		return em.createQuery(
			    "SELECT c FROM Voiture c WHERE c.marque LIKE :custMarque")
			    .setParameter("custMarque", m)
			    .getResultList();
	}

	@Override
	public void addReclamation(Reclamation R) {
		// TODO Auto-generated method stub
		em.persist(R);
		
	}

	@Override
	public void removeReclamation(Reclamation R) {
		// TODO Auto-generated method stub
		if(em.contains(R)){
			em.remove(R);
		}
		else 
		{
			System.out.println("Reclamation inexistante");
		}
		
	}

	@Override
	public List findByType(TypeReclamation type) {
		// TODO Auto-generated method stub
		return em.createQuery(
			    "SELECT c FROM Reclamation c WHERE c.type = :Rtype")
			    .setParameter("Rtype",type )
			    .getResultList();
	}

	

}
