import java.util.Scanner;

class TrianguloFloydNumeros {

	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);

	int a;
	int num = 1;

	System.out.print("\n\t\t Introduzca un numero para la altura de la piramide: ");
	a = sc.nextInt();

	System.out.println();

	//ciclo de la altura del triangulo
	for (int i = 1; i <= a; i++) {

		//ciclo de los espacios para centrar
		for (int n = a - i; n > 0; n--){
	
			System.out.print("  ");

			
		}

		//ciclo para imprimir los numeros
		for (int j = 1; j <= i; j++) {
		
		System.out.print(num + "  ");	

		num = num + 1;
		
		}
		//Salto de linea para formar la piramide
		System.out.println(" \n ");

		}
	}
}