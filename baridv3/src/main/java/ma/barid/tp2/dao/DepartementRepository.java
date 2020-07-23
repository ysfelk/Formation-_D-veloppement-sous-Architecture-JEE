package ma.barid.tp2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.barid.tp2.bean.Departement;

@Repository
public interface DepartementRepository extends JpaRepository <Departement,Long>{
	
	

}
