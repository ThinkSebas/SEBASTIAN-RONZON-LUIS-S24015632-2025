//Desarrolla un programa en Java que registre la información de los atletas 
//que participan en las pruebas de control para la preselección nacional de atletismo. El programa deberá: 
//• Usar un arreglo bidimensional de tipo String o double para almacenar los datos de varios atletas. 
//• Registrar en cada fila la información de un atleta con los siguientes 
//datos: Nombre, Apellido, Especialidad (100 m, 200 m, 400 m, etc.), Tiempo registrado (segundos),  
//• Calcular e identificar qué atleta logró el mejor tiempo (el menor valor). 
//• Mostrar una tabla con toda la información capturada y resaltar el mejor tiempo obtenido.


import java.util.Scanner;

class Ej17{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	//Pide al usuario ingresar cuantos atletas va a registrar
	System.out.print("\n\t Ingrese el número de atletas que quiere registrar: ");

	//Condición que valida si el usuario escribio un numero entero
	while(!sc.hasNextInt()){

	System.out.print("\n\t Dato incorrecto. Ingrese un número entero: ");
	
	//Limpia lo que se escribio y es incorrecto
	sc.next();

		}

	//Variable que lee el numero de atletas que el usuario registrara
	int n = sc.nextInt();

	//Condición que valida que el número de atletas sea de minimo 2
	if(n <= 1){

	//Pide que se ingrese el dato correcto
	System.out.print("\n\t Dato incorrecto. Ingrese un número mayor o igual a 2: ");
	n= sc.nextInt();

		}

	//Limpia el buffer, elimina el salto de linea del nextInt();
	sc.nextLine();

	//Se crea y se inicializa la matriz con n filas que es el valor que es el numero de atletas a ingresar y 4 columnas que sera donde se registraran los datos
	String atleta[][] = new String [n][4];

	//Se crea un arreglo que describe el dato que se ingresara en cada columna son 4
	String datos[] = {"Nombre", "Apellido", "Especialidad (100 m, 200 m, 400 m, etc.)", "Tiempo registrado (segundos)"};
	
	//Ciclo que recorre cada atleta o cada fila de la matriz
	for(int i = 0; i<n; i++){

	System.out.printf("\n\n\t =========================== Registro del atleta %d =========================== \n", (i+1));

	//Ciclo que recorre las columnas y pide los datos del atleta
	for(int j = 0; j<4; j++){

	//Pide que ingrese el dato y "datos[j]" es el dato que se va a ingresar donde j = 0 entonces va al vector datos[0] que es = nombre asi secuencialmente
	System.out.print("\n\t Ingrese el " + datos[j] + " del Atleta: ");
	
	//Guarda el dato ingresado en la matriz donde en la parte de atleta[0][0] 
	//que es donde se inicializa i y j, en esa parte se ingresa el nombre despues atleta[0][1] se ingresa el apellido, etc...
	atleta[i][j] = sc.nextLine();
	
			}
		}

	//Se inicializa el mejor tiempo con el valor double mas grande posible 
	//Asi es seguro que cualquier tiempo ingresado sera menor
	double mejortiempo = Double.MAX_VALUE;
	
	//Guarda el indice del atleta con mejor tiempo y (el -1 es porque no hay ninguno con mejor tiempo todavia) 
	int mejor = -1;

	//Ciclo que recorre a todos los atletas ingresados  para buscar al de mejor tiempo
	for(int i = 0; i < n; i++){
		
	//Convierte a double el numero del tiempo registrado ya que esta en string porque asi se guardo en la matriz de atleta[][]
	double tiempo = Double.parseDouble(atleta[i][3]);

	//Inicia la condición si encuentra un tiempo menor al actual que es el maximo ya que se inicializa con Double.MAX_VALUE;
	if(tiempo < mejortiempo){
	
	//Variable que actualiza el mejor tiempo cada vez que encuantra uno mejor
	mejortiempo = tiempo;
	
	//Se guarda el indice del atleta con mejor tiempo
	mejor = i;
	
			}
		}

	System.out.println();

	System.out.print("\t =========================================================================================== ");

	System.out.printf("\n\t || %-20s || %-20s || %-15s || %-18s || \n", "Nombre", "Apellido", "Especialidad", "Tiempo (segundos)");

	System.out.print("\t =========================================================================================== ");                

	//Ciclo que recorre a todos los atletas pero ahora imprime los datos que se ingresaron
	for(int i = 0; i<n; i++){

	//Convierte el tiempo a numero double para que pueda ser comparado
	double tiempo = Double.parseDouble(atleta[i][3]);

	//Linea que crea una variable llamada nota
	//Depues se hace un if pero con menos lineas donde si el tiempo es igual a mejortiempo
	//Si es verdadero = ? la nota sera "<-- MEJOR TIEMPO" si es falso= : la nota sera ""
	String nota = (tiempo == mejortiempo) ? "<-- MEJOR TIEMPO" : "";

	//En esta parte se imprimen todos los datos de los atletas registrados y se mostrara la nota si es el de mejor tiempo
	System.out.printf("\n\t || %-20s || %-20s || %-15s || %-18s || %-10s \n", atleta[i][0],  atleta[i][1], atleta[i][2],  atleta[i][3], nota);

	System.out.print("\t =========================================================================================== ");

		}

	System.out.println("\n");

	}
}
















