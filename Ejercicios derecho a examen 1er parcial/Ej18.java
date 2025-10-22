import java.util.Scanner;

//Dado cierto tiempo de una llamada telefónica, determinar la cantidad total a 
//pagar teniendo en cuenta lo siguiente. 
//A)  Toda llamada hasta de tres minutos cuesta N$10.00 
//B) El minuto adicional cuesta N$1.00


public class Ej18{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double total = 10.00;

	System.out.println("\n\t\t ========== Llamada telefónica ==========");

	System.out.print("\n\t\t Introduzca el tiempo que duro la llamada en minutos: ");
	int llamada = sc.nextInt();
	
	if(llamada <= 3){

		System.out.printf("\n\t\t La llamada fue de: %d minutos \n", llamada);
		System.out.printf("\n\t\t El costo es de: $ %.2f \n" , total);
	}else{
		
		double adicional = total + (llamada - 3) * 1;
		System.out.printf("\n\t\t La llamada fue de: %d minutos \n", llamada);
		System.out.printf("\n\t\t El costo es de: $ %.2f \n" , adicional);

		}	
	}
}