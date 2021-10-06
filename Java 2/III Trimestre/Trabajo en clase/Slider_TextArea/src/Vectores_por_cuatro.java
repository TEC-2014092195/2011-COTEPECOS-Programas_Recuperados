import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;



public class Vectores_por_cuatro extends JFrame {   /*implements ActionListener, ChangeListener{*/

	private JSlider slider_v,slider_h;
	private JTextArea txt_area;
	private JLabel lbl;
	private JButton btn_asignar, btn_mostrar;
	private int [][] matriz;
	private GridBagLayout esquema; // esquema de este marco
	private GridBagConstraints restricciones; // restricciones de este esquema
	
	public static void main(String[] args) {
		Vectores_por_cuatro frame = new Vectores_por_cuatro();
		//frame.setBounds(300, 100, 500, 500);
		frame.setSize(300,500);
		frame.crearGUI();
		frame.show(true);
	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		esquema = new GridBagLayout();
		setLayout( esquema ); // establece el esquema del marco
		restricciones = new GridBagConstraints(); // instancia las restricciones
		
		btn_asignar = new JButton("Asignar");
		slider_v = new JSlider(JSlider.VERTICAL,0,10,5);
		slider_h = new JSlider(JSlider.HORIZONTAL,0,10,5);
	
		txt_area = new JTextArea(5,10);
		
		
		restricciones.fill = GridBagConstraints.NONE;
		agregarComponente( btn_asignar, 0, 0, 1, 1);
		
		agregarComponente(slider_v, 0, 1, 0, 0); //componente,fila,columna,ancho,alto
		
		agregarComponente(slider_h, 20, 3, 0, 0); //componente,fila,columna,ancho,alto
		
		
	
		
		
	}
	
	
	private void agregarComponente( Component componente,
				
				int fila, int columna, int anchura, int altura )
			 {
			 restricciones.gridx = columna; // establece gridx (La columna en la que se colocará el componente)
			 restricciones.gridy = fila; // establece gridy (La fi la en la que se colocará el componente)
			 restricciones.gridwidth = anchura; // establece gridwidth (El número de columnas que ocupa el componente)
			 restricciones.gridheight = altura; // establece gridheight (El número de filas que ocupa el componente)
			 esquema.setConstraints( componente, restricciones ); // establece restricciones
			 add( componente ); // agrega el componente
			 } // fin del método agregarComponent

}
