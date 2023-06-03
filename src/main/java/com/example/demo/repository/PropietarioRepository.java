package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

public interface PropietarioRepository {

	public void insertar(Propietario propietario);

	public void actualizar(Propietario propietario);

	public void eliminar(String id);

	public Propietario seleccionar(String id);

}
