//Desarrolla un programa que muestre el siguiente patrón usando un ciclo for: 
//* 
//** 
//*** 
//**** 
//***** 
//******

class Ej5{

	public static void main(String[] args){

	System.out.println();
	
	//Altura del triangulo 
	for(int i = 1; i <= 6; i++){
		
		//Ciclo para imprimir * donde empieza con un * y termina con 6 "*"
		for (int j = 1; j <= i ; j++) {
		
			System.out.print("*");
		
			}

	//Salto de linea despues de im	primir el  *	
	System.out.println(" ");

		}
	}
}