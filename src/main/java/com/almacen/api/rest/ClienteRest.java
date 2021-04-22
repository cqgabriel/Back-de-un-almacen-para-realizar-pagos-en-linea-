package com.almacen.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almacen.api.dao.ClienteDAO;
import com.almacen.api.models.entitys.Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRest {

	@Autowired
	private ClienteDAO clienteDAO;
	
	//METODOS HTTP - SOLICITUD AL SERVIOR 
	
	//GET, POST, PUT, DELETE -> 200 - 500 - 404
	
	@PostMapping("/guardar")
	public void guardar (@RequestBody Cliente cliente) {
		clienteDAO.save(cliente); 	
	}
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		clienteDAO.deleteById(id);	
	}
	
	@PutMapping("/actualizar")
	public void actualizar (@RequestBody Cliente cliente) {
		clienteDAO.save(cliente); 	
	}
}	
