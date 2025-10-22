import java.util.Scanner;

//Un alumno desea saber cuál será su promedio general en las tres materias más 
//difíciles que cursa y cuál será el promedio que obtendrá 


public class Ej10{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Promedio ==========");

	System.out.print("\n\t\t Ingrese la calificación de la primer materia: ");
	float cal1 = sc.nextFloat();

	System.out.print("\n\t\t Ingrese la calificación de la segunda materia: ");
	float cal2 = sc.nextFloat();

	System.out.print("\n\t\t Ingrese la calificación de la tercer materia: ");
	float cal3 = sc.nextFloat();

	float promediog = (cal1 + cal2 + cal3) / 3;

	System.out.printf("\n\t\t El promedio general es de: %.2f \n", promediog);
	}
}