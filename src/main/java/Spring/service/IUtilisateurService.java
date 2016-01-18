package Spring.service;

import java.util.List;

import Spring.model.Client;
import Spring.model.Utilisateur;

public interface IUtilisateurService {


	public void ajout(Utilisateur U);
	
	public void modifier (Utilisateur U);
	
	public void supprimer(Utilisateur u);
	
	public List<Utilisateur> listeUtilisateur();
	
	public Utilisateur getUtilisateur(Long id);
	
	public Client getClient(Long id);

	
}
