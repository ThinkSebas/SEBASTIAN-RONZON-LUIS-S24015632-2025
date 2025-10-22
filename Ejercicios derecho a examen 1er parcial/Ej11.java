import java.util.Scanner;

//Elabore un programa que lea tres valores diferentes y determine el mayor, el 
//menor y el promedio, o en su caso si son iguales.

public class Ej11{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Mayor, Menor, Igual y Promedio ==========");

	System.out.print("\n\t\t Ingrese el primer valor: ");
	double v1 = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el segundo valor: ");
	double v2 = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el tercer valor: ");
	double v3 = sc.nextDouble();
	
	System.out.println("\n\t\t ==================================================== ");
	
	if(v1 == v2 && v1 == v3){
		
		System.out.println("\n\t\t Todos los valores son iguales: " + v1);
	}else{
	
	if(v1 >= v2 && v1 >= v3){

		System.out.println("\n\t\t El valor mayor es: " + v1);
	}else{
		
	if(v2 >= v1 && v2 >= v3){

		System.out.println("\n\t\t El valor mayor es: " + v2);

	}else{
		System.out.println("\n\t\t El valor mayor es: " + v3);

					}
				}

	if(v1 <= v2 && v1 <= v3){

		System.out.println("\n\t\t El valor menor es: " + v1);

	}else{
	
	if(v2 <= v1 && v2 <= v3){

		System.out.println("\n\t\t El valor menor es: " + v2);
	}else{
	
		System.out.println("\n\t\t El valor menor es: " + v3);

				}
			}
		}
	
	double promedio = (v1 + v2 + v3) / 3;
	System.out.printf("\n\t\t El promedio es: %.2f \n", promedio);

	}
}