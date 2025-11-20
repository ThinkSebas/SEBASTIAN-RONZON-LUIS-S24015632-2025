//Hacer un programa que lea calificaciones de 5 alumnos 
//en escala de 1 a 10 y que reporte el No. Total de aprobados, No. Total de reprobados y la 
//calificación promedio del grupo. El programa deberá desarrollarse a través de una estructura for. 

import java.util.Scanner;

class Ej6{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	int aprobados = 0;
	int reprobados = 0;
	double promedio = 0;

	//For para ingresar 5 calificaciones
	for(int i = 0; i < 5; i++){
	
	//La parte de i + 1 es para que la pantalla imprima alumno 1 en vez de 0
	System.out.print("\n\t Ingrese la calificacion de 1 a 10 del alumno " + (i+1) + ": ");
	int cal = sc.nextInt();
	
	//El while sirve por si el usuario escribe una calificación menor a 1 y mayor a 10
	//Imprime un mensaje para que se escriba una calificaion correcta
	while(cal < 1 || cal > 10){
		
	System.out.print("\n\t Calificación incorrecta. Ingrese la calificación de 1 a 10: ");
	cal = sc.nextInt();
	
		} //Fin while
	
		//If de condición para hacer conteo de aprobados y reprobados 
		if(cal >= 6){
		
			aprobados++;

		}else{

			reprobados++;

			} //termina if
		
		//Suma de las calificaciones para sacar promedio total
		//promedio tiene valor de 0 y se suma el valor de las calificaciones consecutivamente
		promedio = promedio + cal;

		} //termina for
	
	System.out.println("\n\t Total de apobados: " + aprobados);
	System.out.println("\n\t Total de repobados: " + reprobados);

	double total = promedio / 5;
	System.out.println("\n\t Calificación promedio del grupo: " + total);

	}
}


