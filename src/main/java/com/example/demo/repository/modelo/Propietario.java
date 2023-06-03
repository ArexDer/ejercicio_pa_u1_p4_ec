package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Propietario {
	
	private String nombre;
	private String apellido;
	private String id;
    private LocalDateTime fechaDeNacimiento;
    
    
    //GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}
	
    
    
    

}
