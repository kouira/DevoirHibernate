package Spring.service;

import java.util.List;

import Spring.model.Utilisateur;

public interface IUtilisateurService {


	public void ajout(Utilisateur U);
	
	public void modifier (Utilisateur U);
	
	public void supprimer(Long  idUtilisateur);
	
	public List<Utilisateur> listeUtilisateur();
	
	public Utilisateur getUtilisateur(Long id);

	
}
