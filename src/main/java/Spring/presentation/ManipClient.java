package Spring.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import Enumeration.Profil;
import Spring.domaine.UtilisateurBean;
import Spring.domaine.UtilisateurConvert;
import Spring.model.Admin;
import Spring.model.Client;
import Spring.model.Compte;
import Spring.model.Utilisateur;
import Spring.service.IUtilisateurService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManipClient extends ActionSupport
	{

	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private String tel;
	private String adresse;
	private String pwd;
	private String login;
	private Profil SelectedProfil;
	

	static Utilisateur uBean = null;

	private List<Profil> profils = new ArrayList<Profil>();

	@Autowired
	private IUtilisateurService service;

	private List<Utilisateur> userList = new ArrayList<Utilisateur>();

	public String display() {
		profils.add(Profil.Admin);
		profils.add(Profil.Client);
		return SUCCESS;

	}

	public String list() {
		userList = service.listeUtilisateur();
		return "listUser";
	}

	public String ajoutClient() {
		
		 if ( getSelectedProfil() == Profil.Admin)
			 uBean = new Admin();
		 else
			 uBean =new Client();
		 
		uBean.setAdresse(getAdresse());
		uBean.setNom(getNom());
		uBean.setPrenom(getPrenom());
		uBean.setTel(getTel());
		uBean.setProfil(getSelectedProfil());
		
		Compte c= new Compte();
		c.setLogin(getLogin());
		c.setPwd(getPwd());
		c.setUtilisateur(uBean);
		
		uBean.setCompte(c);
		 
		service.ajout(uBean);

		return SUCCESS;
	}

	public String delete() {
		
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		uBean = service.getUtilisateur(Long.valueOf(request
				.getParameter("idUtilisateur")));
		
		service.supprimer(uBean);
		
		
		return SUCCESS;
	}

	public String edit() {
		
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		uBean = service.getUtilisateur(Long.valueOf(request
				.getParameter("idUtilisateur")));
		
		
		profils.add(Profil.Admin);
		profils.add(Profil.Client);
		
		setNom(uBean.getNom());
		setPrenom(uBean.getPrenom());
		setAdresse(uBean.getAdresse());
		setTel(uBean.getTel());
		setLogin(uBean.getCompte().getLogin());
		setPwd(uBean.getCompte().getPwd());
		setSelectedProfil(uBean.getProfil());
	
		
		return SUCCESS;
	}

	public String EditerUtilisateurOK() {
		
		uBean.setAdresse(getAdresse());
		uBean.setNom(getNom());
		uBean.setPrenom(getPrenom());
		uBean.setTel(getTel());
		uBean.setProfil(getSelectedProfil());
		
		service.modifier(uBean);
		return SUCCESS;

	}

	public List<Utilisateur> getUserList() {
		return userList;
	}

	public void setUserList(List<Utilisateur> userList) {
		this.userList = userList;
	}

	
	public IUtilisateurService getService() {
		return service;
	}

	public void setService(IUtilisateurService service) {
		this.service = service;
	}

	public List<Profil> getProfils() {
		return profils;
	}

	public void setProfils(List<Profil> profils) {
		this.profils = profils;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Profil getSelectedProfil() {
		return SelectedProfil;
	}

	public void setSelectedProfil(Profil selectedProfil) {
		SelectedProfil = selectedProfil;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public static Utilisateur getuBean() {
		return uBean;
	}

	public static void setuBean(Utilisateur uBean) {
		ManipClient.uBean = uBean;
	}


}
