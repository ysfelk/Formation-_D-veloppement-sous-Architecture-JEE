package ma.barid.tp2.ws.rest.provided.facede;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.barid.tp2.bean.Departement;
import ma.barid.tp2.service.impl.DepartementServiceImpl;

@RestController
@RequestMapping("budget-api/departement")
public class DepartementRest {

	@Autowired
	DepartementServiceImpl departementServiceImpl;
	
	@PostMapping("/")
	public Departement save(@RequestBody Departement departement) {
		return departementServiceImpl.save(departement);
	}
	@GetMapping("/")
	public List<Departement> findAll() {
		return departementServiceImpl.findAll();
	}
	
	
}
