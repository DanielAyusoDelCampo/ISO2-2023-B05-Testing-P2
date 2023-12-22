package ecuacion_2_grado;

public class Ec2oGrado {
	
	public static double[] calcularRaices(double a, double b, double c) {
		// Declaracion de variables
		double[] raices = new double[2];
		
		// Comprobacion del coeficiente a
		if (a == 0)
			throw new NoEc2oGradoException("No es una ecuacion de segundo grado");
		
		// Calculo del discriminante
		double discriminante = b * b - 4 * a * c;

		// Logica
		if (discriminante > 0) { // Hay 2 raíces reales
			raices[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
			raices[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
		} else if (discriminante == 0) { // Hay 1 raíz real
			raices[0] = raices[1] = -b /  (2 * a);
		} else // No hay raíces reales, sino imaginarias
			throw new NoRaizRealException("No hay raices reales");
		
		return raices;
	}
	
}
