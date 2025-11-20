//Una persona ahorra $500 cada mes. Crea un programa que calcule el ahorro 
//acumulado al final de cada mes durante un año, donde cada mes ofrece el 
//9% de interés. Posterior a ello mostrar el total ahorrado al final. Lo anterior 
//es importante desarrollarlo a partir de un ciclo for. 

class Ej8{

	public static void main(String[] args){

	double ahorro = 500.00;
	double mes = 0;

	//Ciclo para hacer el conteo de los meses
	for(int i = 0; i<12; i++){
	
	//Operación para sumar el ahorro de cada mes donde el mes empieza con 0 y se le suma 500 de ahorro
	mes = mes + ahorro;

	//Operación para sumar el 9% de interes al ahorro por mes
	mes = mes + (mes * 0.09);

		}
	
	//Muestra en pantalla el ahorro total %,.2f es para mostrar en el total solo 2 decimales
	//La " , " sirve para separa un numero grande en miles ej: 5,000.00
	System.out.printf("\n\t El total ahorrado en un año es de: $ %,.2f mx \n" , mes);

	}
}