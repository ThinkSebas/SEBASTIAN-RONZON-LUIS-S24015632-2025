import java.util.Scanner;

//Realizar un programa que calcule la edad de una persona

class Ej4{
	
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("\n\t\t ========== Calcular la edad de una persona ========== ");

	System.out.print("\n\t\t Introduzca el año de nacimiento: ");
	int an = sc.nextInt();

	System.out.print("\n\t\t Introduzca el año actual: ");
	int aa = sc.nextInt();

	int edad = aa - an;

	System.out.printf("\n\t\t La persona tiene %d años \n",edad );

	}
}