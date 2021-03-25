package br.com.ibge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibge.client.UFClient;
import br.com.ibge.model.UF;

@RestController
public class UFController {

	@Autowired
	private UFClient service;

	@GetMapping("/v1/estados/{uf}")
	public ResponseEntity<UF> getUF(@PathVariable String uf) {
		
		UF uf2 = service.findByUF(uf);
		
		return uf2 != null ? ResponseEntity.ok().body(uf2) : ResponseEntity.notFound().build();
	}
	
	@GetMapping("/v1/estados")
	public ResponseEntity<List<UF>> getAll() {
		
		List<UF> uf2 = service.findAll();
		
		return uf2 != null ? ResponseEntity.ok().body(uf2) : ResponseEntity.notFound().build();
	}
}
