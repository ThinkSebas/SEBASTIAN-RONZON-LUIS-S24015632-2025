//Se tiene la siguiente información: 
//1. Nombres de 4 empleados. 
//2. Ingresos en concepto de sueldo, cobrado por cada empleado, en los 
//últimos 3 meses. 
//Confeccionar el programa para:
//a) Realizar la carga de la información mencionada.  
//b) Generar un vector que contenga el ingreso acumulado en sueldos en 
//los últimos 3 meses para cada empleado. 
//c) Mostrar por pantalla el total pagado en sueldos a todos los empleados 
//en los últimos 3 meses  
//d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado. 

import java.util.Scanner;

class E14{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	//Arreglo para guardar el nombre de los empleados que son 4
	String empleados[] = new String[4];
	
	//Matriz para guardar el sueldo de 4 empleados por 3 meses
	double sueldo[][] = new double[4][3];

	//Vector para guardar la suma del sueldo de 3 meses de cada empleado
	double acumulado[] = new double[4];

	//Variable para guardar el ingreso mayor del empleado 
	double ingresomayor = acumulado[0];

	//variable para guardar el numero del vector con el nombre del mayor acumulado
	int nombre = 0;
	
	//Variable para guardar el total acumulado de los empleados
	double total = 0;

	//Ciclo para ingresar el nombre de los empleados (4 nombres)
	for(int i=0; i<4; i++){//inicia for i

	System.out.println("\n\t-----------------------------------------------");
	System.out.printf("\n\tIngrese el nombre del empleado número %d: ", (i+1));
	empleados[i] = sc.nextLine();

	System.out.println();
	
	//Ciclo que guarda uno por uno el sueldo de cada mes
	for(int j=0; j<3; j++){ //inicia for j

	System.out.printf("\n\tIngrese el sueldo del empleado en el mes %d: ", (j+1));
	sueldo[i][j] = sc.nextDouble();

			}//termina for j
	
	//Limpia el buffer para evitar que salte el ingreso del siguiente nombre
	sc.nextLine();


		}//termina for i

	//Ciclo para hacer un recorrimiento por cada empleado
	for(int i=0; i<4; i++){//inicia for i

	//Variable para sumar los sueldos del empleado que tenga el valor de i = 0 asi sucesivamente hasta llegar a 3
	double suma = 0;
		
		//Ciclo para sumar el sueldo de los 3 meses de cada empleado
		for(int j=0; j<3; j++){

		//Variable que guarda el sueldo, lo actualiza y lo suma con el anterior
		suma = suma + sueldo[i][j];	
	
			}
		
		//Se guarda la suma en el vector empezando del 0 al 4
		acumulado[i] = suma;

		//Suma el acumulado de todos los empleados 
		total= total + suma;

	//Condición que compara si el empleado tiene un ingreso mayor
	if(acumulado[i] > ingresomayor){
	
		//Se va actualizando el ingreso mayor
		ingresomayor = acumulado[i];

		//Guarda la posicion del vector con mas ingreso y sirve para mostrar el nombre del empleado
		nombre = i;

			}

		}

	System.out.println("\n\t----------------------------------------------- \n");

	//Se le empieza a dar forma a la matriz para hacerla tabla
	System.out.println("\t Empleado            Mes1         Mes2             Mes3             Total");
	
	//Ciclo que imprime los datos de cada empleado empezando por nombre,sueldo de cada de mes, del mes 1 al 3
	for(int i=0; i<4; i++){

	//Se le da forma a la tabla donde %-12s significa que se haran 12 espacios a la izquierda y escribira el nombre del empleado 1, depues su sueldo y la suma de los meses 
	System.out.printf("\n\t| %-12s | $ %,-12.2f | $ %,-12.2f | $ %,-12.2f | $ %,-12.2f \n", empleados[i], sueldo[i][0], sueldo[i][1], sueldo[i][2], acumulado[i]);
                
	}

	System.out.println("\t____________________________________________________________________________________ ");
	
	//Linea que imprime en la parte de abajo de la matrizla suma total del sueldo de todos los empleados 
	System.out.printf("\n\t| %-63s | $ %,-12.2f |\n", "Total:", total);

	System.out.print("\t____________________________________________________________________________________ \n");

	//linea que solo imprime texto
	System.out.println("\n\t Empleado(s) con mayor ingreso acumulado");

	//Ciclo para hacer un recorrimiento y encontrar si hay mas empleados que tienen el mismo ingreso y es el mayor
	for(int i=0; i<4; i++){
		if(acumulado[i] == ingresomayor){

			System.out.printf("\n\t---> %s con $%,.2f\n", empleados[i], acumulado[i]);

			}
		}
	}
}




















