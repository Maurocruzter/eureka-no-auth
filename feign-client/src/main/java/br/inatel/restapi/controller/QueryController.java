package br.inatel.restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.restapi.feign.GreetingFeignClient;



@RestController
@RequestMapping("/query")
public class QueryController {
	
	@Autowired
	private GreetingFeignClient queryProxy;
	
	@GetMapping
	public String greeting() {
		
		return queryProxy.greeting();
	}

}
