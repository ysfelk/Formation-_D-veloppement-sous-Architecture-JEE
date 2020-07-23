package ma.barid.tp2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.barid.tp2.bean.Budget;

@Repository
public interface BudgetRepository extends JpaRepository <Budget,Long>{
	
	Budget findByAnnee(int annee);
	int deleteByAnnee(int annee);
	
	

}
