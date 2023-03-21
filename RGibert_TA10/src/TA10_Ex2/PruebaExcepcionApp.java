package TA10_Ex2;

import CustomException.CustomException;

public class PruebaExcepcionApp {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje de prueba por pantalla");
			throw new CustomException();
		} catch (CustomException ex) {
			ex.getMessage();
		}
		
		System.out.println("Programa terminado");
	}
}
