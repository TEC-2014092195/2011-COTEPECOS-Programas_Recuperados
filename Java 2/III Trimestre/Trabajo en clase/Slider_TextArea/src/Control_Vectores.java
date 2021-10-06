import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;


public class Control_Vectores extends JFrame implements ChangeListener,ActionListener{
	
	private JTextField txt_fila, txt_columna, txt_valor,txt_fila_a,txt_columna_a;
	private JSlider slider_vertical,slider_horizontal;
	private JTextArea txt_area;
	private JButton btn,btn_almacenar;
	private JLabel lbl;
	private int [][]array;
	private int fila,columna;
	private int f,c;
	
	public static void main(String[] args) {
		Control_Vectores frame = new Control_Vectores();
		frame.setSize(500, 500);
		frame.crearGUI();
		frame.show();

	}


	private void crearGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		
		lbl=new JLabel("txt_fila");
		ventana.add(lbl);
		
		txt_fila = new JTextField(4);
		ventana.add(txt_fila);
		
		lbl=new JLabel("txt_columna");
		ventana.add(lbl);
		
		txt_columna = new JTextField(4);
		ventana.add(txt_columna);
		
		lbl=new JLabel("txt_valor");
		ventana.add(lbl);
		
		txt_valor = new JTextField(4);
		ventana.add(txt_valor);
		
		slider_vertical = new JSlider(JSlider.VERTICAL,0,5,1); //0 = minimo del slider,5 = maximo del slider,1 = valor donde va a iniciar 
		slider_vertical.setMajorTickSpacing(1);               // crea una marca cada 1
		slider_vertical.setPaintTicks(true);  // dibuja las marcas en el control
		ventana.add(slider_vertical);
		slider_vertical.addChangeListener(this);
		
		
		txt_area = new JTextArea(10, 3);
		ventana.add(txt_area);
		
		
		slider_horizontal = new JSlider(JSlider.HORIZONTAL,0,5,1);
		slider_horizontal.setMajorTickSpacing(1); 
		slider_horizontal.setPaintTicks(true);
		slider_horizontal.setPaintLabels(true); //muestra los numeros del SLider
		ventana.add(slider_horizontal);
		slider_horizontal.addChangeListener(this);
		
		lbl=new JLabel("asignar maximo fila");
		ventana.add(lbl);
		
		txt_fila_a = new JTextField(4);
		ventana.add(txt_fila_a);
		
		lbl=new JLabel("asignar maximo columna");
		ventana.add(lbl);
		
		txt_columna_a = new JTextField(4);
		ventana.add(txt_columna_a);
		
		btn = new JButton("Asignar");
		ventana.add(btn);
		btn.addActionListener(this);
		
		btn_almacenar = new JButton("Almacenar");
		ventana.add(btn_almacenar);
		btn_almacenar.addActionListener(this);
		
		
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn){
			if(txt_fila_a.getText()!= "" && txt_columna_a.getText()!= ""){
				fila = Integer.parseInt(txt_fila_a.getText());
				columna = Integer.parseInt(txt_columna_a.getText());
				
				slider_horizontal.setMaximum(columna);
				slider_vertical.setMaximum(fila);
				
				array = new int [fila][columna];
	
			}
		}else if(e.getSource()==btn_almacenar){
			txt_area.setText("");
			
			f=Integer.parseInt(txt_fila.getText());
			c=Integer.parseInt(txt_columna.getText());
			if(f==0 && c==0){
				array[f][c]=Integer.parseInt(txt_valor.getText());
			}else if(f==0){
				array[f][c-1]=Integer.parseInt(txt_valor.getText());
			}else if(c==0){
				array[f-1][c]=Integer.parseInt(txt_valor.getText());
			}else{
				array[f-1][c-1]=Integer.parseInt(txt_valor.getText());
			}
			
			txt_area.setText("");
			txt_valor.setText("");
			
			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < columna; j++) {
					
					txt_area.setText(txt_area.getText()+"  "+String.valueOf(array[i][j]));
				}
				txt_area.setText(txt_area.getText()+"\n");
			}
			
			
			
			
			
		}
		
		
		
	}


	
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==slider_vertical){
			txt_fila.setText(Integer.toString(slider_vertical.getValue()));
			
		}else if(e.getSource()==slider_horizontal){
			txt_columna.setText(Integer.toString(slider_horizontal.getValue()));
		}
	
	}

}
