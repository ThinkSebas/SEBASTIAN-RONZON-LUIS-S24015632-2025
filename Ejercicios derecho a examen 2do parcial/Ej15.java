//Desarrolla un programa en Java que permita calcular la temperatura media 
//trimestral de cuatro países, a partir de las temperaturas medias mensuales 
//registradas para cada uno de ellos. Se deben ingresar por teclado: 
//• Los nombres de cuatro países.  
//• Para cada país, se deben registrar tres temperaturas medias mensuales (correspondientes a un trimestre). 
//• Usa un arreglo unidimensional adicional para guardar los nombres de los países  
//• Utiliza una matriz (arreglo bidimensional) para almacenar las temperaturas, donde las filas representen los países y
//las columnas las temperaturas mensuales. 
//• Mostrar en pantalla los nombres de los países junto con las temperaturas ingresadas. 
//• Calcular la temperatura media trimestral de cada país. 
//• Mostrar los nombres de los países junto con su temperatura media trimestral. 
//• Determinar y mostrar el nombre del país con la temperatura media trimestral más alta.




import java.util.Scanner;

class Ej15{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	//Arreglo para guardar el nombre de los paises que son 4
	String pais[] = new String[4];

	//Matriz para guardar la temperatura de 4 paises en tres meses
	int temperatura[][] = new int[4][3];

	//Vector para guardar el promedio de la temperaturade 3 meses de cada pais
	double promedio[] = new double[4];

	//Variable para guardar el promedio total de la temperatura de los paises
	double promediototal = 0;

	//Variable para guardar la temperatura media mayor de los paises
	double promediomayor = 0;

	//Variable para guardar el numero del vector con el nombre del país con la temperatura mayor
	int nombrepais = 0;

	//Ciclo para ingresar el nombre de los paises (4 paises)
	for(int i = 0; i<4; i++){//inicia for i
	
	System.out.printf("\n\n\t--------------------- PAÍS %d ---------------------- \n", i + 1);

	System.out.printf("\n\t Ingrese el nombre del país: ");
	pais[i] = sc.nextLine();

	System.out.println();

		//Ciclo que guarda una por una la temperatura de cada mes
		for(int j = 0; j<3; j++){//inicia for j
	
	System.out.printf("\n\t Ingrese la temperatura en °C de %s en el trimestre %d: ", pais[i] ,(j + 1));
	temperatura[i][j] = sc.nextInt();

		
			}//termina for j

	//Limpia el buffer para evitar que salte el ingreso del siguiente pais
	sc.nextLine();

	System.out.println();
	
		}//termina for i

	//Ciclo para hacer un recorrimiento por cada pais
	for(int i = 0; i<4; i++){

	//Variable para sumar la temperatura de los paises que tenga el valor de i = 0 asi sucesivamente hasta llegar a 3
	double suma = 0;

		//Ciclo para sumar la temperatura de 3 meses de cada país
		for(int j = 0; j<3; j++){

		//Variable que guarda la temperatura, la actualiza y la suma con el anterior
		suma = suma + temperatura[i][j];

		}
	
		//Se realiza la suma y se divide entre 3 que es la cantidad de meses para sacar el promedio y se guarda en el vector 
		promedio[i] = suma / 3;

		//Condición que compara si el pais tiene una temperatura media alta
		if(promedio[i] > promediomayor){

		//Se va actualizando la temperatura mayor
		promediomayor = promedio[i];

		//Guarda la posicion del vector con la temperatura media mas alta y sirve para mostrar el nombre del país
		nombrepais = i;

		}
	}

	System.out.println("\n\n\t--------------------- Tabla de paises y sus temperaturas ---------------------- \n");

	System.out.println("\n\t|País          |Temperatura mes 1          |Temperatura mes 2          |Temperatura mes 3          |");
	
	System.out.println("\t____________________________________________________________________________________________________ ");

	//Ciclo que imprime el nombre de los paises ingresados
	for(int i = 0; i<4; i++){//abre for i

	System.out.printf("\n\t| %-12s | ", pais[i]);

		//Ciclo que imprime las temperaturas una por una cada mes que son 3
		for(int j = 0; j<3; j++){//abre for j
		
		System.out.printf("%-24s  | ", temperatura[i][j] + "°C");

			}//cierra for j

		System.out.println();

		System.out.println("\t____________________________________________________________________________________________________ ");

		}//cierra for i

		System.out.println("\n\n\t--------------------- País y temperatura media ---------------------- \n");

		//Ciclo que imprime el nombre de los paises y su temperatura media
		for(int i = 0; i<4; i++){

		System.out.printf("\n\t País: %s \n\n\t Temperatura media: %.2f°C \n" , pais[i] , promedio[i] );
	
		}


		System.out.println("\n\n\t--------------------- Pais(es) con la temperatura media trimestral más alta ----------------------");

		//Ciclo para recorrer, buscar e imprimir uno o mas paises con la temperatura media alta si son mas paises es porque la temp es igual y es la mas alta 
		for(int i = 0; i<4; i++){

		if(promedio[i] == promediomayor ){

		System.out.printf("\n\n\t---> %s con %,.2f°C \n", pais[i], promedio[i]);

			}
		}

		System.out.println();

	}
}


