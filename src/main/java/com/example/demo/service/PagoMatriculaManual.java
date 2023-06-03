package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class PagoMatriculaManual implements PagoMatricula {

	public BigDecimal pago(BigDecimal precioAPagar) {
		// TODO Auto-generated method stub
		 BigDecimal cuota = precioAPagar.multiply(new BigDecimal(0.15));
	        return precioAPagar.add(cuota);
		
	}

}
