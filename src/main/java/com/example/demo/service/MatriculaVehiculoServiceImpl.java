package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaVehiculoRepository;
import com.example.demo.repository.modelo.MatriculaVehiculo;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaVehiculoServiceImpl implements MatriculaVehiculoService{
	
	@Autowired
	private MatriculaVehiculoRepository matriculaVehiculoRepository;

	@Override
	public void insertar(MatriculaVehiculo matriculaVehiculo) {
		// TODO Auto-generated method stub
		this.matriculaVehiculoRepository.insertar(matriculaVehiculo);
		
	}

	@Override
	public void actualizar(MatriculaVehiculo matriculaVehiculo) {
		// TODO Auto-generated method stub
		this.matriculaVehiculoRepository.actualizar(matriculaVehiculo);
	}

	@Override
	public void eliminar(Vehiculo placa) {
		// TODO Auto-generated method stub}
		this.matriculaVehiculoRepository.eliminar(placa);
		
	}

	@Override
	public MatriculaVehiculo seleccionar(Vehiculo placa) {
		// TODO Auto-generated method stub
		return this.matriculaVehiculoRepository.seleccionar(placa);
	}

	@Override
	public void operacion(String tipo) {
		// TODO Auto-generated method stub
	
		
		
	}
	

}
