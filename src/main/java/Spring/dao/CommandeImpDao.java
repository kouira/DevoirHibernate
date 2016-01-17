package Spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import Spring.model.Commande;
import Spring.persistence.BaseDAO;

@Repository("CommandeImpDAO")
@Transactional
public class CommandeImpDao implements ICommandeDao{

	public void ajout(Commande e){
	   try {
		BaseDAO.getInstance().ajouter(e);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	}

	public void modifier(Commande e) {
		
		BaseDAO.getInstance().modifier(e);
		
	}

	public void supprimer(Commande e) {
	
		
		BaseDAO.getInstance().delete(e);
	}

	@SuppressWarnings("unchecked")
	public List<Commande> listeCommande(Long idClient) {
		
		String req="from Commande where Client="+idClient;
		
		return (List<Commande>) BaseDAO.getInstance().getListObject(req);
	}

}
