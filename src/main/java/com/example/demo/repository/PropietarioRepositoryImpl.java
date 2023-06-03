package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository {

	private static List<Propietario> baseDatosPropietario = new ArrayList<>();

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatosPropietario.add(propietario);

	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.eliminar(propietario.getId());

		this.insertar(propietario);

	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Propietario propietario = this.seleccionar(id);

		baseDatosPropietario.remove(propietario);

	}

	@Override
	public Propietario seleccionar(String id) {
		// TODO Auto-generated method stub
		Propietario propietarioEncontrada = new Propietario();
        for (Propietario propietario : baseDatosPropietario){
            if ( id.equals(propietario.getId())){
            	propietarioEncontrada = propietario;
            }else {
            	System.out.println("NO EXISTE ESE VEHICULO");
            }
        }
        return propietarioEncontrada;
	}

}
