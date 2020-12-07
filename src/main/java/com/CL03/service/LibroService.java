package com.CL03.service;

import java.util.List;

import com.CL03.entity.Libro;

public interface LibroService {

	

	public List<Libro> listaLibroPorTipo(String tipo);
	public List<Libro> listaLibro();
	
}
