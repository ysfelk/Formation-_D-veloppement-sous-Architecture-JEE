package ma.barid.tp2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.barid.tp2.bean.Departement;
import ma.barid.tp2.bean.Departement;
import ma.barid.tp2.dao.DepartementRepository;

@Service
public class DepartementServiceImpl {
	
	@Autowired
	DepartementRepository departementRepository;
	
	public Departement  save(Departement departement) {
		return departementRepository.save(departement);
	}

	public List<Departement> findAll() {
		return departementRepository.findAll();
	}

}
