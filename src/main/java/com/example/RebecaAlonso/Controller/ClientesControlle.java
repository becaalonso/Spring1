package com.example.RebecaAlonso.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RebecaAlonso.entities.Clientes;
import com.example.RebecaAlonso.service.ClientesService;

@RestController
@RequestMapping("/clients")
public class ClientesControlle {

	private ClientesService clientesService;

	@Autowired
	public ClientesControlle(ClientesService clientesService) {
			this.clientesService = clientesService;
	}

	@PostMapping
	public Clientes createclient(@RequestBody Clientes clientes) {
		return clientesService.saveClientes(clientes);

	}

	@GetMapping("/{id}")
	public Clientes getidcClientes(@PathVariable Long id) {
		return clientesService.getidcClientesById(id);
	}

	@GetMapping
	public List<Clientes> getAllClientes() {
		return clientesService.getAllClientes();
	}

	@DeleteMapping("/{id}")
	public void deleteidcClientes(@PathVariable Long idcClientes) {
		clientesService.DeleteCliente(idcClientes);
	}
}
