
//Desarrolla un programa que muestre los nombres de 10 personas usando un ciclo while. 

public class Ej1 {

	public static void main(String[] args){


	//Se inicia con un arreglo con los 10 nombres
	String nom[] = {"Luis","Carla","Angel","Juan","Sebastian","Danna","Clara","Diego","Edgar","Eva",};
	int a = 0;

	System.out.println("\n\t\t Lista de nombres: ");

	//mientras a sea menor a 10 se cumple la condición
	while( a < 10 ){

	//Imprime la lista de nombres "a" toma el valor de 0 pero se sumo 1 para que la lista se vea del 1 al 10
	System.out.println("\n\t\t " + (a + 1)  + " "+ nom[a]);
	a++;
		}
	}
}