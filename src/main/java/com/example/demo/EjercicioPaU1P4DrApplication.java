package com.example.demo;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@SpringBootApplication
public class EjercicioPaU1P4DrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4DrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo ve = new Vehiculo();
		ve.setPlaca("PC12");
		ve.setMarca("Chevrolet");
		ve.setModelo("sss");
		ve.setPrecio(new BigDecimal(23.999));
		ve.setTipo("Manual");
		
		Propietario p = new Propietario();
		p.setNombre("Ivan");
		p.setApellido("Perez");
		p.setFechaDeNacimiento(null);
		p.setId("1234567890");
		
		
		
		
		
		
		
		
	}

}
