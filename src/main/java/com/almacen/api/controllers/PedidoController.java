package com.almacen.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

	@GetMapping
	public ResponseEntity<?> prueba() {
		return ResponseEntity.ok("Hola");
	}
	
	@GetMapping("/{num1}/{num2}")
	public ResponseEntity<?> suma(@PathVariable int num1,@PathVariable int num2){
		return ResponseEntity.ok(num1+num2);
	}

}
