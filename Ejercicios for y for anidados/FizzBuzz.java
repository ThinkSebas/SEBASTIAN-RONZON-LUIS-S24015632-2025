class FizzBuzz {
public static void main(String args[]) {

	//conteo del 1 al 100
	for(int n=1; n<=100; n++)
	//primero va esta condicion y despues las individuales
	//Escribe FizzBuzz si el numero es multiplo de 3 y 5
	if(n % 3 == 0 && n % 5 == 0){
	
	System.out.println("\n\t FizzBuzz");

	}else{
	//Escribe Fizz si el numero es multiplo de 3
	if(n % 3 == 0){

	System.out.println("\n\t Fizz" );

	}else{
	Escribe Buzz si el numero es multiplo de 5
	if(n % 5 == 0){

	System.out.println("\n\t Buzz" );

	}else{
	//muestra los demas numeros que no cumplen las condiciones
	System.out.println("\n\t " + n );
				
				}
			}
		}
	}
}