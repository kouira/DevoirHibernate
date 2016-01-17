package Spring.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import Enumeration.Profil;
import Spring.domaine.UtilisateurBean;
import Spring.domaine.UtilisateurConvert;
import Spring.model.Utilisateur;
import Spring.service.IUtilisateurService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

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
	

	static UtilisateurBean uBean = new UtilisateurBean();

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
		
		uBean.setAdresse(getAdresse());
		uBean.setNom(getNom());
		uBean.setPrenom(getPrenom());
		uBean.setTel(getTel());
		uBean.setSelectedProfil(getSelectedProfil());
		
		System.out.println("hana ...."+getLogin());
		uBean.getCompte().setLogin(getLogin());
		uBean.getCompte().setPwd(getPwd());
		
		
		service.ajout(UtilisateurConvert.createModel(uBean));

		return SUCCESS;
	}

	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		service.supprimer(Long.valueOf(request.getParameter("idUtilisateur")));
		return "success";
	}

	public String edit() {
		
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		uBean = UtilisateurConvert.createModelBean(service.getUtilisateur(Long.valueOf(request
				.getParameter("idUtilisateur"))));
		
		profils.add(Profil.Admin);
		profils.add(Profil.Client);
		
		
		setNom(uBean.getNom());
		setPrenom(uBean.getPrenom());
		setAdresse(uBean.getAdresse());
		setTel(uBean.getTel());
		setLogin(uBean.getCompte().getLogin());
		setPwd(uBean.getCompte().getPwd());
		setSelectedProfil(uBean.getSelectedProfil());
		System.out.println(uBean.getNom());
		
		uBean = UtilisateurConvert.createModelBean(service.getUtilisateur(Long.valueOf(request
				.getParameter("idUtilisateur"))));
		
		return SUCCESS;
	}

	public String EditerUtilisateurOK() {
   
		uBean.setAdresse(getAdresse());
		uBean.setNom(getNom());
		uBean.setPrenom(getPrenom());
		uBean.setTel(getTel());
		uBean.setSelectedProfil(getSelectedProfil());
		
		service.modifier(UtilisateurConvert.createModel(uBean));
		return SUCCESS;

	}

	public List<Utilisateur> getUserList() {
		return userList;
	}

	public void setUserList(List<Utilisateur> userList) {
		this.userList = userList;
	}

	public UtilisateurBean getModel() {
		// TODO Auto-generated method stub
		return uBean;
	}

	public UtilisateurBean getuBean() {
		return uBean;
	}

	public void setuBean(UtilisateurBean uBean) {
		this.uBean = uBean;
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


}
