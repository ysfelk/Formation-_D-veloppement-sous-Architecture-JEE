package ma.barid.tp2.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class LigneBudget {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double montantInv;
	private double montantFct;
	private double creditOuvert;
	private double montantInvRest;
	private double montantFctRest;
	@ManyToOne
	private Departement departement;
	@ManyToOne
	private Budget budget;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getMontantInv() {
		return montantInv;
	}
	public void setMontantInv(double montantInv) {
		this.montantInv = montantInv;
	}
	public double getMontantFct() {
		return montantFct;
	}
	public void setMontantFct(double montantFct) {
		this.montantFct = montantFct;
	}
	public double getCreditOuvert() {
		return creditOuvert;
	}
	public void setCreditOuvert(double creditOuvert) {
		this.creditOuvert = creditOuvert;
	}
	public double getMontantInvRest() {
		return montantInvRest;
	}
	public void setMontantInvRest(double montantInvRest) {
		this.montantInvRest = montantInvRest;
	}
	public double getMontantFctRest() {
		return montantFctRest;
	}
	public void setMontantFctRest(double montantFctRest) {
		this.montantFctRest = montantFctRest;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Budget getBudget() {
		return budget;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public LigneBudget(Long id, double montantInv, double montantFct, double creditOuvert, double montantInvRest,
			double montantFctRest, Departement departement, Budget budget) {
		super();
		this.id = id;
		this.montantInv = montantInv;
		this.montantFct = montantFct;
		this.creditOuvert = creditOuvert;
		this.montantInvRest = montantInvRest;
		this.montantFctRest = montantFctRest;
		this.departement = departement;
		this.budget = budget;
	}
	public LigneBudget() {
		super();
	}
	
	
	
	
	

}
