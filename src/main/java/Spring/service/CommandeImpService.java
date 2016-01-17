package Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Spring.dao.ICommandeDao;
import Spring.model.Commande;

@Service
@Component
public class CommandeImpService implements ICommandeService{

	@Autowired
	ICommandeDao dao;
	
	
	public void ajout(Commande e) {
		// TODO Auto-generated method stub
		dao.ajout(e);
	}

	public void modifier(Commande e) {
		// TODO Auto-generated method stub
		dao.modifier(e);
	}

	public void supprimer(Commande e) {
		// TODO Auto-generated method stub
		dao.supprimer(e);
	}

	public List<Commande> listeCommande(Long idClient) {
		// TODO Auto-generated method stub
		
		return dao.listeCommande(idClient);
	}

	
}
