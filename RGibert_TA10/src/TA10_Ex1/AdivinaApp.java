package TA10_Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int minimo = 1, maximo = 500;
		int numeroAdivinar = -1, numeroEntrado = -1;
		int intentos = 0;
		
		numeroAdivinar = numeroAleatorio(minimo, maximo);
		
		while(numeroEntrado != numeroAdivinar) {
			try {
				System.out.print("Introduce un numero entero entre 1 y 500: ");
				numeroEntrado = scanner.nextInt();
				if(numeroEntrado < numeroAdivinar) {
					System.out.println("El numero debe ser mayor");
				}
				else if(numeroEntrado > numeroAdivinar) {
					System.out.println("El numero debe ser menor");
				}
			} catch (InputMismatchException ex) {
				System.out.println("No has introducido un numero con el formato correcto (debe ser un entero)");
				scanner.next();
			}	
			intentos++;
		}
		
		System.out.println("Has adivinado el numero en " + intentos + " intentos!");
		scanner.close();
	}
	
	public static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}
