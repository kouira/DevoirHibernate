package dao;

import java.util.List;

import model.Commande;

public interface ICommandeDao {

	
	public void ajout(Commande e);
	
	public void modifier (Commande e);
	
	public void supprimer(Commande e);
	
	public List<Commande> listeCommande(Long idClient);
}
