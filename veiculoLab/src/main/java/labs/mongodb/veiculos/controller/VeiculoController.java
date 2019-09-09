package labs.mongodb.veiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import labs.mongodb.veiculos.model.Veiculos;
import labs.mongodb.veiculos.repository.VeiculosRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculosRepository repository;
	
	@GetMapping
	public List<Veiculos> getAllVeiculos() {
		System.out.println("Todos Veiculos");
	  return repository.findAll();
	}

}
