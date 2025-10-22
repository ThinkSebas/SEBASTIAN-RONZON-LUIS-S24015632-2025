import java.util.Scanner;

//En una organización se tiene a los empleados agrupados por categoría, los de 
//categoría 1 ganan $20.000, los de categoría 2, $15.000, los de categoría 3, 
//$10.000 y los de categoría 4, $7.500. Se quiere un programa que permita 
//determinar cuánto debe pagarse a un empleado si se conoce el número de horas 
//que trabajó durante el mes y la categoría a la que pertenece. Se sabe que a todos 
//se les descuenta un 7.2% por concepto de salud, y si el salario total devengado 
//(mensual) es menos de 1´000.000, se le da un subsidio del 15% sobre su salario 
//mensual (sin descuentos).


public class Ej12{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Salario por categoría ==========");
	
	double salarioxh = 0;
		
	System.out.print("\n\t\t Introduzca la categoria del trabajador (1-4): ");
	int cat = sc.nextInt();

	System.out.print("\n\t\t Introduzca el numero de horas trabajadas en el mes: ");
	double h = sc.nextDouble();

	switch(cat){
	
	case 1: 
		salarioxh = 20000;
		break;
	case 2: 
		salarioxh = 15000;
		break;
	case 3: 
		salarioxh = 10000;
		break;
	case 4: 
		salarioxh = 7500;
		break;
	default:
		System.out.println("\n\t\t Opción invalida");
		}

	double salariom = salarioxh * h;

	double salud = salariom * 0.072;

	double subsidio = 0;

	if(salariom < 1000000){
	
	subsidio = salariom * 0.15;
	
	}

	double salariot = salariom - salud + subsidio;
	
	System.out.printf("\n\t\t ==================================================== \n");	

	//Si se pone una , despues del % ejemplo: %,.2f se separan los numeros por miles ejemplo 1,500	
	System.out.printf("\n\t\t Salario Mensual: $ %,.2f \n", salariom);
	System.out.printf("\n\t\t Descuento del 7.2%% por concepto de salud: $ %,.2f \n", salud);
	System.out.printf("\n\t\t Subsidio sumado: $ %,.2f \n", subsidio);
	System.out.printf("\n\t\t Salario a pagar: $ %,.2f \n", salariot);
	
	sc.close();
	
	}
}