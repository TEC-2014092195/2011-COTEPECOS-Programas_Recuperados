package Marco;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
public class Eventos extends JFrame implements ActionListener{
	private JButton button,salir;
	private JPanel panel;
	
	
	public static void main(String[] args) {
		Eventos frame = new Eventos();
		frame.setSize(400,300);
		frame.setLocation(400, 400);
		frame.crearGUI();
		frame.show();
	}
	private void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 200));
		panel.setBackground(Color.blue);
		window.add(panel);
		
		button = new JButton("Press me");
		window.add(button);
		button.addActionListener(this);
		salir= new JButton("Salir");
		window.add(salir);
		
	}
	public void actionPerformed(ActionEvent ae){
		Graphics paper = panel.getGraphics();
		paper.setColor(Color.red);
		//paper.drawLine(0, 0, 100, 100);
		paper.drawLine(70,70, 100, 20);
		paper.drawLine(100,20, 120, 70);
		paper.drawLine(70,70, 120, 70);
		paper.drawLine(150,70, 170, 20);
		paper.drawLine(170,20, 195, 70);
		paper.drawLine(150,70, 195, 70);
		
		/*paper.drawLine(75,100, 150, 65);  Este Bloque Crea un triangulo en el centro
		paper.drawLine(75,100, 150, 135);	
		paper.drawLine(150,65, 150, 135);
		paper.drawLine(0, 100, 300, 100);*/
	}
	
	public void actionPerformed1(ActionEvent ae){
		this.dispose();
	}

}
