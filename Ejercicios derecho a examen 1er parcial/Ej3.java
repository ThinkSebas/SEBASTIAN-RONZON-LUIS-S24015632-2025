import java.util.Scanner;

//Calcular el número de pulsaciones que una persona debe tener por cada 10 
//segundos de ejercicio, si la fórmula es: número de pulsaciones = (220 - edad)/10 	

class Ej3{

	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);

	System.out.println("\n\t\t ========== Pulsaciones de una persona ==========");

	System.out.print("\n\t\t Introduzca su edad: ");
	int edad = sc.nextInt();

	double npulsaciones = (220 - edad) / 10.0;

	System.out.printf("\n\t\t Debe terner aproximadamente: %.0f pulsaciones por cada 10 segundos de ejercicio. \n", npulsaciones);
	}
}