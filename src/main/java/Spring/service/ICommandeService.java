package Spring.service;

import java.util.List;

import Spring.model.Commande;

public interface ICommandeService {

	
	public void ajout(Commande e);
	
	public void modifier (Commande e);
	
	public void supprimer(Commande e);
	
	public List<Commande> listeCommande(Long idClient);
}
