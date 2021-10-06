import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Arreglo_diez extends JFrame implements ActionListener{

	private JButton btn,btn_buscar,btn_ordenar_burbuja,btn_ord_insert;
	private JTextArea txt_area,txt_a_nombres;
	private int [] arreglo = new int [10];
	private String [] arreglo_nombre = new String [10];
	private JTextField txt_indice,txt_valor,txt_nombre,txt_indice_dos,txt_nombre_buscar,txt_buscado; 
	private JLabel lbl;
	
	
	
	public static void main(String[] args) {
		Arreglo_diez frame = new Arreglo_diez();
		frame.setSize(700, 500);
		frame.crearGUI();
		frame.show();
		

	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container v = getContentPane();
		setLayout(new FlowLayout());
		
		txt_area = new JTextArea(10,10);
		v.add(txt_area);
		
		lbl = new JLabel("Indice");
		v.add(lbl);
		
		txt_indice = new JTextField(3);
		v.add(txt_indice);
		
		lbl = new JLabel("Valor(Telefono)");
		v.add(lbl);
		
		txt_valor = new JTextField(3);
		v.add(txt_valor);
		

		
		lbl = new JLabel("Indice2");
		v.add(lbl);
		
		txt_indice_dos = new JTextField(3);
		v.add(txt_indice_dos);
		
		lbl = new JLabel("Nombre");
		v.add(lbl);
		
		txt_nombre = new JTextField(3);
		v.add(txt_nombre);
		
		txt_a_nombres = new JTextArea(10,10);
		v.add(txt_a_nombres);
		
		btn = new JButton("Agregar");
		v.add(btn);
		btn.addActionListener(this);
		
		lbl = new JLabel("Nombre");
		v.add(lbl);
		
		txt_nombre_buscar = new JTextField(3);
		v.add(txt_nombre_buscar);
		
		lbl = new JLabel("Buscado");
		v.add(lbl);
		
		txt_buscado = new JTextField(20);
		v.add(txt_buscado);
		
		btn_buscar = new JButton("Buscar");
		v.add(btn_buscar);
		btn_buscar.addActionListener(this);
		
		btn_ordenar_burbuja = new JButton("Orden Burbuja");
		v.add(btn_ordenar_burbuja);
		btn_ordenar_burbuja.addActionListener(this);
		
		
		btn_ord_insert = new JButton("Orden Insertar");
		v.add(btn_ord_insert);
		btn_ord_insert.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn){
			int ind=0,ind2=0;
			ind=Integer.parseInt(txt_indice.getText());
			arreglo[ind]=Integer.parseInt(txt_valor.getText());
			txt_area.setText("");
			for (int i = 0; i < 10; i++) {
				txt_area.setText(txt_area.getText()+arreglo[i]+"\n");
			}
			
			
			ind2=Integer.parseInt(txt_indice_dos.getText());
			arreglo_nombre[ind2]=txt_nombre.getText();
			txt_a_nombres.setText("");
			for (int i = 0; i < 10; i++) {
				txt_a_nombres.setText(txt_a_nombres.getText()+arreglo_nombre[i]+"\n");
			}
		}else if(e.getSource()==btn_buscar){
			String buscar,b="nada";
			buscar=txt_nombre_buscar.getText();
			int indice_encontrado=10;
			for (int i = 0; i < 10; i++) {
				
				if(buscar.equals(arreglo_nombre[i])){
					indice_encontrado=i;
					i=10;
					
				}
			}
			
				
				txt_buscado.setText("Telefono "+arreglo[indice_encontrado]+"  Nombre "+arreglo_nombre[indice_encontrado]);
			
			
			
			
		}else if(e.getSource()==btn_ordenar_burbuja){
			Orden_Burbuja ordenar_b = new Orden_Burbuja();
			ordenar_b.recibir(arreglo,arreglo_nombre);
			
			txt_area.setText("");
			txt_a_nombres.setText("");
			for (int i = 0; i < 10; i++) {
				txt_area.setText(txt_area.getText()+arreglo[i]+"\n");
				txt_a_nombres.setText(txt_a_nombres.getText()+arreglo_nombre[i]+"\n");
			}
		}else if(e.getSource()==btn_ord_insert){
			
			Orden_Insert ordenar_in = new Orden_Insert();
			ordenar_in.ordenar(arreglo,arreglo_nombre);
			
			
			txt_area.setText("");
			txt_a_nombres.setText("");
			for (int i = 0; i < 10; i++) {
				txt_area.setText(txt_area.getText()+arreglo[i]+"\n");
				txt_a_nombres.setText(txt_a_nombres.getText()+arreglo_nombre[i]+"\n");
			}
		}
		
	}

	

}
