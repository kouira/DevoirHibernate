package Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Spring.dao.IUtilisateurDao;
import Spring.model.Client;
import Spring.model.Utilisateur;

@Transactional
@Service
public class UtilisateurImpService implements IUtilisateurService {

	@Autowired
	private IUtilisateurDao dao;

	public void ajout(Utilisateur U) {
		// TODO Auto-generated method stub
			dao.ajout(U);
	}

	public void modifier(Utilisateur U) {
		// TODO Auto-generated method stub
		dao.modifier(U);
	}

	public void supprimer(Utilisateur Utilisateur) {
		// TODO Auto-generated method stub
		dao.supprimer(Utilisateur);
	}

	public List<Utilisateur> listeUtilisateur() {
		// TODO Auto-generated method stub
		return dao.listeUtilisateur();
	}

	public IUtilisateurDao getDao() {
		return dao;
	}

	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}

	public Utilisateur getUtilisateur(Long id) {
		// TODO Auto-generated method stub
		return dao.getUtilisateur(id);
	}

	public Client getClient(Long id) {
		return dao.getClient(id);
		}

}
