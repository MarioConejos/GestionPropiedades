package admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import admin.model.Comunidad;
import admin.repository.ComunidadRepository;

@Controller
public class ComunidadController {
	@Autowired
	private ComunidadRepository repositorioComunidades;
	

	@RequestMapping("/")
	public String tablon(Model model) {
			
		model.addAttribute("comunidades", repositorioComunidades.findAll());

		return "tablon";
	}
	
	@RequestMapping("/insertar")
	public String insertar(Comunidad comunidad, Model model) {

		repositorioComunidades.save(comunidad);

		return "insertar";
	}
	
	@RequestMapping("/mostrar")
	public String mostrar(@RequestParam int numComunidad, Model model) {

		List<Comunidad> comunidad = repositorioComunidades.findByCodigoPostal("28005");

		model.addAttribute("comunidad", comunidad.get(0));

		return "mostrar";
	}

}