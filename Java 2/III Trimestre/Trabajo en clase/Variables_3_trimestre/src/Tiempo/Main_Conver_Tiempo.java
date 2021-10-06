package Tiempo;

import javax.swing.JOptionPane;

public class Main_Conver_Tiempo {

	
	public static void main(String[] args) {
	double horas=0;
	double minutos=0;
	double segundos=0;
	int opcion;
	Conversiones convertir;
	
	
	do{
		opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Horas"+"\n2. Minutos"+"\n3. Segundos"+"\n0. Salir"));
		
		switch (opcion) {
		case 1:
			horas=Double.valueOf(JOptionPane.showInputDialog("Digite cantidad de horas: ")).doubleValue();
			convertir = new Conversiones();
			convertir.asig_horas(horas);
			JOptionPane.showMessageDialog(null, "Horas: "+convertir.obt_horas()+"  Minutos: "+convertir.obt_minutos()+"  Segundos: "+convertir.obt_segundos());
			break;
			
		case 2:
			minutos=Double.valueOf(JOptionPane.showInputDialog("Digite cantidad de Minutos: ")).doubleValue();
			convertir = new Conversiones();
			convertir.asig_minutos(minutos);
			JOptionPane.showMessageDialog(null, "Horas: "+convertir.obt_horas()+"  Minutos: "+convertir.obt_minutos()+"  Segundos: "+convertir.obt_segundos());
			break;
		case 3:
			segundos=Double.valueOf(JOptionPane.showInputDialog("Digite cantidad de Segundos: ")).doubleValue();
			convertir = new Conversiones();
			convertir.asig_segundos(segundos);
			JOptionPane.showMessageDialog(null, "Horas: "+convertir.obt_horas()+"  Minutos: "+convertir.obt_minutos()+"  Segundos: "+convertir.obt_segundos());
			break;

		default:
			break;
		}
		
	}while(opcion!=0);

	}

}
