import java.util.Scanner;

//Dado el valor de un número que corresponde al radio de una circunferencia 
//calcule y despliegue la longitud de la misma y el área del circulo correspondiente	

class Ej2{
	
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double pi = 3.1416;	
	
	System.out.println("\n\t\t ========== Área y longitud de un círculo ==========");	

	System.out.print("\n\t\t Introduzca el valor del radio del circulo: ");
	double r = sc.nextDouble();
	
	//longitud
	double longitud = (2 * pi) * r;
	//Area
	double area = pi * (r * r);

	System.out.println("\n\t\t Radio = " + r);
	System.out.printf("\n\t\t Longitud = %f m \n" , longitud);
	System.out.printf("\n\t\t Área = %f m^2 \n" , area);
	
	}
}