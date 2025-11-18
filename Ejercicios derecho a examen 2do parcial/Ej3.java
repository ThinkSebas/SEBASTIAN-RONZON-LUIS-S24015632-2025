//Crea un programa en que simule un cajero automático para el pago del servicio de energía eléctrica. 
//• El programa deberá mostrar un menú que incluya: 1. Consulta, 2, Pago del mes 3. Pago de adeudo y 4. Salir.  
//• El programa debe mostrar el menú y el usuario hacer una de las 4 
//Permitir que el usuario elija una de las cuatro opciones y muestre el resultado correspondiente. 
//• Considerar que en las opciones 1, 2 y 3, el usuario tiene un adeudo de $1000.00 que debe mostrarse en pantalla. 
//• Después de realizar una operación, el programa debe preguntar si desea continuar con otro servicio. 
//• Si el usuario elige “no”, el programa debe finalizar mostrando un mensaje de despedida. 

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int op;
	char cont = 'S';
	do {
	
	System.out.println("\n\t --- Cajero Automático --- ");
	System.out.println("\n\t 1.- Consulta \n\n\t 2.- Pago del mes \n\n\t 3.- Pago de adeudo \n\n\t 4.- Salir");
	
	System.out.print("\n\t Elija una opción 1-4: ");
	op = sc.nextInt();
	
		switch(op){
		
		case 1:
				
			System.out.println("\n\t\t\t --- Consulta --- ");
			System.out.println("\n\t Usted tiene un adeudo de: $1000.00 mx ");
			System.out.println("\n");
			break;

		case 2:
				
			System.out.println("\n\t\t\t --- Pago del mes --- ");
			System.out.println("\n\t El pago del mes es de: $1000.00 mx ");
			System.out.println("\n");
			break;
			

		case 3:
				
			System.out.println("\n\t\t\t --- Pago de adeudo --- ");
			System.out.println("\n\t Su adeudo es de: $1000.00 mx ");
			System.out.println("\n");
			break;
			

		case 4:
			System.out.println("\n\t\t\t Gracias por usar el cajero ");	
			return;
			

		default:
			System.out.println("\n\t\t\t Opción invalida");	
			break;

			}

	System.out.print("\n\t ¿Desea continuar con otro servicio?(S/N) ");
	cont = Character.toUpperCase(sc.next().charAt(0));
	
		} while (cont == 'S');

	sc.close();
	}
}









