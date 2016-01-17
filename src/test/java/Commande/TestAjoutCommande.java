package Commande;
import junit.framework.TestCase;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import Spring.dao.CommandeImpDao;
import Spring.dao.ICommandeDao;
import Spring.model.Commande;

public class TestAjoutCommande extends TestCase {

	private ListableBeanFactory bf;
	  
	   public void setUp()
	   {
		bf=new XmlBeanFactory(new ClassPathResource("config.xml"));   
	   }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICommandeDao dao = new CommandeImpDao();
	//	Commande com = new Commande("hp", new Long(30), "titi");

	//	dao.ajout(com);
	}
}
