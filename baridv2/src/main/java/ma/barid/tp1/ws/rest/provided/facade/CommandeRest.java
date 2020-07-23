package ma.barid.tp1.ws.rest.provided.facade;

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

import ma.barid.tp1.bean.Commande;
import ma.barid.tp1.service.impl.CommandeServiceImpl;

@RestController
@RequestMapping("commercial-api")
public class CommandeRest {
	
	@Autowired
	private CommandeServiceImpl commandeServiceImpl;

	@PutMapping("/reference/{reference}/montant/{montant}")
	public int paye(@PathVariable String reference, @PathVariable Double montant) {
		return commandeServiceImpl.paye(reference, montant);
	}
	
	@PostMapping("/")
	public Commande save(@RequestBody Commande entity) {
		return commandeServiceImpl.save(entity);
	}
	
	@GetMapping("/")
	public List< Commande> findAll() {
		return commandeServiceImpl.findAll();
	}
	@GetMapping("/reference/{reference}")
	public Commande findByReference(@PathVariable String reference) {
		return commandeServiceImpl.findByReference(reference);
	}
	
	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		 return commandeServiceImpl.deleteByReference(reference);
	}
	
	
}
