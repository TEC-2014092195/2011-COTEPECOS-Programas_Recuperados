
import javax.swing.JOptionPane;


public class Main_conversiones {
	
	public static void main(String[] args) {
		
		int entero,unocero;
		double doble;
		float flotante;
		int opcion;
		String recibir;
		
		do {
			recibir=JOptionPane.showInputDialog("Que Quiere convertir: ");
			JOptionPane.showMessageDialog(null, "1. String \n2. Para Entero \n3. Para Doble \n4.Flotante \n5. Para Byte \n6.Todas");
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion deseada o cero para salir "));
			switch (opcion) {
			case 1:
				JOptionPane.showMessageDialog(null, recibir);
				break;
			case 2: 
			
				doble = Double.parseDouble(recibir);
				entero= (int)doble;
				
				JOptionPane.showMessageDialog(null, entero);
				break;
			case 3:
				doble = Double.valueOf(recibir).doubleValue();
				JOptionPane.showMessageDialog(null, doble);
				break;
				
			case 4:
				flotante = Float.valueOf(recibir).floatValue();
				JOptionPane.showMessageDialog(null, flotante);
				
				break;
				
			case 5:
				doble = Double.parseDouble(recibir);
				entero= (int)doble;
				if(entero == 0 || entero == 1)
				{
					unocero=entero;
					JOptionPane.showMessageDialog(null, "Correcto: "+unocero);
				}else
					JOptionPane.showMessageDialog(null, "Diferente a 1 o 0 ");
				break;
			case 6:
				doble = Double.parseDouble(recibir);
				entero = (int)doble;
				flotante = Float.valueOf(recibir).floatValue();
				if(entero == 0 || entero == 1)
				{
					unocero = entero;
					JOptionPane.showMessageDialog(null, "String: "+recibir+" Doble:"+doble+" Entero: "+entero+" Flotante: "+flotante+"Byte: "+unocero);
				}else
				JOptionPane.showMessageDialog(null, "String: "+recibir+" Doble:"+doble+" Entero: "+entero+" Flotante: "+flotante);
				break;
			default:
				break;
			}
			
		}while(opcion!=0);
		
		
		
		
	}

}
