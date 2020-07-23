package ma.barid.tp2.ws.rest.provided.facede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.barid.tp2.bean.Budget;
import ma.barid.tp2.bean.LigneBudget;
import ma.barid.tp2.service.impl.BudgetServiceImpl;

@RestController
@RequestMapping("budget-api/budget")
public class BudgetRest {
	
	@Autowired
	private BudgetServiceImpl budgetServiceImpl;
	
	@DeleteMapping("/annee/{annee}")
	public int deleteByAnnee(@PathVariable int annee) {
		return budgetServiceImpl.deleteByAnnee(annee);
	}
	@GetMapping("/credit-ouvert/annee/{annee}")
	public double calculerCreditOuvert(@PathVariable int annee) {
		return budgetServiceImpl.calculerCreditOuvert(annee);
	}
	@PostMapping("/")
	public int save(@RequestBody Budget budget) {
		return budgetServiceImpl.save(budget, budget.getLigneBudgets());
	}
	@GetMapping("/annee/{annee}")
	public Budget findByAnnee(@PathVariable int annee) {
		return budgetServiceImpl.findByAnnee(annee);
	}
	
	

}
