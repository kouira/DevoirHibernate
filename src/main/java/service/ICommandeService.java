package service;

import java.util.List;

import model.Commande;

public interface ICommandeService {

	
	public void ajout(Commande e);
	
	public void modifier (Commande e);
	
	public void supprimer(Commande e);
	
	public List<Commande> listeCommande(Long idClient);
}
