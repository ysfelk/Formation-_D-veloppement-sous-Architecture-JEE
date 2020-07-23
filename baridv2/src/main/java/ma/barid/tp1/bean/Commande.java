package ma.barid.tp1.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String reference;
	
	private  Double totale;
	
	private Double totalePaye;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Double getTotale() {
		return totale;
	}

	public void setTotale(Double totale) {
		this.totale = totale;
	}

	public Double getTotalePaye() {
		return totalePaye;
	}

	public void setTotalePaye(Double totalePaye) {
		this.totalePaye = totalePaye;
	}

	public Commande(String reference, Double totale, Double totalePaye) {
		super();
		this.reference = reference;
		this.totale = totale;
		this.totalePaye = totalePaye;
	}

	public Commande() {
		super();
	}
	
	
	public Commande(String reference, Double totale) {
		super();
		this.reference = reference;
		this.totale = totale;
		this.totalePaye = 0D;
	}
	
}
