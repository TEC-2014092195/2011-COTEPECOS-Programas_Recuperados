	import java.awt.event.*;
	import java.awt.*;
	import javax.swing.*;


public class Timer_Tiempo extends JFrame implements ActionListener{

	private Timer tiempo;
	private JTextField txt_min,txt_seg;
	private int ticks = 0;
	
	
	public static void main(String[] args){
		Timer_Tiempo frame = new Timer_Tiempo();
		frame.setSize(300, 300);
		frame.crearGUI();
		frame.show();	
	}
	
	private void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container window = getContentPane();
		window.setLayout(new FlowLayout());
		
		txt_min = new JTextField(2);
		window.add(txt_min);
		
		txt_seg = new JTextField(2);
		window.add(txt_seg);
		
		tiempo = new Timer(1000,this);
		tiempo.start();
	}
	
	public void actionPerformed(ActionEvent e){
		txt_min.setText(Integer.toString(ticks/60));
		txt_seg.setText(Integer.toString(ticks%60));
		ticks = ticks+1;
	}

}
