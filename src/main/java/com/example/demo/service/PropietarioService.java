package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(String id);

	public Propietario seleccionar(String id);


}
