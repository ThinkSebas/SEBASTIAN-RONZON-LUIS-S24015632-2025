//Crear un programa que simule un cajero automático, para realizar retiros de dinero. El programa deberá: 
//• Iniciar con un saldo disponible de $5000.00. 
//• Solicitar al usuario el monto a retirar. 
//• Validar que el retiro no sea mayor al saldo disponible. 
//• Si el monto es válido, realizar la operación y mostrar el saldo actualizado. 
//• Si el monto es mayor que el saldo, mostrar el mensaje: “Saldo insuficiente.” 
//• El programa debe repetir el proceso de retiro mientras el usuario desee continuar. 
//• Finalizar cuando el usuario indique que ya no desea realizar más operaciones.

import java.util.Scanner;

class Ej4{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	//saldo inicial de 5000
	double saldo = 5000;
	char cont = 'S';

	System.out.print("\n\t --- Cajero automático --- ");
	System.out.printf("\n\n\t Saldo disponible  $ %.2f mx \n", saldo);

		do {

			System.out.println("\n\t ------------------------- ");
			System.out.print("\n\t Ingrese el monto a retirar: ");
			double monto = sc.nextDouble();

			if(monto <= saldo && saldo > 0){
			
			saldo = saldo - monto;

			System.out.println("\n\t El retiro se realizo con éxito ");

			System.out.printf("\n\t Usted retiro: $ %.2f mx \n", monto);
			System.out.printf("\n\t Saldo actual: $ %.2f mx \n", saldo);
			
			}else{
				
			System.out.println("\n\t Saldo insuficiente ");
	
			}

			 

		System.out.printf("\n\t ¿Desea continuar con el retiro?(S/N) ");
		cont = Character.toUpperCase(sc.next().charAt(0));
		}while(cont == 'S');
		
		System.out.println("\n\t ------------------------- ");
		System.out.println("\n\t Gracias por usar el cajero. ");

	}
}







