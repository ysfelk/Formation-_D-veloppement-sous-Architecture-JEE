package ma.barid.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.barid.tp1.bean.Commande;
import ma.barid.tp1.dao.CommandeRepository;

@Service
public class CommandeServiceImpl {

	@Autowired
	private CommandeRepository commandeRepository;

	public int paye(String reference, Double montant) {

		Commande commande = findByReference(reference);
		if (commande == null) {
			return -1;
		} else if (commande.getTotalePaye() + montant > commande.getTotale()) {
			return -2;
		} else {
			Double nouveauTP = commande.getTotalePaye() + montant;
			commande.setTotalePaye(nouveauTP);
			commandeRepository.save(commande);
			return 1;
		}

	}

	public Commande save(Commande entity) {
		if (findByReference(entity.getReference()) == null) {
			if (entity.getTotalePaye() == null) {
				entity.setTotalePaye(0D);
			}
			return commandeRepository.save(entity);

		} else {
			return null;
		}

	}

	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}


	@Transactional
	public int deleteByReference(String reference) {
		commandeRepository.deleteByReference(reference);
	    return 0;
	}

	public Commande findByReference(String reference) {
		return commandeRepository.findByReference(reference);
	}

}
