package br.com.ExplorerPlaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ExplorerPlaces.model.Destino;
import br.com.ExplorerPlaces.repository.DestinoRepository;

@Controller
@RequestMapping("/destinos_crud")
public class ConteudoDestinoController {

	@Autowired
	private DestinoRepository destinoRepository;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("crudDestino/index");
		modelAndView.addObject("Destinos", destinoRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("crudDestino/formulario");
		modelAndView.addObject("Destino", new Destino());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudDestino/formulario");
		modelAndView.addObject("Destino", destinoRepository.getReferenceById(id));

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Destino destino) {
		destinoRepository.save(destino);

		return "redirect:/destinos_crud";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		destinoRepository.deleteById(id);

		return "redirect:/destinos_crud";
	}
}