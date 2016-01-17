package Spring.domaine;


public class ArticleBean {

	
	private Long idC;

	private String libele;
	
	private Long montant;
	
	private String description;

	private Long qte;

	public ArticleBean() {
		super();
	}

	public ArticleBean(String libele, Long montant, String description) {
		super();
		this.libele = libele;
		this.montant = montant;
		this.description = description;
	}

	public Long getIdC() {
		return idC;
	}

	public void setIdC(Long idC) {
		this.idC = idC;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public Long getMontant() {
		return montant;
	}

	public void setMontant(Long montant) {
		this.montant = montant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getQte() {
		return qte;
	}

	public void setQte(Long qte) {
		this.qte = qte;
	}
	
}
