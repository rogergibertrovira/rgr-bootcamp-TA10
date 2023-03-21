package CustomException;

public class CustomException extends Exception {
	private static final long serialVersionUID = 1L;

	private int codigoExcepcion;
	private final int CODIGO_DEFECTO = 000;

	public CustomException() {
		super();
		this.codigoExcepcion = CODIGO_DEFECTO;
		System.out.println("Excepcion capturada con mensaje (Objecto Excepcion)");
	}

	public CustomException(int codigo) {
		super();
		this.codigoExcepcion = codigo;
	}

	@Override
	public String getMessage() {
		String mensaje = "";

		switch (codigoExcepcion) {
		case 001:
			mensaje = "Es un numero impar";
			break;
		case 002:
			mensaje = "Es un numero par";
			break;
		}

		return mensaje;
	}

}
