package entities;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "livre")


public class Livre {
	    private int id;
	    
	    private String titre;

	    private String auteur ;
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name = "TITRE")
		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		@Column(name = "AUTEUR")
		public String getAuteur() {
			return auteur;
		}

		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}

		@Override
		public String toString() {
			return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
		}
	    
	    
	    
	    
}
