import java.util.Scanner;

//Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su 
//salario anterior. 

public class Ej9{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Incremento de salario ==========");

	System.out.print("\n\t\t Ingrese el salario del obrero: ");
	double salario = sc.nextDouble();

	double incremento = salario * 0.25;
	double totalsal = incremento + salario;

	System.out.printf("\n\t\t Salario antes del incremento: $ %.2f \n", salario);
	System.out.printf("\n\t\t Salario con el incremento del 25%%: $ %.2f \n", totalsal);	
	}
}