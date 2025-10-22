import java.util.Scanner;

//En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología.  El 
//presupuesto anual del hospital se reparte conforme a la sig. tabla: 
//Área			Porcentaje del presupuesto 
//Ginecología       			40% 
//Traumatología   			30% 
//Pediatría    			30% 
//Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestal. 


public class Ej19{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Hospital ==========");

	System.out.print("\n\t\t Introduzca el presupuesto anual del hospital: ");
	double presupuesto = sc.nextDouble();

	double ginecologia = presupuesto * 0.4;
	double traumatologia = presupuesto * 0.3;
	double pediatria = presupuesto * 0.3;

	System.out.printf("\n\t\t El presupuesto es de: %,.2f \n", presupuesto);

	System.out.printf("\n\t\t El área de Ginecología recibe: %,.2f  \n", ginecologia);
	System.out.printf("\n\t\t El área de Traumatología recibe: %,.2f  \n", traumatologia);
	System.out.printf("\n\t\t El área de Pediatría recibe: %,.2f  \n", pediatria);

	
	}
}