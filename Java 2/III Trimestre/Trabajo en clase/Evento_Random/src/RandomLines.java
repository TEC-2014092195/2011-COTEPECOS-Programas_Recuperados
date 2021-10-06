import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;



public class RandomLines extends JFrame implements ActionListener {
	
	private Random randomPositions = new Random();
	private JButton boton;
	private JPanel panel;
	
	public static void main(String[] args){
		RandomLines frame = new RandomLines();
		frame.setSize(300, 300);
		frame.createGUI();
		frame.show();
	}
	
	
	private void createGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.WHITE);
		window.add(panel);
		
		boton = new JButton("Press me");
		window.add(boton);
		boton.addActionListener(this);
	}


	
	public void actionPerformed(ActionEvent event) {
		int xEnd, yEnd;
		Graphics paper = panel.getGraphics();
		
		paper.setColor(Color.white);
		paper.fillRect(0, 0, 100, 100);
		paper.setColor(Color.black);
		
		xEnd = randomPositions.nextInt(100);
		yEnd = randomPositions.nextInt(100);
		paper.drawLine(0, 0, xEnd, yEnd);
	}
	
}
