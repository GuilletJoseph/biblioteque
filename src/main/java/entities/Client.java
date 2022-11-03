package entities;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "client")


public class Client {
	    private int id;
	    
	    private String nom;

	    private String prenom ;    
		private Set<Emprunt> emprunt;

		public Client() {
			emprunt = new HashSet<Emprunt>();
		}

		
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name = "NOM")
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Column(name = "PRENOM")
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		
		@OneToMany(mappedBy = "client")
		public Set<Emprunt> getEmprunt() {
			return emprunt;
		}

		public void setEmprunt(Set<Emprunt> emprunt) {
			this.emprunt = emprunt;
		}
	
		@Override
		public String toString() {
			return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
		}

		
	    
	    
	    
	    
}

