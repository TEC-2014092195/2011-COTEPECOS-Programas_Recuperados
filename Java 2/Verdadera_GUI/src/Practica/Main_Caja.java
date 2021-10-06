package Practica;
/**
 * Examen programacion 30 Agosto
 * Kevin Hernandez Rostran
 * 11-4
 */
import javax.swing.JOptionPane;

public class Main_Caja {

	
	public static void main(String[] args) {
		double sub_total,pago_cliente;
		Caja ventana;
		
		sub_total=Double.parseDouble(JOptionPane.showInputDialog("Subtotal:"));
		pago_cliente=Double.parseDouble(JOptionPane.showInputDialog("PAgo Cliente: "));
		
		ventana = new Caja();
		ventana.total(sub_total,pago_cliente);
		
		/*JOptionPane.showMessageDialog(null, "Billetes de 10000= "+bille_diez+"\nBilletes de 5000= "+bille_cinco+"\nBilletes de 2000= "+bille_dos+"\nBilletes de 1000= "+bille_mil+
				"\nMonedas de 500= "+mon_quinientos+"\nMonedas de 100= "+mon_cien+"\nMonedas de 50= "+mon_cincuenta+"\nMonedas de 25= "+mon_veinticinco+"\nMonedas de 10= "+mon_diez+"\nMonedas de 5= "+mon_cinco+"\nTotal Vuelto= "+billetes);
		JOptionPane.showMessageDialog(null, ventana.obtener10mil());*/
		
		
	
		
		
		

	}

}
