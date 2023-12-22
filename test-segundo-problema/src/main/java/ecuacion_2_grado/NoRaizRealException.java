package ecuacion_2_grado;

public class NoRaizRealException extends RuntimeException {
	
	public NoRaizRealException() {
	}

	public NoRaizRealException(String message) {
		super(message);
	}

	public NoRaizRealException(Throwable cause) {
		super(cause);
	}

	public NoRaizRealException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoRaizRealException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
