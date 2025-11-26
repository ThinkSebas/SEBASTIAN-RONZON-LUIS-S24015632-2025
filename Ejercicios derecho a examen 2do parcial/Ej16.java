//Desarrolla un programa en Java que registre y muestre la información de los 
//artículos de una tienda de ropa que vende camisas, zapatos y pantalones. El programa deberá: 
//• Usar un arreglo bidimensional de tipo String para almacenar los 
//datos de los artículos (por ejemplo, 3 filas por 4 columnas). 
//• En cada fila se registrará un artículo, y en cada columna sus 
//características: Nombre del artículo (Camisa, Zapato, Pantalón).  Las características (Talla y Color) 
//• Permitir el ingreso de los datos por teclado.
//• Mostrar una tabla con toda la información capturada. 

import java.util.Scanner;

class Ej16{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	

	System.out.println("\n\n\t --------------------- Número de articulos a registrar --------------------- \n");
	
	
	System.out.print("\n\t Ingrese el número de artículos que quiera registrar: ");

		//Condición mientras lo que se ingreso no sea un número entero pide que se ingrese de nuevo
		while(!sc.hasNextInt()){

		System.out.print("\n\t Caracter incorrecto. Ingrese un número entero: ");

		//Limpia lo que se ingreso y es incorrecto
		sc.next();

			}

	//Guarda el número ingresado en la variable 
	int a = sc.nextInt();

	//Condición ahora verifica si el numero ingresado es mayor 
	if(a<=0){
	
		//Si no es mayor vuelve a pedir que se ingrese un numero
		System.out.print("\n\t Caracter incorrecto. Ingrese un número mayo o igual a 1: ");
		a = sc.nextInt();

		}

	//Limpia el salto de linea o "ENTER" despues de un nextInt()
	sc.nextLine();

	//Ahora se inicializa y se crea el arreglo que guardara el nombre, talla y color de los articulos que se ingresaran
	String articulos[][] = new String[a][3];

	for(int i = 0; i < a; i++){

	System.out.printf("\n\n\t --------------------------- Registro del artículo %d -------------------------- \n", (i+1));

	//Guarda el nombre en la fila i, columna 0
	System.out.print("\n\t Ingrese el nombre del artículo: ");
	articulos[i][0] =sc.nextLine();

	//Guarda el nombre en la fila i, columna 1
	System.out.print("\n\t Ingrese la talla del artículo: ");
	articulos[i][1] =sc.nextLine();

	//Guarda el nombre en la fila i, columna 2
	System.out.print("\n\t Ingrese el color del artículo: ");
	articulos[i][2] =sc.nextLine();
 
		}

	//Salto de linea al terminar los registros
	System.out.println();

	System.out.print("\t ================================================================ ");
	
	System.out.printf("\n\t || %-30s || %-10s || %-10s || \n", "Nombre", "Talla", "Color");

	System.out.print("\t ================================================================ \n");

	//Ciclo para imprimir los articulos ingresados anteriormente
	for(int i = 0; i < a; i++){

	System.out.printf("\t || %-30s || %-10s || %-10s || \n", articulos[i][0], articulos[i][1], articulos[i][2]);

	System.out.print("\t ================================================================ ");
		}

	System.out.println();

	}
}








