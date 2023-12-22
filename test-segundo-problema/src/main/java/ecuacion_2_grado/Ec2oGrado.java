package ecuacion_2_grado;

public class Ec2oGrado {
	
	public static double[] calcularRaices(double a, double b, double c) {
		// Declaraci�n de variables
		double[] raices = new double[2];
		
		// Comprobaci�n del coeficiente a
		if (a == 0)
			throw new NoEc2oGradoException("No es una ecuaci�n de segundo grado");
		
		// C�lculo del discriminante
		double discriminante = b * b - 4 * a * c;

		// L�gica
		if (discriminante > 0) { // Hay 2 ra�ces reales
			raices[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
			raices[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
		} else if (discriminante == 0) { // Hay 1 ra�z real
			raices[0] = raices[1] = -b /  (2 * a);
		} else // No hay ra�ces reales, sino imaginarias
			throw new NoRa�zRealException("No hay ra�ces reales");
		
		return raices;
	}
	
}
