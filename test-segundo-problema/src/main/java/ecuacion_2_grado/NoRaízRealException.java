package ecuacion_2_grado;

public class NoRaízRealException extends RuntimeException {
	
	public NoRaízRealException() {
	}

	public NoRaízRealException(String message) {
		super(message);
	}

	public NoRaízRealException(Throwable cause) {
		super(cause);
	}

	public NoRaízRealException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoRaízRealException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
