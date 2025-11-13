import java.util.Scanner;


public class Array{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	String mes[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	int dias[]= new int[12];

	for(int i = 0; i<12; i++){
	
	System.out.print("\n\t El mes "+ mes[i] + " tiene: " );
	dias[i] = sc.nextInt();
	
	}

	System.out.print("\n\t ---------------------------------------------" );

	for(int j = 0; j<12; j++){

	System.out.println("\n\t El mes de " + mes[j] + " Tiene " + dias[j] + " dias");

		}
	}
}