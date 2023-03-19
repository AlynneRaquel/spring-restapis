package com.algaworks.algalog.api.exceptionhandler;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
	
	private Integer Status;
	private LocalDate dataHora;
	private String titulo;
	private List<Campo> campos;
	
	//uma classe dentro da outra
	@AllArgsConstructor
	@Getter
	public static class Campo {
		
		private String nome;
		private String mensagem;
	}
	
	
	
	

}
