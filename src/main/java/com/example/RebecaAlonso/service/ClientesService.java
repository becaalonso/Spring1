package com.example.RebecaAlonso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RebecaAlonso.entities.Clientes;
import com.example.RebecaAlonso.repositories.repositoryClientes;

@Service
public class ClientesService {

	private repositoryClientes RepositoryClientes;

	@Autowired
	public void ClientesService(repositoryClientes RepositoryClientes) {
		this.RepositoryClientes = RepositoryClientes;
	}

	public Clientes saveClientes(Clientes clientes) {
		return RepositoryClientes.save(clientes);
	}

	public List<Clientes> getAllClientes() {
		return RepositoryClientes.findAll();
	}

	public Clientes getidcClientesById(Long idcClientes) {
		return RepositoryClientes.findById(idcClientes).orElse(null);

	}
	
	public void DeleteCliente(Long idcClientes ) {
		RepositoryClientes.deleteById(idcClientes);
	}

	

}
