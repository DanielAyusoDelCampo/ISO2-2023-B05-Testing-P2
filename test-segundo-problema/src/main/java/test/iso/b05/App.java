package test.iso.b05;

import user.cli.Input;

import java.io.PrintStream;
import java.util.Scanner;

import ecuacion_2_grado.*;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		try {
			Input in = new Input(new Scanner(System.in), new PrintStream(System.out));

			System.out.println("Introduzca los coeficientes de la ecuacion de segundo grado en orden:");
			
			double a = in.getDouble();
			double b = in.getDouble();
			double c = in.getDouble();

			System.out.printf("\nLa ecuacion que el programa va a resolver es %.2fx² + %.2fx + %.2f.\n", a, b, c);
			
			// a = 2, b = -7, c = 3
			// a = 1, b = -2, c = 1
			// a = 1, b = 1, c = 1
			
			double[] raices = Ec2oGrado.calcularRaices(a, b, c);

			System.out.printf("Las soluciones de la ecuacion son:\nX1 = %.2f y \nX2 = %.2f.", raices[0], raices[1]);
		
		} catch(NoRaizRealException e) {
			System.err.println(e.toString());
		} catch(NoEc2oGradoException e) {
			System.err.println(e.toString());
		}
	}
	
}

