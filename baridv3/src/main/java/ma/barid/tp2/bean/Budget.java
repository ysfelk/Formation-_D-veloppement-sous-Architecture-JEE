package ma.barid.tp2.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Budget {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int annee;
	private double montantInv;
	private double montantFct;
	private double creditOuvert;
	private double montantInvRest;
	private double montantFctRest;
	@OneToMany (mappedBy = "budget")
	private List<LigneBudget> ligneBudgets;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public List<LigneBudget> getLigneBudgets() {
		return ligneBudgets;
	}
	public void setLigneBudgets(List<LigneBudget> ligneBudgets) {
		this.ligneBudgets = ligneBudgets;
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
	public Budget(Long id, int anneBudget, double montantInv, double montantFct, double creditOuvert,
			double montantInvRest, double montantFctRest) {
		super();
		this.id = id;
		this.annee = annee;
		this.montantInv = montantInv;
		this.montantFct = montantFct;
		this.creditOuvert = creditOuvert;
		this.montantInvRest = montantInvRest;
		this.montantFctRest = montantFctRest;
	}
	public Budget() {
		super();
	}
	
	
}
