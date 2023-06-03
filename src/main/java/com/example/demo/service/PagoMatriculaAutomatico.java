package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
@Service("automatico")
public class PagoMatriculaAutomatico implements PagoMatricula {

	@Override
	public BigDecimal pago(BigDecimal precioAPagar) {
		// TODO Auto-generated method stub
		 BigDecimal cuota = precioAPagar.multiply(new BigDecimal(0.10));
	        return precioAPagar.add(cuota);
		
	}

}
