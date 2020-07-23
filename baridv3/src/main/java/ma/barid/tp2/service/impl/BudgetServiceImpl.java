package ma.barid.tp2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.barid.tp2.bean.Budget;
import ma.barid.tp2.bean.LigneBudget;
import ma.barid.tp2.dao.BudgetRepository;

@Service
public class BudgetServiceImpl {
	@Autowired
	LigneBudgetServiceImpl ligneBudgetServiceImpl;
	@Autowired
	BudgetRepository budgetRepository;

	@Transactional
	public int deleteByAnnee(int annee) {
		int res1 = ligneBudgetServiceImpl.deleteByBudgetAnne(annee);
		int res2 = budgetRepository.deleteByAnnee(annee);
		return res1 + res2;

	}
	
	public double calculerCreditOuvert(int annee) {
		Budget budget = findByAnnee(annee-1);
		if (budget==null) {
			return 0d;
		}else {
			return budget.getMontantInvRest()+budget.getMontantFct();
		}
	}
	
	public int save(Budget budget , List<LigneBudget> ligneBudgets) {
		
		if (findByAnnee(budget.getAnnee())!= null) {
			return -1;
		}else {
			Double totalInv=0d;
			Double totalFonc=0d;
			for (LigneBudget ligneBudget : ligneBudgets) {
				totalFonc+=ligneBudget.getMontantFct();
				totalInv+=ligneBudget.getMontantInv();
				ligneBudget.setMontantFctRest(0d);
				ligneBudget.setMontantInvRest(0d);
			}
			budget.setMontantFct(totalFonc);
			budget.setMontantInv(totalInv);
			budget.setMontantFctRest(0d);
			budget.setMontantInvRest(0d);
			budget.setCreditOuvert(calculerCreditOuvert(budget.getAnnee()));
			budgetRepository.save(budget);
			for (LigneBudget ligneBudget : ligneBudgets) {
				ligneBudget.setBudget(budget);
				ligneBudgetServiceImpl.save(ligneBudget);
			}
			return 1;
		}
		
	}
	
	public Budget save(Budget budget) {
		return budgetRepository.save(budget);
	}

	public List<Budget> findAll() {
		return budgetRepository.findAll();
	}

	public Budget findByAnnee(int annee) {
		return budgetRepository.findByAnnee(annee);
	}

}
