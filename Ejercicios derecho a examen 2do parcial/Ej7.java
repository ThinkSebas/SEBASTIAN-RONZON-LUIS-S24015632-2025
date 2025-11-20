//Desarrollar un programa que solicite un numero entero y muestre su tabla de 
//multiplicar del 1 al 10, utilizando un ciclo for.

import java.util.Scanner;

class Ej7{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("\n\t Introduzca un número entero para mostrar la tabla de multiplicar: ");
	int num = sc.nextInt();

	//ciclo para poner un limite de 0 a 10 en la tabla de multiplicar
	for(int i = 0; i <= 10; i++){
	
	//operacion para mostrar el resultado de las multiplicaciones
	int m = num * i;

	System.out.println("\n\t " + num + " * " + i + " = " + m);

		}		
	}
}