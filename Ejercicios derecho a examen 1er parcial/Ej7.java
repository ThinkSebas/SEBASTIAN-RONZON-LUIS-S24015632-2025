import java.util.Scanner;

//Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente 
//desea saber cuánto deberá pagar finalmente por su compra.

public class Ej7{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Descuento de tienda ==========");
	
	System.out.print("\n\t\t Ingrese el monto de venta: ");
	double monto = sc.nextDouble();

	double descuento = monto - (monto * 0.15);

	System.out.printf("\n\t\t Monto:  $ %.2f \n", monto);
	
	System.out.println("\n\t\t Descuento: 15 % ");
	
	System.out.printf("\n\t\t Total a pagar:  $ %.2f \n", descuento);
	}
}