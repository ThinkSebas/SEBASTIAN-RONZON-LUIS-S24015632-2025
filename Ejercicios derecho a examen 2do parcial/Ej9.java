//Elabora un programa que permita capturar las calificaciones de 6 
//estudiantes y las almacene en un arreglo unidimensional o vector. El programa debe: 
//• Calcular el promedio general del grupo. 
//• Mostrar las calificaciones y el promedio final.

import java.util.Scanner;

class Ej9{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	//Se inicializa y se crea el arreglo donde tiene una dimensión de 6
	double cal[] = new double[6];

	double sum = 0;
	
	//Ciclo para repetir la instrucción 6 veces
	for(int i = 0; i < 6; i++){
	
	//Captura de la calificacion
	System.out.print("\n\t Ingrese la calificación del alumno " + ( i + 1 ) + ": ");
	cal[i] = sc.nextDouble();
	
	//El while sirve para pedir la calificación si la que se ingreso anteriormente fue incorrecta
	while(cal[i] < 1.0 || cal[i] > 10.0 ){

	//Captura de nueva cuenta la calificación hasta que sea correcta
	System.out.print("\n\t La calificación es incorrecta. Ingrese la calificación entre 1.0 a 10.0: ");
	cal[i] = sc.nextDouble();

	}
	
	//Operación para ir sumando las calificaciones
	sum = sum + cal[i];

		}

	System.out.println("\n\t --------------------------------------------- " );

	//Ciclo para repetir y mostra las calificaciones ingresadas
	for(int j = 0; j < 6; j++){
	
	System.out.println("\n\t Ingrese la calificación del alumno calificación del alumno " + (j + 1) + " es: " + cal[j]);

		}

	//Esta opreacion es para sacar el promedio donde se obtiene toda la suma de las calificaciones
	// Y se divide entre la longitud o tamaño del arrego cal[ 6 ] que es 6
	double promedio = sum / cal.length;

	System.out.println("\n\t El promedio general del grupo es: " + promedio);	
	}
}