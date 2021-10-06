package Vector_y_Matriz;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Suma_Ordenamiento extends JFrame implements ActionListener{
	
		private JTextField txt_result;
		private JButton btn_1, btn_2, btn_3, btn_4;
		private JLabel lbl;
		private JTextArea txt_area;
		private int[][] matriz1 = {{4,9,91,1},{12,9,8,4},{75,98,16,40}};
		private int[][] matriz2 = {{70,15,11,18},{30,16,7,1},{70,12,7,0}};
		private int total=0;		
		
		
	public static void main (String[] args){
		Suma_Ordenamiento frame = new Suma_Ordenamiento();
		frame.setSize(450, 500);
		frame.crearGUI();
		frame.show();
		
		
	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container v = getContentPane();
		setLayout(new FlowLayout());
		
		btn_1 = new JButton("Opcion 1");
		btn_1.setToolTipText("Suma cuadrante 2 fila 1 de las matrices A y B");
		v.add(btn_1);
		btn_1.addActionListener(this);
		
		btn_2 = new JButton("Opcion 2");
		btn_2.setToolTipText("Suma vector 2 de las matrices A y B");
		v.add(btn_2);
		btn_2.addActionListener(this);
		
		btn_3 = new JButton("Opcion 3");
		btn_3.setToolTipText("Suma cuadrante 1, vector 2 de las matrices A y B");
		v.add(btn_3);
		btn_3.addActionListener(this);
		
		btn_4 = new JButton("Opcion 4");
		btn_4.setToolTipText("Ordenamiento _Burbuja_ Vector 1 matriz B");
		v.add(btn_4);
		btn_4.addActionListener(this);
		
		txt_area = new JTextArea(10,10);
		v.add(txt_area);
		
		txt_result = new JTextField(3);
		v.add(txt_result);
		
		
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn_1){
			
			txt_area.setText("");
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					if(i==1 && j==2){
						int t=matriz1[i][j]+matriz2[i][j];
						
						txt_result.setText(""+t);
					}
					txt_area.setText(txt_area.getText()+matriz1[i][j]+"    ");
				}
				txt_area.setText(txt_area.getText()+"\n");
			}
			
			
		}else if(e.getSource()==btn_2){
			txt_area.setText("");
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					
					if(i==2){
						
						total+=matriz1[i][j]+matriz2[i][j];
						txt_result.setText(""+total);
					}
					txt_area.setText(txt_area.getText()+matriz1[i][j]+"    ");
				}
				txt_area.setText(txt_area.getText()+"\n");
			}
			
		}else if(e.getSource()==btn_3){
			txt_area.setText("");
			for (int i = 0; i < matriz1.length; i++) {
				for (int j = 0; j < matriz1[i].length; j++) {
					if(i==2 && j==1){
						int t=matriz1[i][j]+matriz2[i][j];
						
						txt_result.setText(""+t);
					}
					txt_area.setText(txt_area.getText()+matriz1[i][j]+"    ");
				}
				txt_area.setText(txt_area.getText()+"\n");
			}
			
			
		}else if(e.getSource()==btn_4){
			Orden_burbuja ordenar = new Orden_burbuja();
			ordenar.orden(matriz2);
			
				txt_area.setText("");
				for (int j = 0; j < matriz1[1].length; j++) {
					txt_area.setText(txt_area.getText()+matriz2[1][j]+"\n");
				}
				
			
		}
		
		
		
	}
	
	

}
