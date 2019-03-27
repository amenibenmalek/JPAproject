package testJPA;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.print.attribute.standard.DateTimeAtCompleted;

import EntityManagerExemple.Personnee;
import EntityManagerExemple.Reclamation;
import EntityManagerExemple.TypeReclamation;
import EntityManagerExemple.Voiture;
import EntityManagerExempleService.ServicesRemote;

public class Test {

	
	
	
	
	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		
		String jndiName = "JPAproject-ear/JPAproject-ejb/Services!EntityManagerExempleService.ServicesRemote";
		Context context = new InitialContext();
		System.out.println("ok");
		ServicesRemote proxy = (ServicesRemote) context.lookup(jndiName);
		System.out.println("ok");
		System.out.println("*************************************************************************************");
		
		Personnee P1 = new Personnee(1,"benmalek","ameni");
		Personnee P2 = new Personnee(2,"dridi","mohamed");
		
		Voiture   v  = new Voiture(1,"audi",P1);
		Voiture   v1 = new Voiture(2,"audi",P1);
		Voiture   v2 = new Voiture(3,"fiat",P2);
		List<Voiture> Voitures = new ArrayList<>();
		Voitures.add(v);
		Voitures.add(v1);
		P1.setVoitures(Voitures);
		
//		proxy.add(v);
//		proxy.add(v1);
//		proxy.add(v2);
		
		System.out.println(" Ajout avec succée ");
		
		System.out.println("************************ Les Voitures de marque audi ********************************");
		
		for(int i=0;i<proxy.findByMarque("audi").size();i++)
		{
			System.out.println("*"+i+": \n"+proxy.findByMarque("audi").get(i));
		}
		
		System.out.println("************************ Liste des Voitures  ****************************************");
		
		for(int i=0;i<proxy.findAll().size();i++)
		{
			System.out.println("*2*"+i+": \n"+proxy.findAll().get(i));
		}
		System.out.println("***************************************************************************************");
		
	
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date myDate = null;
		System.out.println("etape1");
		
		try {
			myDate = formatter.parse("02/05/2019");
			System.out.println("etape2");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
//		
	Reclamation R1 = new Reclamation(3,myDate,"erreur au niveau du changement",TypeReclamation.Technical_Claim,P1.getId());
		System.out.println(R1);
		proxy.addReclamation(R1);
//		System.out.println("Reclamation ajouté avec succée");
		
		
		//proxy.delete(1);
		
		
		
		

	}

}
