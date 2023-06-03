package com.example.demo.service;

import com.example.demo.repository.modelo.MatriculaVehiculo;
import com.example.demo.repository.modelo.Vehiculo;

public interface MatriculaVehiculoService {

	public void insertar(MatriculaVehiculo matriculaVehiculo);

	public void actualizar(MatriculaVehiculo matriculaVehiculo);

	public void eliminar(Vehiculo placa);

	public MatriculaVehiculo seleccionar(Vehiculo placa);
	
	public void operacion(String tipo);

}
