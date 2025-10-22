import java.util.Scanner;

//Suponer que un individuo desea invertir su capital en un banco y desea saber, 
//¿Cuánto dinero ganará después de un mes si el banco?, si el pago es en razón de 
//2% mensual. 

public class Ej8{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Inversión capital por un mes ==========");
	
	System.out.print("\n\t\t Ingrese el monto a invertir: ");
	double inv = sc.nextDouble();

	double ganancia = inv * 0.02;
	double tinv= ganancia + inv;
	
	System.out.printf("\n\n\t\t Monto a invertir: $ %.2f \n", inv);

	System.out.println("\n\t\t Ganancia mensual del: 2% ");

	System.out.printf("\n\t\t Ganancia por un mes: $ %.2f \n", ganancia );

	System.out.printf("\n\t\t Total: $ %.2f \n", tinv);
	}
}