package com.br.integracao.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.integracao.api.controller.api.util.Utils;

@RestController
public class DiaSemanaController {

	@GetMapping
	public String getStatus() {
		return "Projeto em execução";
	}
	
	@GetMapping("/diadasemana")
	public ResponseEntity<String> diadasemana() {
		
		Utils utils = new Utils();
		
		return new ResponseEntity<>(utils.retornaDiaSemana(), HttpStatus.OK);
	}
	
}
