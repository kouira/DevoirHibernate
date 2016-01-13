package domaine;

import model.Article;
import model.Client;

public class CommandeBean {

	private Article article;
	
	private Client client;

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
