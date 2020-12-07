package com.CL03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CL03.entity.Libro;
import com.CL03.service.LibroService;

@RestController
@RequestMapping("/api/rest/libro")
public class LibroController {

	@Autowired
	private LibroService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Libro>> lista(){
		return ResponseEntity.ok(service.listaLibro());
	}
	
	@GetMapping("/porTipo/{filtro}")
	public ResponseEntity<List<Libro>> listaPorNombre(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaLibroPorTipo(filtro));
	}
	
}
