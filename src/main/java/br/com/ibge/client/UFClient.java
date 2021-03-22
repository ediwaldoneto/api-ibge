package br.com.ibge.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ibge.model.UF;


@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/", name = "ibge")
public interface UFClient {

	@RequestMapping(method = RequestMethod.GET, value = "/{uf}", consumes = "application/json")
	UF findByUF(@PathVariable("uf") String uf);

	@RequestMapping(method = RequestMethod.GET,  consumes = "application/json")
	List<UF> findAll();
}
