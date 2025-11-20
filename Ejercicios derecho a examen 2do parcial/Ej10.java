//Diseña un programa que lea 10 números y los almacene en un vector. Al 
//final, muestra los números en orden inverso al que fueron capturados. 

import java.util.Scanner;

class Ej10{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	////Se inicializa y se crea el arreglo donde tiene una dimensión de 10
	int num[] = new int[10];

	//Ciclo para repetir la instrucción 10 veces
	for(int i = 0; i < 10; i++){

	//Captura los números que se ingresaran
	System.out.print("\n\t Ingrese el número " + (i + 1) + ": ");
	num[i] = sc.nextInt();
	
		}

	System.out.println("\n\t --------------------------------------------- " );
	System.out.println("\n\n\t Lista de números en orden inverso al que fueron capturados " );

	//Ciclo para mostrar los número en orden inverso 
	//Empieza a mostrar desde el ultimo número ingresado hasta el primero
	for(int j = 9; j >= 0; j--){
	
	System.out.println("\n\t " + num[j]);
	
		}
	}
}