package com.estudos.danylog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.danylog.api.controller.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("José");
		cliente1.setTelefone("51 9999-1122");
		cliente1.setEmail("zezinho123@danylog.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria Lúcia");
		cliente2.setTelefone("51 9989-1315");
		cliente2.setEmail("malucia@danylog.com");		
		
		return Arrays.asList(cliente1, cliente2);
	}

}
