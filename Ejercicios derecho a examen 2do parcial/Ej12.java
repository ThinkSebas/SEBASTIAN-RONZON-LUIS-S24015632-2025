//Una tienda registra las ventas diarias de la semana (7 días). 
//Crea un programa que permita ingresar los montos de cada día, los almacene en un arreglo y calcule: 
//• La venta total de la semana. 
//• El día con mayor venta. 

import java.util.Scanner;

class Ej12{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	//creación e inicialización del arreglo y las variables
	double dia[] = new double[7];
	double suma = 0;
	double ventamayor = 0;
	int diamayor = 0;

	System.out.println("\n\t\t ---- Venta diaria de la semana ----");

	//ciclo para ingresar el monto de las ventas de cada dia 
	for(int i = 0; i < 7; i++){

	System.out.print("\n\t Ingrese el monto del dia " + (i+1) + ": $ ");
	dia[i] = sc.nextDouble();

	//linea que suma el monto de las ventas de cada dia 
	suma = suma + dia[i];		
		
		//condición si el valor del dia es mayor a la variable ventamayor entra a la condición
		if(dia[i] > ventamayor){
	
		//el valor del monto cambia del actual al nuevo
		ventamayor = dia[i];
		//la variable guarda el dia que se tuvo un mayor monto
		diamayor = i + 1;

			}
		}

	
	//Se imprime la venta total y el dia y monto que se hizo una mayor ventra
	System.out.printf("\n\t La venta total de la semana es: $ %,.2f \n", suma);
	System.out.printf("\n\t El dia %d fue el de mayor venta con un monto de $ %,.2f \n", diamayor, ventamayor );
	
	}
}