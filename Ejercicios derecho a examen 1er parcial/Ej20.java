import java.util.Scanner;

//En un supermercado se hace una promoción, mediante la cual el cliente obtiene 
//un descuento dependiendo de un número que se escoge al azar. Si el numero 
//escogido es menor que 74 el descuento es del 15% sobre el total de la compra, si 
//es mayor o igual a 74 el descuento es del 20%. Obtener cuánto dinero se le descuenta.

public class Ej20{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double descuento = 0;
	
	System.out.println("\n\t\t ========== Descuento Supermercado ==========");

	System.out.print("\n\t\t Ingrese el toal de la compra: ");
	double total = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el número entero escogido al azar: ");
	int numero = sc.nextInt();

	if(numero < 74){

	descuento = total - (total * 0.15); 

	}else{
	
	descuento = total - (total * 0.20);

		}
	System.out.println("\n\t\t =============================================");

	System.out.printf("\n\t\t Monto de compra: %,.2f  \n" , total);
	System.out.printf("\n\t\t Numero elegido: %d \n", numero);

	System.out.printf("\n\t\t Total de compra con descuento aplicado: %,.2f  \n" , descuento);
		
	}
}