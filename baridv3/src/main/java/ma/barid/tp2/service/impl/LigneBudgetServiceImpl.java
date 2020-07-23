package ma.barid.tp2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.barid.tp2.bean.LigneBudget;
import ma.barid.tp2.dao.LigneBudgetRepository;


@Service
public class LigneBudgetServiceImpl {
	
	@Autowired
	LigneBudgetRepository ligneBudgetRepository;
	
	
	public int deleteByBudgetAnne(int annee) {
		return ligneBudgetRepository.deleteByBudgetAnnee(annee);
	}

	public List<LigneBudget> findByDepartementNom(String nom) {
		return ligneBudgetRepository.findByDepartementNom(nom);
	}

	public List<LigneBudget> findByBudgetAnnee(int annee) {
		return ligneBudgetRepository.findByBudgetAnnee(annee);
	}

	public LigneBudget  save(LigneBudget ligneBudget) {
		return ligneBudgetRepository.save(ligneBudget);
	}

	public List<LigneBudget> findAll() {
		return ligneBudgetRepository.findAll();
	}

}
