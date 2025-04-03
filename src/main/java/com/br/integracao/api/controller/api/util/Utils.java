package com.br.integracao.api.controller.api.util;

import java.time.LocalDate;

public class Utils {

	public String retornaDiaSemana() {
		
		LocalDate ld = LocalDate.now();
		String diaSemana = ld.getDayOfWeek().toString().toUpperCase();
		
		switch (diaSemana) {
			case "MONDAY"  -> diaSemana = "SEGUNDA-FEIRA";
			case "TUESDAY" -> diaSemana = "TERÇA-FEIRA";
			case "WEDNESDAY" -> diaSemana = "QUARTA-FEIRA";
			case "THURSDAY" -> diaSemana = "QUINTA-FEIRA";
			case "FRIDAY" -> diaSemana = "SEXTA-FEIRA";
			case "SATURDAY" -> diaSemana = "SÁBADO";
			case "SUNDA" -> diaSemana = "DOMINGO";
		}
		
		return diaSemana;
	}
	
}
