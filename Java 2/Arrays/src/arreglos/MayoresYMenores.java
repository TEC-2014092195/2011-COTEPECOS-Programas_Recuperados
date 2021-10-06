package arreglos;
import java.util.Scanner;
public class MayoresYMenores {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mayor=0,total=0,menor=0,acu=0;
		int[] arreglo = new int[5];
		for (int i = 0; i < 5; i++) {
			arreglo[i]=s.nextInt();
			if(i==1)
				menor=arreglo[0];
				mayor=arreglo[0];
			if(menor>arreglo[i])
				menor=arreglo[i];
			if(mayor<arreglo[i])
				mayor=arreglo[i];
			else if(mayor<0)
				mayor=arreglo[i];
			
			
		}
		System.out.println("Menor: "+menor+"\nMayor: "+mayor);
	}
}