package examen;

import javax.swing.JOptionPane;

public class calculo {
	
	public void primero(int valor1,int valor2){
		int []arreglo=new int[16];
		for (int i = valor1; i <= valor2; i++) {
			arreglo[i]=4*i;
		}
		for (int i = valor1; i <= valor2; i++) {
			JOptionPane.showMessageDialog(null, "4*"+i+"= "+arreglo[i]);
		}
	}
}
