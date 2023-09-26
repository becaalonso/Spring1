package com.example.RebecaAlonso.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcClientes;

	@Column(name = "NCliente")
	private String NCliente;

	@Column(name = "Fone")
	private String Fone;

	public Long getIdcClientes() {
		return idcClientes;
	}

	public void setIdcClientes(Long idcClientes) {
		this.idcClientes = idcClientes;
	}

	public String getNCliente() {
		return NCliente;
	}

	public void setNCliente(String nCliente) {
		NCliente = nCliente;
	}

	public String getFone() {
		return Fone;
	}

	public void setFone(String fone) {
		Fone = fone;
	}

	
}
