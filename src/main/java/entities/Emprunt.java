package entities;
import java.sql.Date;
import java.util.Set;

import entities.Client;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="emprunt")


public class Emprunt {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	@Column(name = "DATE_DEBUT") 
	    private Date dateDebut;
	@Column(name = "DATE_FIN")
	    private Date dateFin ;
	@Column(name = "DELAI")
	    private int delai;
	@Column(name = "ID_CLIENT")
    private int idclient;
		
		
		
		

		//RELATION AVEC LIVRE MANY TO MANY	
		@ManyToMany
		@JoinTable(name="compo", joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID"),
		inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="ID")
		)
		private Set<Livre> livres;
		
		public Set<Livre> getLivres() {
			return livres;
		}
		public void setLivres(Set<Livre> livres) {
			this.livres = livres;
		}
		
		
		public Emprunt() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public Date getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}
		
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		
		public int getDelai() {
			return delai;
		}
		public void setDelai(int delai) {
			this.delai = delai;
		}
		
		
		public int getIdclient() {
			return idclient;
		}
		public void setIdclient(int idclient) {
			this.idclient = idclient;
		}
	
	
	    
	   
	    
	    
	    
}

