package br.com.ibge.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ibge.model.Municipio;

@FeignClient(url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados/", name = "municipio")
public interface MunicipioClient {

	@RequestMapping(method = RequestMethod.GET, value = "/{uf}/municipios", consumes = "application/json")
	List<Municipio> findMunicipio(@PathVariable("uf") String uf);
}
