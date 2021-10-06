import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class Tabla_2por2 extends JFrame implements ActionListener{
	private int [][] tabla = new int [3][3];
	private JTextField txt,txt_total;
	private JButton btn,btn2;
	private int i = 0;
	
	public static void main(String[] args) {
		Tabla_2por2 frame = new Tabla_2por2();
		frame.setSize(300, 300);
		frame.CrearGUI();
		frame.show();

	}
	
	public void CrearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		
		txt = new JTextField(3);
		window.add(txt);
		
		
		btn = new JButton("Obtener Valor");
		window.add(btn);
		btn.addActionListener(this);
		
		btn2 = new JButton("2");
		window.add(btn2);
		btn2.addActionListener(this);
		
		txt_total = new JTextField(5);
		window.add(txt_total);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== btn){
			tabla [i][i] = Integer.parseInt(txt.getText());
			txt.setText("");
			i++;
		}else if(e.getSource()==btn2){
			
			for (int j = 0; j < 3; j++) {
				txt_total.setText(txt_total.getText()+String.valueOf(tabla[j][j]));
			}
		}
			
		
	}

}
