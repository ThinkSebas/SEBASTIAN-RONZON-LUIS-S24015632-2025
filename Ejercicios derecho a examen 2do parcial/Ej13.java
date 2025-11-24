//Se desea almacenar en una matriz el número de alumnos con el que cuenta 
//una academia, ordenados en función del nivel y del idioma que se estudia. 
//Tendremos 3 filas que representarán al Nivel básico, medio y de 
//perfeccionamiento y 4 columnas en las que figurarán los idiomas (0 = Inglés, 
//1 = Francés, 2 = Alemán y 3 = Ruso). Se pide construir una matriz 
//que con lectura de teclado indique, en qué nivel se encuentran 12 estudiantes. 

import java.util.Scanner;

class E13{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	//Se crea y se inicializa la matriz de 3 por 4
	int academia[][] = new int[3][4];

	//Ciclo que repite la intrucción por cada estudiante hasta llegar a 12
	for(int i = 1; i <= 12; i++){

	System.out.println( "\n\t ---- Nivel ----");

	System.out.println( "\n\t Nivel basico = 1");
	System.out.println( "\n\t Nivel medio = 2 ");		
	System.out.println( "\n\t Perfeccionamiento = 3 ");
	System.out.printf("\n\t Ingrese en que nivel se encuentra el estudiante %d (1-3): " , i);
	int nivel = sc.nextInt();

	//Si el usuario ingresa un número que este fuera del rango entra a este ciclo
	//hasta que no ingrese un numero entre 1-3 no sale del ciclo
	while(nivel < 1 || nivel > 3){

	System.out.printf("\n\t Número incorrecto. Ingrese el nivel (1-3): ");
	nivel = sc.nextInt();

	}
	

	System.out.println( "\n\t ---- Idioma ----");	

	System.out.println( "\n\t Ingles = 1");
	System.out.println( "\n\t Francés = 2 ");		
	System.out.println( "\n\t Alemán = 3 ");
	System.out.println( "\n\t Ruso = 4 ");
	System.out.print("\n\t Ingrese el idioma (1-4): ");
	int idioma = sc.nextInt();
	
	//Si el usuario ingresa un número que este fuera del rango entra a este ciclo
	//hasta que no ingrese un numero entre 1-4 no sale del ciclo
	while(idioma < 1 || idioma > 4){

	System.out.printf("\n\t Número incorrecto. Ingrese el idioma (1-4): ");
	idioma = sc.nextInt();

	}
		//El valor del arreglo aumenta y resta menos 1 porque los valores que se piden empiezan 
		//de 1-3 o 1-4 e incrementa la cantidad de estudiantes que coincidan con los valores ingresados
		//Ej estudiante nivel = 1 e ingles = 1 
		//La linea realiza una resta 0,0 y lo guarda en la parte [0][0] de la matriz
		academia[nivel - 1][idioma - 1]++;

		}

	//En esta parte se crean los arreglos de niveles e idiomas 
	// esto es para darle forma a la matriz que se va a imprimir en pantalla

	String niveles[] = {"Nivel basico","Nivel medio", "Perfeccionamiento"};
	String idiomas[] = {"Ingles","Francés","Alemán","Ruso"};

	System.out.println("\n\t\t--- Matriz de alumnos ---\n");

	//esta parte es para darle forma a lo que se muestra en pantalla
	//Los %-20 significa que son los espacios que habra entre cada palabra
	//La letra "s" en %-20s es porque lo que se mostrara es un string
	System.out.printf("\t%-20s", "");

	//ciclo para mostrar los idiomas del arreglo de idiomas
	for (int j = 0; j < 4; j++) {
		//Imprime los idiomas escritos en el arreglo con forma y espacios gracias a %-15s
		System.out.printf("%-15s", idiomas[j]);

			}

	System.out.println("\n");

	//ciclo para mostrar los niveles del arreglo de niveles
	for (int i = 0; i < 3; i++) {

	//Imprime los niveles escritos en el arreglo con forma y espacios gracias a %-20s
	System.out.printf("\t%-20s", niveles[i]);
		
		//ciclo para imprimir los valores que se guardaron en la matriz de la linea = academia[nivel - 1][idioma - 1]++;
		for (int j = 0; j < 4; j++) {
			
			//Imprime los valores guardados en la matriz con forma y espacios gracias a %-15s
			System.out.printf("%-15s",academia[i][j] );
	}

	System.out.println("\n");

		}
	}
}