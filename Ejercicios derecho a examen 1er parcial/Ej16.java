import java.util.Scanner;

//Dado un número N, despliegue dicho número y se despliegue un mensaje 
//diciendo si dicho número es Par o Non.

public class Ej16{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Pares y nones ==========");

	System.out.print("\n\t\t Introduzca un número: ");
	Double n = sc.nextDouble();

	Double r = n % 2;
	
	if(r == 0){

	System.out.println("\n\t\t El número que ingreso es: Par" );

	}else{

	System.out.println("\n\t\t El número que ingreso es: Non" );

		}
	
	sc.close();
	
	}
}