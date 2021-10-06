package arreglos;
import java.text.DecimalFormat;
import java.util.Scanner;
public class PracticaExamen {
	public static void main(String[] args) {
		double array[]=new double[5],array2[]=new double[5];
		double euro=0,metro=0;
		DecimalFormat df = new DecimalFormat("0");
		DecimalFormat df2 = new DecimalFormat("0.00");
		Scanner s = new Scanner(System.in);
		System.out.println("Digite 5 cantidades...");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite la cantidad #"+(i+1)+"(euros y colones):");
			array[i]=s.nextDouble();
			array2[i]=(array[i]*1.31)*513;
			array[i]=(array[i]*100);
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Colones de la "+(i+1)+" cantidad es: \t"+df2.format(array2[i]));
			
			System.out.println("Centimetros de la "+(i+1)+" cantidad es: \t"+df.format(array[i])+"\n");
		}
		
	}
}
