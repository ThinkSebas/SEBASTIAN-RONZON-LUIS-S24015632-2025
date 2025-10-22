import java.util.Scanner;

//Dado un número N, despliegue el número y despliegue un mensaje diciendo 
//si dicho número es Primo o no. 

public class Ej17{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("\n\t\t ========== Número primo ==========");

	System.out.print("\n\t\t Ingrese un número entero: ");
	int numero = sc.nextInt();

	//el numero 1 y el 0 no son primos
	if (numero <= 1) {

	System.out.println("\n\t\t El número NO es Primo");

	//si el numero es el 2 si es primo
	 } else if (numero == 2) {

	System.out.println("\n\t\t El número es Primo");

	 } else if (numero % 2 == 0) {

	System.out.println("\n\t\t El número NO es Primo");

	//Si el numero es divisible entre y y no es 3 entonces no es primo asi con el otro if

	} else if (numero % 3 == 0 && numero != 3) {

	System.out.println("\n\t\t El número NO es Primo");

	} else if (numero % 5 == 0 && numero != 5) {

	System.out.println("\n\t\t El número NO es Primo");

	} else {

	System.out.println("\n\t\t El número es Primo");
		}
	sc.close();
	}
}