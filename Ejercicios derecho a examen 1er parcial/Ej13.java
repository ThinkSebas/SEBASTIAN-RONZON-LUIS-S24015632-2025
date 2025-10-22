import java.util.Scanner;

//Dados tres números que correspondan a los coeficientes A, B y C de la 
//ecuación de segundo grado: A * X ^ 2 + B * X + C = 0. Calcular y desplegar 
//el valor de las raíces reales. Se deberá desplegar un mensaje de error para el 
//caso de raíces imaginarias y también si A=0, indicando que la ecuación no es 
//cuadrática.

//Formula general

//      -B ± √(B^2 - 4*A*C)
// x = ------------------------
//            2*A

public class Ej13{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Ecuación cuadrática ==========");

	System.out.print("\n\t\t Ingrese el valor del coeficiente A: ");
	double a = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el valor del coeficiente B: ");
	double b = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el valor del coeficiente C: ");
	double c = sc.nextDouble();
	
	//avisa si la ecuación es cuadratica o no
	if ( a == 0 ){
		
		System.out.println("\n\t\t La ecuación no es cuadratica porque A no puede ser igual a 0 (A=0) ");	

	}else{

	//El discriminante es para conocer si las raices son imaginarias 
	//Son imaginarias si el discriminante es menor a 0 (si es negativo)
	double discriminante = (b * b) - (4 * a * c);

	if ( discriminante < 0 ){
	
		System.out.print("\n\t\t No se puede porque las raíces son imaginarias y deben ser reales, intenta con otros valores \n");
	
	}else{
		//Math.sqrt() es para calcular la raiz cuadrada de un numero 

		double r1 = (-b +  Math.sqrt(discriminante) ) / (2 * a);
		double r2 = (-b -  Math.sqrt(discriminante) ) / (2 * a);

		//Se calculan las raices
		//Se hace dos veces porque tiene dos soluciones
		// con + y con -

		System.out.printf("\n\t\t valor de Raíz 1: %.2f \n", r1);
		System.out.printf("\n\t\t valor de Raíz 2: %.2f \n", r2);
			
			}
		}
	}
}