package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.MatriculaVehiculo;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class MatriculaVehiculoRepositoryImpl implements MatriculaVehiculoRepository {

	private static List<MatriculaVehiculo> baseDatosMatriculaVehiculo = new ArrayList<>();

	@Override
	public void insertar(MatriculaVehiculo matriculaVehiculo) {
		// TODO Auto-generated method stub
		baseDatosMatriculaVehiculo.add(matriculaVehiculo);

	}

	@Override
	public void actualizar(MatriculaVehiculo matriculaVehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(matriculaVehiculo.getVehiculo());

		this.insertar(matriculaVehiculo);

	}

	@Override
	public void eliminar(Vehiculo placa) {
		// TODO Auto-generated method stub
		MatriculaVehiculo matriculaVehiculo = this.seleccionar(placa);

		baseDatosMatriculaVehiculo.remove(matriculaVehiculo);

	}

	@Override
	public MatriculaVehiculo seleccionar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		MatriculaVehiculo matriculaEncontrada = new MatriculaVehiculo();
        for (MatriculaVehiculo matricula : baseDatosMatriculaVehiculo){
            if ( vehiculo.equals(vehiculo.getPlaca())){
            	matriculaEncontrada = matricula;
            }else {
            	System.out.println("NO EXISTE ESE VEHICULO");
            }
        }
        return matriculaEncontrada;
	}

}
