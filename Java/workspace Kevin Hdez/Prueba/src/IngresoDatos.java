import java.util.*;
public class IngresoDatos {
public static void main(String[] args){
	int t;
	Scanner s = new Scanner(System.in);
	System.out.print("Ingrese numero a: ");
	String input = s.nextLine();
	System.out.print("Ingrese numero b: ");
	int a = Integer.parseInt(input);
	input = s.nextLine();
	int b = Integer.parseInt(input);
	t = sumar(a,b);
	t = ++t;
	System.out.println("La suma da como resultado: "+t);
}
public static int sumar(int a, int b){
	return (a+b);
}
}
