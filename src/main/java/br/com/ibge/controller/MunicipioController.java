package br.com.ibge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.ibge.client.MunicipioClient;
import br.com.ibge.model.Municipio;

@RestController
public class MunicipioController {

	@Autowired
	private MunicipioClient municipioClient;

	@GetMapping("/v1/estados/{uf}/municipios")
	public ResponseEntity<List<Municipio>> getMunicipio(@PathVariable String uf) {

		List<Municipio> m = municipioClient.findMunicipio(uf);

		return m != null ? ResponseEntity.ok().body(m) : ResponseEntity.notFound().build();
	}

}
