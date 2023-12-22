package ecuacion_2_grado;

public class NoEc2oGradoException extends RuntimeException {
	
	public NoEc2oGradoException() {
	}

	public NoEc2oGradoException(String message) {
		super(message);
	}

	public NoEc2oGradoException(Throwable cause) {
		super(cause);
	}

	public NoEc2oGradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoEc2oGradoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
