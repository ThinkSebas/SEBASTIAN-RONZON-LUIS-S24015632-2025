import java.util.Scanner;

//En un concesionario de vehículos, se pagan las comisiones a los vendedores 
//según el valor de la venta (ver tabla). Al final del mes se desea saber 
//¿Cuánto ganó un vendedor en total por todas las comisiones, si se sabe que hizo 4 ventas?  
//Valor de Venta                               Comisión para el Vendedor  
//• Hasta 10.000.000                                           2%   
//• Más de 10 y Menos de 15 Millones               4%    
//• Más de 15 millones                                        10% 


public class Ej14{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	double c1, c2, c3, c4;
	
	System.out.println("\n\t\t ========== Comisiones a vendedores ==========");

	System.out.println("\n\t\t Si la venta es menor o igual a $10,000,000 la comisión es del 2% \n\n\t\t Si la venta es mayor a $10,000,000 y menor a $15,000,000  la comisión es del 4% \n\n\t\t Si la venta es mayor a $15,000,000  la comisión es del 10%");

	System.out.println("\n\t\t =============================================");

	System.out.print("\n\t\t Ingrese el valor de la venta 1: ");
	double v1 = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el valor de la venta 2: ");
	double v2 = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el valor de la venta 3: ");
	double v3 = sc.nextDouble();

	System.out.print("\n\t\t Ingrese el valor de la venta 4: ");
	double v4 = sc.nextDouble();
	
	//Venta 1
	if(v1 <= 10000000){
		
		c1 = v1 * 0.02;

	}else{
	
	if(v1 < 15000000){
				
		c1 = v1 * 0.04;

	}else{
		c1 = v1 * 0.10;
			}
		}

	//Venta 2
	if(v2 <= 10000000){
		
		c2 = v2 * 0.02;

	}else{
	
	if(v2 < 15000000){
				
		c2 = v2 * 0.04;

	}else{
		c2 = v2 * 0.10;
			}
		}

	//Venta 3
	if(v3 <= 10000000){
		
		c3 = v3 * 0.02;

	}else{
	
	if(v3 < 15000000){
				
		c3 = v3 * 0.04;

	}else{

		c3 = v3 * 0.10;
			}
		}
	
	//Venta 4
	if(v4 <= 10000000){
		
		c4 = v4 * 0.02;

	}else{
	
	if(v4 < 15000000){
				
		c4 = v4 * 0.04;

	}else{
		c4 = v4 * 0.10;
			}
		}

	double t = c1 + c2 + c3 + c4;

	System.out.printf("\n\t\t Comisión de venta 1: $ %,.2f \n", c1);
	System.out.printf("\n\t\t Comisión de venta 2: $ %,.2f \n", c2);
	System.out.printf("\n\t\t Comisión de venta 3: $ %,.2f \n", c3);
	System.out.printf("\n\t\t Comisión de venta 4: $ %,.2f \n", c4);
	System.out.printf("\n\t\t Ganancia total de comisiones: $ %,.2f \n", t);

	}
}