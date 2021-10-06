import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;



public class Slider_Example extends JFrame implements ActionListener, ChangeListener{

	private JPanel panel;
	private Random random;
	private javax.swing.Timer tiempo;
	private JSlider slider;
	private JTextField txt;
	private JLabel lbl;
	
	public static void main(String[] args) {
		Slider_Example frame = new Slider_Example();
		frame.setSize(250, 300);
		frame.crearGUI();
		frame.show();
	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		random = new Random();
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200 , 200));
		panel.setBackground(Color.white);
		ventana.add(panel);
		
		lbl = new JLabel("Tiempo Gap: ");
		ventana.add(lbl);
		txt = new JTextField(10);
		ventana.add(txt);
		
		slider = new JSlider(JSlider.HORIZONTAL, 200, 2000, 1000);
		ventana.add(slider);
		slider.addChangeListener(this);
		txt.setText(Integer.toString(slider.getValue()));
		tiempo = new javax.swing.Timer(1000, this);
		tiempo.start();
		
	}
	

	
	public void actionPerformed(ActionEvent event) {
		int x, y, size;
		Graphics paper = panel.getGraphics();
		x = random.nextInt(200);
		y = random.nextInt(200);
		size = random.nextInt(20);
		paper.fillOval(x, y, size, size);
	}
	public void stateChanged(ChangeEvent e){
		int cambio_tiempo = slider.getValue();
		txt.setText(Integer.toString(cambio_tiempo));
		tiempo.setDelay(cambio_tiempo);
	}

}
