package numeromayor;
import java.util.Scanner;
public class Numeros {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Digite tres numeros: ");
		int entrada1 = dato.nextInt();
		int entrada2 = dato.nextInt();
		int entrada3 = dato.nextInt();
		if ((entrada1 > entrada2)&&(entrada1 > entrada3)) System.out.println(entrada1);
		else if (entrada2>entrada3) System.out.println(entrada2);
		else if (entrada3>entrada1)System.out.println(entrada3);
			
	}

}
