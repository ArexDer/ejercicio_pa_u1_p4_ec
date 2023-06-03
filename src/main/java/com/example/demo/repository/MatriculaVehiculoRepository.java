package com.example.demo.repository;

import com.example.demo.repository.modelo.MatriculaVehiculo;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

public interface MatriculaVehiculoRepository {

	public void insertar(MatriculaVehiculo matriculaVehiculo);

	public void actualizar(MatriculaVehiculo matriculaVehiculo);

	public void eliminar(Vehiculo placa);

	public MatriculaVehiculo seleccionar(Vehiculo placa);

}
