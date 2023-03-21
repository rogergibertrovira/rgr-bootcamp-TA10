package TA10_Ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculo {
	// Atributos
	private double num1;
	private double num2;
	static Scanner scanner = new Scanner(System.in);

	// Constructores
	public Calculo() {
	}

	// Métodos
	public void realizarCalculo(int opcion) {
		try {
			switch (opcion) {
			case 0:
				break;
			case 1:
				suma();
				break;
			case 2:
				resta();
				break;
			case 3:
				multiplicacion();
				break;
			case 4:
				potencia();
				break;
			case 5:
				raizCuadrada();
				break;
			case 6:
				raizCubica();
				break;
			case 7:
				division();
				break;
			default:
				throw new InputMismatchException();
			}

		} catch (Exception ex) {
			System.out.println("No has introducido una opcion correcta (opcion: 1 - 7) (" + ex + ")\n");

		}
	}

	public void suma() {
		System.out.println("\n--- SUMA --- ");
		System.out.print("Entra primer sumando: ");
		this.num1 = scanner.nextDouble();
		System.out.print("Entra segundo sumando: ");
		this.num2 = scanner.nextDouble();
		System.out.println("Resultado: " + this.num1 + " + " + this.num2 + " = " + (this.num1 + this.num2) + "\n");
	}

	public void resta() {
		System.out.println("\n--- RESTA --- ");
		System.out.print("Entra minuendo: ");
		this.num1 = scanner.nextDouble();
		System.out.print("Entra sustraendo: ");
		this.num2 = scanner.nextDouble();
		System.out.println("Resultado: " + this.num1 + " - " + this.num2 + " = " + (this.num1 - this.num2) + "\n");
	}

	public void multiplicacion() {
		System.out.println("\n--- MULTIPLICACION --- ");
		System.out.print("Entra primer factor: ");
		this.num1 = scanner.nextDouble();
		System.out.print("Entra segundo factor: ");
		this.num2 = scanner.nextDouble();
		System.out.println("Resultado: " + this.num1 + " * " + this.num2 + " = " + (this.num1 * this.num2) + "\n");
		;
	}

	public void potencia() {
		System.out.println("\n--- POTENCIA --- ");
		System.out.print("Entra base: ");
		this.num1 = scanner.nextDouble();
		System.out.print("Entra exponente: ");
		this.num2 = scanner.nextDouble();
		System.out.println("Resultado: " + this.num1 + " ^ " + this.num2 + " = " + Math.pow(this.num1, this.num2) + "\n");
	}

	public void raizCuadrada() {
		System.out.println("\n--- RAIZ CUADRADA --- ");
		System.out.print("Entra el radicando: ");
		this.num1 = scanner.nextDouble();
		try {
			if (this.num1 < 0) {
				throw new ArithmeticException();
			} else {
				System.out.println("Resultado: " + "Raiz cuadrada de " + this.num1 + " = " + (Math.sqrt(this.num1)) + "\n");
			}
		} catch (ArithmeticException ex) {
			System.out.println("No existe raiz cuadrada de un numero negativo (" + ex + ")\n");
		}
	}

	public void raizCubica() {
		System.out.println("\n--- RAIZ CUBICA --- ");
		System.out.print("Entra el radicando: ");
		this.num1 = scanner.nextDouble();
		System.out.println("Resultado: " + "Raiz cubica de " + this.num1 + " = " + (Math.cbrt(this.num1)) + "\n");
	}

	public void division() {
		System.out.println("\n--- DIVISION --- ");
		System.out.print("Entra dividendo: ");
		this.num1 = scanner.nextDouble();
		System.out.print("Entra divisor: ");
		this.num2 = scanner.nextDouble();
		try {
			if (this.num2 == 0) {
				throw new ArithmeticException();
			} else {
				System.out.println("Resultado: " + this.num1 + " / " + this.num2 + " = " + (this.num1 / this.num2) + "\n");
			}
		} catch (ArithmeticException ex) {
			System.out.println("No se puede dividir entre 0 (" + ex + ")\n");
		}
	}
}
