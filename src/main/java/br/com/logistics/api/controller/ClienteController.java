package br.com.logistics.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.logistics.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Leonardo");
		cliente1.setTelefone("(99) 99999-9999");
		cliente1.setEmail("leonardo@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Leonardo Henrique");
		cliente2.setTelefone("(88) 88888-8888");
		cliente2.setEmail("leonardo.henrique@gmail.com");
		
		return Arrays.asList(cliente1,cliente2);
	}
	
}
