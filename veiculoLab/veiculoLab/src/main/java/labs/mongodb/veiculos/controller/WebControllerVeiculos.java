package labs.mongodb.veiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import labs.mongodb.veiculos.model.Veiculos;
import labs.mongodb.veiculos.repository.VeiculosRepository;

@Controller
@RequestMapping("/veiculos")
public class WebControllerVeiculos {

	@Autowired
	private VeiculosRepository repository;
	
	@GetMapping("/form")
	public String init() {
		System.out.println("Busca veiculo");
		return "busca-veiculo";
	}

	@RequestMapping(value = "/q", method = RequestMethod.GET)
	public ModelAndView getVeiculoByPlaca(@RequestParam("placa") String placa) {
		System.out.println("Veiculo pela placa");
		ModelAndView mv = new ModelAndView("dados-veiculo");
		Veiculos v = repository.findByPlaca(placa);
		mv.addObject("veiculo",v);
		return mv;
	}
	
}
