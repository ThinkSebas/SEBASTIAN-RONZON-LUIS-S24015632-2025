
//Desarrolla un programa que imprima todos los números pares entre 1 y 20, utilizando un ciclo while.

public class Ej2 {

	public static void main(String[] args){



	int n = 1;
	System.out.println("\n\t Números pares entre 1 y 20: ");

	//mientras el numero sea menor o igual a 20 se cumple la condición
	while( n <= 20 ){
		
		//condicion si el valor de "n" es par lo muestra en la lista
		if(n % 2 == 0){

		System.out.println("\n\t\t " + n);

			}

	//Se suma el valor de n + 1
	n++;
		}
	}
}