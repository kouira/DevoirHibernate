package Spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import Spring.model.Commande;
import Spring.persistence.AbstractDao;

@Repository("CommandeImpDAO")
@Transactional
public class CommandeImpDao extends AbstractDao implements ICommandeDao {

	public void ajout(Commande e){
	   try {
		persist(e);
		   
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}

	public void modifier(Commande e) {
		
		
	}

	public void supprimer(Commande e) {
	
		
		
	}

	@SuppressWarnings("unchecked")
	public List listeCommande(Long idClient) {
		
		String req="from Commande where client="+idClient;
		return getByObject(req);
		
		}

}
