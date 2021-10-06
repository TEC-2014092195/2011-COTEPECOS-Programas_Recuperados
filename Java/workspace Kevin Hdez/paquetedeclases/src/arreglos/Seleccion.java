 package arreglos;
 /**
  * Elaborado por Kevin Hernández Rostrán
  * Sección 11-4
  * 10 de mayo 2012
  */
import java.util.Scanner;
public class Seleccion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcion,salir,tabla,total=0;
		double total2 = 0.0;
		int[] arreglo = new int[10];
		do{
			System.out.println("* Digite 1 para averiguar el area de un triangulo                    *");
			System.out.println("* Digite 2 para obtener el mayor,menor y suma total del arreglo      *");
			System.out.println("* Digite 3 para mostrar la tabla de multiplicar que desee            *");
			System.out.println("**********************************************************************");
			System.out.println("Digite la opcion: ");
			opcion=s.nextInt();
			switch (opcion) {
			case 1:
				
				System.out.print("Digite Base: ");
				double valor1 = s.nextInt();
				System.out.print("Digite Altura: ");
				double valor2 = s.nextInt();
				total2 = (valor1 * valor2)/2;
				System.out.println("Su Area es: "+total2);
				System.out.println("Digite 0 para salir");
				salir=s.nextInt();
				break;
			case 2:
				int mayor=0,menor=0;
				int[] arreglo2 = new int[10]; 
				System.out.println("Digite diez valores ");
				for (int i = 0; i < 10; i++) {
					System.out.println("Digite el valor numero ["+(i+1)+"]: ");
					arreglo[i]=s.nextInt();
					total+=arreglo[i];
					arreglo2[i]=arreglo[i]+2;
					if(i==0){
						menor=arreglo[0];
						mayor=arreglo[0];}
					if(menor>arreglo[i])
						menor=arreglo[i];
					if(mayor<arreglo[i])
						mayor=arreglo[i];
					if(mayor<0 && arreglo[i]>mayor)
						mayor=arreglo[i];
				}
				for (int i = 0; i < 10; i++) {
					System.out.println("Arreglo ["+i+"] = "+arreglo[i]+"    \t\tAumento= "+arreglo2[i]);}
				System.out.println("El numero menor es: "+menor+"\t El mayor es: "+mayor+"\t Total= "+total);

				System.out.println("Digite 0 para salir");
				salir=s.nextInt();
				break;
				
			case 3:
				System.out.println("Digite la tabla que desea: ");
				tabla=s.nextInt();
				
				int[] array = new int [26];
				for (int i = 1; i <= 25; i++) {
					array[i]=tabla*i;
					System.out.println(tabla+" * "+(i)+" = "+array[i]);
				}
				System.out.println("Digite 0 para salir");
				salir=s.nextInt();
				break;
				
			
			default:
				System.out.println("Digite 0 para salir");
				salir=s.nextInt();
				break;
			}
		}while(salir!=0);
		
	}
}
