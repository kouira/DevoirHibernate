package Spring.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "Client")
public class Client extends Utilisateur {

	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
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
