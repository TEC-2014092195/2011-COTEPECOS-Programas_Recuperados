package Marco;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Saludo extends JFrame{
	public static void main(String[] args) {
		Saludo marco = new Saludo();
		marco.setSize(600, 800);
		marco.crearGUI();
		marco.setVisible(true);
		
	}
	private void crearGUI(){
		setTitle("Mi Primera GUI");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		
		JTextField CampoTexto = new JTextField("Adios!!");
		ventana.add(CampoTexto);
		
		JOptionPane.showMessageDialog(null, "Estoy cerrando la aplicación");
		
	}
	
	

}
