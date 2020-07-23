package ma.barid.tp2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.barid.tp2.bean.LigneBudget;

@Repository
public interface LigneBudgetRepository extends JpaRepository <LigneBudget,Long>{
	
	List<LigneBudget> findByBudgetAnnee(int annee);
	List<LigneBudget> findByDepartementNom(String nom);
	int deleteByBudgetAnnee(int annee);
	

}
