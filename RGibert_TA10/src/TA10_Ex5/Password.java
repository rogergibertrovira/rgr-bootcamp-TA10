package TA10_Ex5;

public class Password {

	// Atributos
	private int longitud;
	private String contraseña;

	// Constructores
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = "";

		generarPassword();
	}

	// Métodos

	public boolean esFuerte() {
		int mayus = 0, minus = 0, numbers = 0;

		for (int i = 0; i < this.longitud; i++) {
			char c = this.contraseña.charAt(i);
			if (Character.isDigit(c)) {
				numbers++;
			} else if (Character.isUpperCase(c)) {
				mayus++;
			} else if (Character.isLowerCase(c)) {
				minus++;
			}
		}
		return mayus > 2 && minus > 1 && numbers > 5;
	}

	public void generarPassword() {
		for (int i = 0; i < this.longitud; i++) {
			this.contraseña += randomChar();
		}
	}

	private char randomChar() {
		char alfabeto[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
				'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
				'y', 'z' };

		char nextChar = alfabeto[(int) (Math.random() * alfabeto.length)];
		return nextChar;
	}

	@Override
	public String toString() {
		return "Password: " + this.contraseña + " (longitud " + this.longitud + ")";
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

}