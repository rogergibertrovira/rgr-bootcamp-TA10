package TA10_Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculosApp {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = -1;

		Calculo calculo = new Calculo();
		
		while (opcion != 0) {
			try {
				System.out.print(
						"Selecciona una operacion: \n 1 - Suma \n 2 - Resta \n 3 - Multiplicacion \n 4 - Potencia\n 5 - Raiz cuadrada \n 6 - Raiz cubica \n 7 - Division \n 0 - Terminar \n Opcion: ");
				opcion = scanner.nextInt();

				if (opcion != 0) {
					calculo.realizarCalculo(opcion);
				}
			} catch (InputMismatchException ex) {
				System.out.println("No has introducido una opcion con el formato correcto (debe ser un entero) (" + ex + ")\n");
				scanner.next();
			}
		}
		scanner.close();
		System.out.println("\n--- FIN DEL PROGRAMA --- ");
	}
}
