import java.util.Scanner;
	
// Dado un valor T que corresponde a una temperatura en grados centígrados, 
//calcule y despliegue su equivalente en grados Fahrenheit y también en 
//Temperatura Absoluta. 

public class Ej5{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	double T, fah, K;
	T = 0;
	fah = 0;
	K = 0;
	
	System.out.print("\n Introduzca los grados centigrados o celsius: ");
	T = sc.nextDouble();

	fah = (T * 9/5) + 32;
	K = T + 273.15;
	
	System.out.printf("\n Grados centigrados:  %.2f °C\n", T);
                System.out.printf("\n Grados Fahrenheit:  %.2f °F\n", fah);
	System.out.printf("\n Temperatura absoluta (Kelvin):  %.2f K\n", K);


	}
}