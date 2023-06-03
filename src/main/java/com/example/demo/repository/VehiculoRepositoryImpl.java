package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {
	
	private static List<Vehiculo> baseDatosVehiculo = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatosVehiculo.add(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		
        this.insertar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.seleccionar(placa);
		
		baseDatosVehiculo.remove(vehiculo);
		
	}

	@Override
	public Vehiculo seleccionar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo VehiculoEncontrada = new Vehiculo();
        for (Vehiculo vehiculo : baseDatosVehiculo){
            if ( placa.equals(vehiculo.getPlaca())){
            	VehiculoEncontrada = vehiculo;
            }else {
            	System.out.println("NO EXISTE ESE VEHICULO");
            }
        }
        return VehiculoEncontrada;
	}

}
