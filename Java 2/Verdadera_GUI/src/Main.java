import javax.swing.JOptionPane;


public class Main {

	
	public static void main(String[] args) {
		String nombre="",sexo="";
		int edad=0;
		
		Datos dat = new Datos(sexo, edad,nombre);
		
		nombre=JOptionPane.showInputDialog("Digite Nombre:");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Digite Edad:"));
		sexo=JOptionPane.showInputDialog("Digite sexo: ");
		dat.asig_edad(edad);
		dat.asig_sexo(sexo);
		dat.asig_nombre(nombre);
		dat.mayor_edad();
		dat.adulto_mayor();
		
	}

}
