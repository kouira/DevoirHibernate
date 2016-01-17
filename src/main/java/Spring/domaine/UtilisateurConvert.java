package Spring.domaine;

import java.util.ArrayList;
import java.util.List;

import Enumeration.Profil;
import Spring.model.Commande;
import Spring.model.Compte;
import Spring.model.Utilisateur;

public class UtilisateurConvert {

	
	public static Utilisateur createModel(UtilisateurBean UtiliBean){

		Compte C = new Compte();
		
		C.setLogin(UtiliBean.getCompte().getLogin());
		C.setPwd(UtiliBean.getCompte().getPwd());
	
		
		Utilisateur U = new Utilisateur();
		
		U.setIdUtilisateur(UtiliBean.getId());
		U.setAdresse(UtiliBean.getAdresse());
		U.setCompte(C);
		U.setNom(UtiliBean.getNom());
		U.setPrenom(UtiliBean.getPrenom());
		U.setTel(UtiliBean.getTel());
		C.setUtilisateur(U);
		System.out.println(UtiliBean.getSelectedProfil()+".............;");
			U.setProfil(UtiliBean.getSelectedProfil());
	
		return U;
	}
	
	
	public static UtilisateurBean createModelBean(Utilisateur Utili){

			
		UtilisateurBean U = new UtilisateurBean();
		U.setId(Utili.getIdUtilisateur());
		U.setAdresse(Utili.getAdresse());
		U.getCompte().setLogin((Utili.getCompte().getLogin()));
		
		System.out.println("hlaa......."+Utili.getCompte().getPwd()+Utili.getProfil());
		U.getCompte().setPwd(Utili.getCompte().getPwd());
		U.setSelectedProfil(Utili.getProfil());
		U.setNom(Utili.getNom());
		U.setPrenom(Utili.getPrenom());
		U.setTel(Utili.getTel());

		return U;
	}

	
}
