package TA10_Ex3;

import CustomException.CustomException;

public class ParImparApp {

	public static void main(String[] args) {
		int numeroAleatorio = numeroAleatorio(0, 999);

		System.out.println("Generando numero aleatorio...");

		try {
			System.out.println("El numero aleatorio generado es: " + numeroAleatorio);
			if (esPar(numeroAleatorio)) {
				throw new CustomException(002);
			} else {
				throw new CustomException(001);
			}
		} catch (CustomException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static boolean esPar(int num) {
		return num % 2 == 0;
	}
}
