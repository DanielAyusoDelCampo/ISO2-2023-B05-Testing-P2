package test.iso.b05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ecuacion_2_grado.*;

import org.junit.jupiter.api.function.Executable;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test_cobertura_1()
    {
    	// a = 2, b = -7, c = 3
    	// X1 = 3, X2 = 0,5
        double a = 2;
        double b = -7;
        double c = 3;
        double[] raices = Ec2oGrado.calcularRaices(a, b, c);
        // Dos raices reales
        assertEquals(raices[0], 3.00);
        assertEquals(raices[1], 0.50);
    }
    
    @Test
    public void test_cobertura_2()
    {
    	// a = 1, b = -2, c = 1
        double a = 1;
        double b = -2;
        double c = 1;
        double[] raices = Ec2oGrado.calcularRaices(a, b, c);
        // Una sola raiz
        assertEquals(raices[0], 1.00);
        assertEquals(raices[1], 1.00);
        
    }
    
    @Test
    public void test_cobertura_3()
    {
    	// a = 1, b = 1, c = 1
        double a = 1;
        double b = 1;
        double c = 1;
        // NoRaizRealException. No hay raices reales
        NoRaizRealException thrown = assertThrows(  
        		NoRaizRealException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );
    }
    
    @Test
    public void test_cp1()
    {
    	// a = 0, b = -1, c= 1
        double a = 0;
        double b = -1;
        double c = 1;
        // NoEc2oGradoException. No es ecuacion de segundo grado
        NoEc2oGradoException thrown = assertThrows(  
        		NoEc2oGradoException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );
    }
    
    @Test
    public void test_cp2()
    {
    	// a = -1, b = 0, c = -1
        double a = -1;
        double b = 0;
        double c = -1;
        // NoRaizRealException. No hay raices reales
        NoRaizRealException thrown = assertThrows(  
        		NoRaizRealException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );
        
    }
    
    @Test
    public void test_cp3()
    {
    	// a = 1, b = 1, c = -4
    	// X1 = 1,56, X1 = -2,56
        double a = 1;
        double b = 1;
        double c = -4;
        double[] raices = Ec2oGrado.calcularRaices(a, b, c);
        // Dos raices reales
        assertEquals(raices[0], 1,56);
        assertEquals(raices[1], -2,56);
        
    }
    @Test
    public void test_cp4()
    {
    	// a = -4, b = 8, c = 0
    	// X1 = -0,00, X1 = 2,00
        double a = -4;
        double b = 8;
        double c = 0;
        double[] raices = Ec2oGrado.calcularRaices(a, b, c);
        // Dos raices reales
        assertEquals(raices[0], -0,00);
        assertEquals(raices[1], 2,00);
        
    }
    
    @Test
    public void test_cp5()
    {
    	// a = 80000, b = -80000, c = 80000
        double a = 80000;
        double b = -80000;
        double c = 80000;
        // NoRaizRealException. No hay raices reales
        NoRaizRealException thrown = assertThrows(  
        		NoRaizRealException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );
        
    }
    @Test
    public void test_cp6()
    {
    	// a = -80000, b = 80000, c = -80000
        double a = -80000;
        double b = 80000;
        double c = -80000;
        // NoRaizRealException. No hay raices reales
        NoRaizRealException thrown = assertThrows(  
        		NoRaizRealException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );

        
    }
    
    @Test
    public void test_cp7()
    {
    	// a = 8, b = -4, c = 8
        double a = 8;
        double b = -4;
        double c = 8;
        // NoRaizRealException. No hay raices reales
        NoRaizRealException thrown = assertThrows(  
        		NoRaizRealException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						double[] raices = Ec2oGrado.calcularRaices(a, b, c);
					}
				}
        );
    }
    
   
}
