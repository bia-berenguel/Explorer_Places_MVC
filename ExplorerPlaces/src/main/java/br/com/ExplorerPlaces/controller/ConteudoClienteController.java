package br.com.ExplorerPlaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ExplorerPlaces.model.Cliente;
import br.com.ExplorerPlaces.repository.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ConteudoClienteController {

	
	@Autowired
	private ClienteRepository clienteRepository;
	

	/*
	 * @GetMapping public ModelAndView home() { ModelAndView modelAndView = new
	 * ModelAndView("/index"); modelAndView.addObject("Cliente",
	 * clienteRepository.findAll());
	 * 
	 * return modelAndView; }
	 * 
	 * @GetMapping("/{id}") public ModelAndView destinos(@PathVariable Long id) {
	 * ModelAndView modelAndView = new ModelAndView("/destinos");
	 * modelAndView.addObject("Cliente", clienteRepository.getReferenceById(id));
	 * 
	 * return modelAndView; }
	 * 
	 * @GetMapping("/cadastrar") public ModelAndView cadastrar() { ModelAndView
	 * modelAndView = new ModelAndView("/cadastro");
	 * modelAndView.addObject("Cliente", clienteRepository.findAll());
	 * 
	 * return modelAndView; }
	 * 
	 * @GetMapping("/editar/{id}") public ModelAndView editar(@PathVariable Long id)
	 * { ModelAndView modelAndView = new
	 * ModelAndView("conteudoClienteController/formulario");
	 * modelAndView.addObject("Cliente", clienteRepository.getReferenceById(id));
	 * 
	 * return modelAndView; }
	 * 
	 * @PostMapping({ "/cadastrar", "/editar/{id}" }) public String salvar(Cliente
	 * cliente) { clienteRepository.save(cliente);
	 * 
	 * return "redirect:/conteudo-cadastrado"; }
	 * 
	 * @GetMapping("/excluir/{id}") public String excluir(@PathVariable Long id) {
	 * clienteRepository.deleteById(id);
	 * 
	 * return "redirect:/conteudo-cadastrado"; }
	 */
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("crudCliente/index");
		modelAndView.addObject("Clientes", clienteRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("crudCliente/formulario");
		modelAndView.addObject("Cliente", new Cliente());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudCliente/formulario");
		modelAndView.addObject("Cliente", clienteRepository.getReferenceById(id));

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Cliente cliente) {
		clienteRepository.save(cliente);

		return "redirect:/clientes";
	}
	
	@GetMapping("/detalhes/{id}")
	public ModelAndView detalhes(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("crudCliente/detalhes");
		modelAndView.addObject("Cliente", clienteRepository.getReferenceById(id));

		return modelAndView;
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		clienteRepository.deleteById(id);

		return "redirect:/clientes";
	}
}