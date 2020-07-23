package ma.barid.tp1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.barid.tp1.bean.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long>{

	public Commande  findByReference(String reference);
	
	public int deleteByReference(String reference);
	
	
}
