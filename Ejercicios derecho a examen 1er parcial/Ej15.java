import java.util.Scanner;

//En una universidad se ha variado el sistema de calificaciones, por tanto se 
//requiere un programa que indique la valoración en letras cuando se tiene la 
//nota en números, siguiendo la tabla mostrada a continuación: 
//Nota Numérica Valoración en letras  
//0.0 – 1.0 P (Pésimo)  
//1.1 – 2.0 M (Mal)  
//2.1 – 2.9 R (Regular)  
//3.0 – 4.0 B (Bien)  
//4.1 – 5.0 E (Excelente)


public class Ej15{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Valoracion de calificación en letras ==========");

	System.out.print("\n\t\t ingrese la calificacion en numero solo valores de 0.0 a 5.0: ");
	double cal = sc.nextDouble();

	if(cal >= 0.0 && cal <= 1.0 ){
	
	System.out.println("\n\t\t Tiene una valoración de: P (pésimo) ");

	}else{
	
	if(cal >= 1.1 && cal <= 2.0){

	System.out.println("\n\t\t Tiene una valoración de: M (Mal) ");

	}else{
	
	if(cal >= 2.1 && cal <= 2.9){

	System.out.println("\n\t\t Tiene una valoración de: R (Regular) ");

	}else{

	if(cal >= 3.0 && cal <= 4.0){
	
	System.out.println("\n\t\t Tiene una valoración de: B (Bien) ");

	}else{

	if(cal >= 4.1 && cal <= 5.0){

	System.out.println("\n\t\t Tiene una valoración de: E (Excelente) ");

	}else{
	
	System.out.println("\n\t\t ***Error***. La calificacion debe estar entre 0.0 y 5.0");
					
						}
					}
				}
			}
		}

	sc.close();

	}
}