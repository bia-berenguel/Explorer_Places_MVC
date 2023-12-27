package br.com.ExplorerPlaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ExplorerPlaces.model.Cliente;

@Controller
public class ConteudoDirecionamentoController {

	@GetMapping("/index")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index.html");

		return modelAndView;
	}
	

	@GetMapping("/destinos")
	public ModelAndView destinos() {
		ModelAndView modelAndView = new ModelAndView("/pages/destinos.html");

		return modelAndView;
	}
	

	@GetMapping("/contato")
	public ModelAndView contato() {
		ModelAndView modelAndView = new ModelAndView("/pages/contato");

		return modelAndView;
	}
	
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("pages/cadastro");
		modelAndView.addObject("Cliente", new Cliente());

		return modelAndView;
	}

}
	