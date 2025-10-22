import java.util.Scanner;

//Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres 
//hay en un grupo de estudiantes. 

public class Ej6{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("\n\t\t ========== Porcentaje de hombre y mujeres en un grupo ==========");

	System.out.print("\n\t\t Ingrese el numero de alumnos hombres que hay en el salón: ");
	int h = sc.nextInt();
	
	System.out.print("\n\t\t Ingrese el numero de alumnas mujeres que hay en el salón: ");
	int m = sc.nextInt();
	
	int t = h + m;
	
	System.out.println("\n\t\t El total de alumnos que hay en el salón es: " + t);
	
	double porcentajeh = (h * 100.0) / t;
	System.out.printf("\n\t\t El procentaje de hombres que hay en el grupo es: %.2f %% \n " , porcentajeh);

	double porcentajem = (m * 100.0) / t;
	System.out.printf("\n\t\t El procentaje de mujeres que hay en el grupo es: %.2f %% \n" , porcentajem);

	}
}