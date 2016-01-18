package Spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


@Entity
@Table(name="commande")
public class Commande {

	
	@Id
	@GeneratedValue
	private Long idC;
	

	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Client client;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	private Article article;
	
	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}


	
	
}
