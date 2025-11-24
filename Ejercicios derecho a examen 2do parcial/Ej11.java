//Crea un programa que lea 8 números y los almacene en un vector. Luego, 
//pide al usuario que introduzca un número a buscar y muestra si existe o no 
//dentro del arreglo.

import java.util.Scanner;

class E11{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	//Se crea y se inicializa el arreglo
	int numeros[] = new int[8];

	//variable para encontrar el numero como es verdadero o falso se escribe boolean y se inicializa con falso
	boolean numeroE = false;
	//variable para guardar la posicion del numero a buscar
	int posicion = 0;

	System.out.println("\n\t ---- Introduzca 8 números ----");

		//ciclo para introducir los 8 numero 
		for(int i = 0; i < 8; i++){

		//lineas para ingresar los números
		System.out.print("\n\t Introduzca el número " + (i+1) + ": ");
		numeros[i]= sc.nextInt();

		}

		System.out.println("\n\t ---- Buscar numeros ----");
		
		//lineas para introducir el numero que el usuario va a buscar
		System.out.print("\n\t Introduzca el número a buscar: ");
		int buscar = sc.nextInt();

		//ciclo para buscar el número dentro del arreglo
		for(int i = 0; i < 8; i++){

			//Condición si encuentra el numero buscado en el arreglo 
			if(buscar == numeros[i]){
	
			//Si lo encuentra se vuelve verdadera la variable 
			numeroE = true;
			//Linea si se encuentra el número en el vector guarda la poscion en la que se encontro
			posicion = i + 1;
			}
		}
		
		//Condicion si el número se encontro o no en el arreglo 
		if(numeroE){

		//Si se encontro imprime el numero y su posición en el arreglo
		System.out.println("\n\t El numero " + buscar + " se encuentra en el arreglo");
		
		//ciclo por si se encuentra en una o mas posiciones el número 
		for(int i = 0; i < 8; i++){
			//condicion si el numero a buscar esta en el arreglo o no
			if(buscar == numeros[i]){
			//Si esta en el arreglo imprime en que posicion
			System.out.println("\n\t En la posicion " + (i+1));
			}//cierra for
		}else{

		//Si no se encontro imprime que no se encontro
		System.out.println("\n\t El numero " + buscar + " no se encuentra en el arreglo");

		}//cierra if
	}
}