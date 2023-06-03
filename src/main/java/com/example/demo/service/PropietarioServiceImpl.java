package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	private PropietarioRepository propietarioRepository;

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
		
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(id);
		
	}

	@Override
	public Propietario seleccionar(String id) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionar(id);
	}

}
