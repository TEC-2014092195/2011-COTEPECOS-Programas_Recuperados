import java.awt.*;

import java.awt.event.*;


import javax.swing.*;


public class Mostrar_imagen extends JFrame implements ActionListener{

	private JButton btn_Dibujo,btn_Ginger;
	private JPanel panel;
	private ImageIcon imagen;
	private int x=0,y=0;
	
	public static void main(String[] args) {
		Mostrar_imagen frame = new Mostrar_imagen();
		frame.setSize(1500, 1000);
		frame.crearGUI();
		frame.show();

	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container v = getContentPane();
		v.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 500));
		panel.setBackground(Color.BLACK);
		v.add(panel);
		
		btn_Dibujo = new JButton("Press me");
		v.add(btn_Dibujo);
		btn_Dibujo.addActionListener(this);
		
		btn_Ginger = new JButton("Ginger");
		v.add(btn_Ginger);
		btn_Ginger.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn_Dibujo){
			imagen = new ImageIcon("Dibujo.png");
			Graphics paper = panel.getGraphics();
			imagen.paintIcon(this, paper, x, y);
			x+=90;
			y+=90;
		}else if(e.getSource()==btn_Ginger){
			imagen = new ImageIcon("Ginger_png.png");
			Graphics paper = panel.getGraphics();
			imagen.paintIcon(this, paper, x, y);
			x+=90;
			y+=90;
		}
		
	}
	
	

}
