package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void testSumar() {
		//para esta prueba espero que la suma me de 5, resultado de 3+2
		int resultado = Calculadora.sumar(2,3);
		assertEquals(5, resultado); //lo que espero y lo que tengo
		
	}
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		assertEquals(6, resultado);
	}

	@Test
	void testDivision() {
		float resultado = Calculadora.dividir(6.0f, 2.0f);
		assertEquals(3, resultado);
	}
	
	/*
	@Test(expected = ArithmeticException.class)
	void testDivision() {
		float resultado = Calculadora.dividir(6.0f, 2.0f);
		assertEquals(3, resultado);
	}*/
	

}
