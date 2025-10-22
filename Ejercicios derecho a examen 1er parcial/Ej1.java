import java.util.Scanner;

// Programa que convierta de metros a pies y pulgadas. 

class Ej1{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("\n\n\t\t Ingrese el valor en metros: ");
	double m = sc.nextDouble();

	System.out.print("\n\n\t\t ========== Valor en Pies (ft) ========== ");
	double pie = m * 3.2808399;
	System.out.printf ( "\n\n\t\t Valor ingresado: " + m + " m \n\n\t\t Equivale a: %.2f ft \n", pie);

	System.out.print("\n\t\t ========== Valor en Pulgadas (in) ========== ");
	double pulgada = m * 39.3700787;
	System.out.printf ( "\n\n\t\t Valor ingresado: " + m + " m \n\n\t\t Equivale a: %.2f in \n", pulgada);
	}
}