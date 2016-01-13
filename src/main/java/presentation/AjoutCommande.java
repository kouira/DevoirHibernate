package presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import model.Article;
import model.Client;
import service.CommandeImpService;

import com.opensymphony.xwork2.ActionSupport;

import domaine.ArticleBean;
import domaine.ArticleConvert;
import domaine.CommandeBean;
import domaine.CommandeConvert;

@ManagedBean(name = "ajoutCommande")
@ViewScoped
public class AjoutCommande extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty("#{commandeImpService}")
	private CommandeImpService commandeImpService;
	
	private Client clientConnecter;
	
	private List<Article> ListArticle;
	
	private Article articlechoisi;
	

	public String execute() {

		CommandeBean Cbean = new CommandeBean();

		try
		{
			Cbean.setArticle(getArticlechoisi());
			Cbean.setClient(getClientConnecter());
			commandeImpService.ajout(CommandeConvert.createModel(Cbean));
			return SUCCESS;
			
		}catch(Exception e)
		{
			e.getMessage();
			return ERROR;
		}
		
	}


	public CommandeImpService getCommandeImpService() {
		return commandeImpService;
	}


	public void setCommandeImpService(CommandeImpService commandeImpService) {
		this.commandeImpService = commandeImpService;
	}


	public List<Article> getListArticle() {
		return ListArticle;
	}


	public void setListArticle(List<Article> listArticle) {
		ListArticle = listArticle;
	}


	public Article getArticlechoisi() {
		return articlechoisi;
	}


	public void setArticlechoisi(Article articlechoisi) {
		this.articlechoisi = articlechoisi;
	}


	public Client getClientConnecter() {
		return clientConnecter;
	}


	public void setClientConnecter(Client clientConnecter) {
		this.clientConnecter = clientConnecter;
	}
	
	
}
