import java.util.Scanner;

public class ArreglosForTeclado{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int arre[]=new int[5];
	
	for(int i = 0; i < 5; i++){

	System.out.println("Introduzca un numero");
	arre[i] = sc.nextInt();
	}

	for(int j = 0; j<5; j++){

	System.out.println(arre[j]);

		}
	}
}