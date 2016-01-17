package Spring.domaine;

import Spring.model.Article;
import Spring.model.Client;

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
