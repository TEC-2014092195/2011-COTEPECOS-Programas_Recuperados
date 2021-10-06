import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;



public class po extends JFrame {

	
	private JLabel lbl;
	private JButton btn_asignar, btn_mostrar;
	private int [][] matriz;
	private Container contenedor; // contenedor del marco
	private GridLayout cuadricula1; // primer objeto GridLayout
	
	
	public static void main(String[] args) {
		po frame = new po();
		frame.setBounds(300, 100, 500, 500);
		frame.crearGUI();
		frame.show(true);
	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());*/
		cuadricula1 = new GridLayout( 2, 3, 50, 50); // 2 filas por 3 columnas; espacios de 5
		contenedor = getContentPane(); // obtiene el panel de contenido
		setLayout( cuadricula1 ); // establece esquema de objeto JFrame
		
		btn_asignar = new JButton("1");
	
		add( btn_asignar);		// agrega boton a objeto JFrame
		//ventana.add(btn_asignar);
		 
		btn_mostrar = new JButton("2");
		add( btn_mostrar);
		
		btn_mostrar = new JButton("3");
		add( btn_mostrar);
		
		btn_asignar = new JButton("4");
		add( btn_asignar);		// agrega boton a objeto JFrame
		//ventana.add(btn_asignar);
		 
		
		
		
		
	}

	

	
}