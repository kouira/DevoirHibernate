package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int idCompt;

	@Column(name = "LOGIN", nullable = true)
	private String login;

	@Column(name = "PWD", nullable = true)
	private String pwd;

	@OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(
	name = "utilisateur_compteID",
	referencedColumnName = "idUtilisateur"
	)
	private Utilisateur utilisateur;

	@Column
	private boolean compteEnable;
	
	public Compte() {
		super();
	}

	public int getIdCompt() {
		return idCompt;
	}

	public void setIdCompt(int idCompt) {
		this.idCompt = idCompt;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public boolean isCompteEnable() {
		return compteEnable;
	}

	public void setCompteEnable(boolean compteEnable) {
		this.compteEnable = compteEnable;
	}

}
