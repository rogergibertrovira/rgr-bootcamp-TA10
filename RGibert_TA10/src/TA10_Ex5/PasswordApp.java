package TA10_Ex5;

import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la cantidad de contraseñas: ");
		int cantidad = scanner.nextInt();

		Password[] contrasenas = new Password[cantidad];
		boolean[] contrasenasFuertes = new boolean[cantidad];

		System.out.print("\nIntroduce la longitud de las contraseñas: ");
		int longitud = scanner.nextInt();
		System.out.println();

		for (int i = 0; i < cantidad; i++) {
			contrasenas[i] = new Password(longitud);
			contrasenasFuertes[i] = contrasenas[i].esFuerte();

			System.out.println(contrasenas[i].getContraseña() + " " + contrasenasFuertes[i]);
		}
		
		System.out.println("\n--- FIN DEL PROGRAMA ---");
		scanner.close();
	}

}
