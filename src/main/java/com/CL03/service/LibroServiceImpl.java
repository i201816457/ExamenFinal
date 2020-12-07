package com.CL03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CL03.entity.Libro;
import com.CL03.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;


	public List<Libro> listaLibro() {
		return repository.findAll();
	}

	
	public List<Libro> listaLibroPorTipo(String tipo) {
		return repository.listaPorTipo(tipo);
	}
	
	
	
	
}
