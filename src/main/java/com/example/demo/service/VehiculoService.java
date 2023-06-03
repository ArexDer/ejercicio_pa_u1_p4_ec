package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	
public void insertar(Vehiculo vehiculo);
	
    public void actualizar(Vehiculo vehiculo);
    
    public void eliminar(String placa);
    
    public Vehiculo seleccionar(String placa);

}
