package Spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import Spring.model.Utilisateur;
import Spring.persistence.AbstractDao;

@Repository
public class UtilisateurImpDao extends AbstractDao implements IUtilisateurDao {

	public void ajout(Utilisateur U) {
		// TODO Auto-generated method stub
		try {
			persist(U);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void modifier(Utilisateur U) {
		// TODO Auto-generated method stub
		update(U);

	}

	public void supprimer(Long idUser) {
		// TODO Auto-generated method stub
		String request = "from Utilisateur where idUtilisateur=" + idUser;
		delete(getByObject(request).get(0));
	}

	public List<Utilisateur> listeUtilisateur() {
		// TODO Auto-generated method stub
		String request = "from Utilisateur";
		return (List) getByObject(request);
	}

	public Utilisateur getUtilisateur(Long id) {
		// TODO Auto-generated method stub
		String request = "from Utilisateur where idUtilisateur=" + id;
		return (Utilisateur) getByObject(request).get(0);
	}

}
