package Commande;
import junit.framework.TestCase;
import model.Commande;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import dao.CommandeImpDao;
import dao.ICommandeDao;

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
