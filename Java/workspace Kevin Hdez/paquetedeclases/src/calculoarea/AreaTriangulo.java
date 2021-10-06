package calculoarea;
import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.print("Digite Base: ");
		double valor1 = dato.nextInt();
		System.out.print("Digite Altura: ");
		double valor2 = dato.nextInt();
		double total = (valor1 * valor2)/2;
		System.out.println("Su Area es: "+total);
	}
}
