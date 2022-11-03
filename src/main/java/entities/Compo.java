package entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compo")


public class Compo {
	    private int id;
	    
	    private int idLiv;

	    private int idEmp ;
	    
	    @Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		@Column(name = "ID_LIV")
		public int getIdLiv() {
			return idLiv;
		}

		public void setIdLiv(int idLiv) {
			this.idLiv = idLiv;
		}
		@Column(name = "ID_EMP")
		public int getIdEmp() {
			return idEmp;
		}

		public void setIdEmp(int idEmp) {
			this.idEmp = idEmp;
		}

		@Override
		public String toString() {
			return "Client [id=" + id + ", idLiv=" + idLiv + ", idEmp=" + idEmp + "]";
		}
		
		
}

