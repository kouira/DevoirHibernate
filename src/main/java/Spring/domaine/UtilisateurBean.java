package Spring.domaine;

import Enumeration.Profil;


public class UtilisateurBean {

	private Long id;
	
	private String nom;

	private String prenom;

	private String tel;

	private String adresse;

    private CompteBean compte=new CompteBean();

	private Profil selectedProfil;

	public UtilisateurBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilisateurBean(String nom, String prenom, String tel,
			String adresse, String login, String pwd, Profil selectedProfil) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.selectedProfil = selectedProfil;
	}

	public CompteBean getCompte() {
		return compte;
	}

	public void setCompte(CompteBean compte) {
		this.compte = compte;
	}

	public Profil getSelectedProfil() {
		return selectedProfil;
	}

	public void setSelectedProfil(Profil selectedProfil) {
		this.selectedProfil = selectedProfil;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
