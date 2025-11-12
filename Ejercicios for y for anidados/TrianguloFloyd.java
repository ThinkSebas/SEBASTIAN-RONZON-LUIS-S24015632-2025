import java.util.Scanner;

class TrianguloFloyd {

	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);

	int a;

	System.out.print("\n\t\t Introduzca un numero para la altura de la piramide: ");
	a = sc.nextInt();

	System.out.println();

	//ciclo de la altura del triangulo
	for (int i = 1; i <= a; i++) {

		//ciclo de los espacios para centrar
		for (int n = a - i; n > 0; n--){
	
			System.out.print(" \t ");
		}

		//ciclo para imprimir los asteriscos ( * )
		for (int j = 1; j <=( 2 * i - 1); j++) {
		
		System.out.print(" \t * ");
		
		}
		//Salto de linea para formar la piramide
		System.out.println(" \n ");

		}
	}
}