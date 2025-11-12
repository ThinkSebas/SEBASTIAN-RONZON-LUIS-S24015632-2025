import java.util.Scanner;

class Potencia {

	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);

	int a , b;

	System.out.print("\n\t Introduzca un numero: ");
	a = sc.nextInt();

	System.out.print("\n\t Introduzca la potencia de ese numero: ");
	b = sc.nextInt();
	
	//Se debe inicializar con 1 porque cualquier numero elevado a la 0 da 1
	int potencia = 1;	
	
	// La multiplicación se repite por el valor del exponente que es la variable b
	for (int i = 1; i <= b; i++) {

	//el numero se multiplica por la potencia
	potencia = potencia * a;

		}
	System.out.print("\n\t " + a +  " con potencia de " + b + " es: " + potencia + "\n");

	}
}