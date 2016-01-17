package Spring.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "idUtilisateur")
public class Client extends Utilisateur{


	@OneToMany(fetch=FetchType.EAGER)
	private Collection<Commande> cmds;

	

	public Client() {
		super();
	}

	public Collection<Commande> getCmds() {
		return cmds;
	}

	public void setCmds(Collection<Commande> cmds) {
		this.cmds = cmds;
	}
	
	
}
