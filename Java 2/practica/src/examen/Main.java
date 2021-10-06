package examen;

import javax.swing.JOptionPane;

public class Main {


	public static void main(String[] args) {
		int valor1 = 0,valor2 = 0;
		int []arreglo=new int[16];
		calculo cal = new calculo();
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Valor1: "));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Valor2: "));
		if ((valor1<=15) && (valor2<=15)){
			if(valor2>valor1){
				cal.primero(valor1, valor2);
			}else if(valor2<valor1){
				cal.primero(valor2, valor1);
			}
		
		}else JOptionPane.showMessageDialog(null, "Valor mayor a 15");
	}

}
