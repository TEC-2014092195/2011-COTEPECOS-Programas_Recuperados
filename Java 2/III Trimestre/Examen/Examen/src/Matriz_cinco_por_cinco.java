/**
 * Kevin Hernandez Rostran
 * 11-4
 */
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ContainerEvent;

import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;


public class Matriz_cinco_por_cinco extends JFrame implements ActionListener,ChangeListener{

	static int matriz [][]=new int[5][5];
	private JSlider slider_ver,slider_hor;
	private JTextArea txt_area;
	private JTextField txt_fila,txt_columna,txt_total,txt_cam_valor;
	private JLabel lbl;
	private JButton btn_cambiar;
	private int total_par,fila_c,columna_c,total;
	
	
	public static void main(String[] args) {
		Matriz_cinco_por_cinco frame = new Matriz_cinco_por_cinco();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				/*matriz[i][j]=1;*/
				matriz[i][j]=Integer.valueOf(JOptionPane.showInputDialog("Digite el valor de "+"fila["+i+"] columna["+j+"]"));
			}
		}
		
		
		
		frame.setSize(1000, 500);
		frame.crearGUI();
		frame.show();

	}

	
	private void crearGUI() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ventana = getContentPane();
		ventana.setLayout(new FlowLayout());
		
		txt_area = new JTextArea(10,10);
		ventana.add(txt_area);
		llenar_matriz();
		
		
		slider_ver = new JSlider(JSlider.VERTICAL,0,4,1);
		slider_ver.setMajorTickSpacing(1);
		slider_ver.setPaintTicks(true);
		ventana.add(slider_ver);
		slider_ver.addChangeListener(this);
		
		slider_hor = new JSlider(JSlider.HORIZONTAL,0,4,1);
		ventana.add(slider_hor);
		slider_hor.addChangeListener(this);
		
		
		lbl = new JLabel("fila");
		ventana.add(lbl);
		
		txt_fila = new JTextField(3);
		ventana.add(txt_fila);
		txt_fila.setText(String.valueOf(slider_ver.getValue()));
		
		lbl = new JLabel("columna");
		ventana.add(lbl);
		
		txt_columna = new JTextField(3);
		ventana.add(txt_columna);
		txt_columna.setText(String.valueOf(slider_hor.getValue()));
		
		
		lbl = new JLabel("cambiar valor");
		ventana.add(lbl);
		
		txt_cam_valor = new JTextField(3);
		ventana.add(txt_cam_valor);
		
		lbl = new JLabel("total");
		ventana.add(lbl);
		
		txt_total = new JTextField(3);
		ventana.add(txt_total);
		
		btn_cambiar = new JButton("cambiar");
		ventana.add(btn_cambiar);
		btn_cambiar.addActionListener(this);
		
	}
	
	public void llenar_matriz(){
		txt_area.setText("");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				txt_area.setText(txt_area.getText()+String.valueOf(matriz[i][j])+"    ");
			}
			txt_area.setText(txt_area.getText()+"\n");
		}
	}


	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==slider_ver){
			txt_fila.setText(String.valueOf(slider_ver.getValue()));
		}else if(e.getSource()==slider_hor){
			txt_columna.setText(String.valueOf(slider_hor.getValue()));
		}
		
	}

	/*public void sumar_matriz(){
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				total+=matriz[i][j];
			}
		}
	}*/
	
	/*public void llenar_con_aumento(){
		txt_area.setText("");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				txt_area.setText(txt_area.getText()+String.valueOf((matriz[i][j]+2))+"    ");
			}
			txt_area.setText(txt_area.getText()+"\n");
		}
	}*/
	
	public void actionPerformed(ActionEvent e) {
		
		fila_c=Integer.valueOf(txt_fila.getText());
		columna_c=Integer.valueOf(txt_columna.getText());
		matriz[fila_c][columna_c]=Integer.valueOf(txt_cam_valor.getText());
		
		txt_area.setText("");
		total_par=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(i==j||j==i){
					
					total_par += matriz[i][j];
					txt_total.setText(String.valueOf(total_par));
					
					txt_area.setText(txt_area.getText()+String.valueOf((matriz[i][j]))+"    ");
				}else if(j!=i){
					txt_area.setText(txt_area.getText()+String.valueOf((matriz[i][j])+2)+"    ");
				}
				
				
			}
			
			txt_area.setText(txt_area.getText()+"\n");
		}
		/*fila_c=Integer.valueOf(txt_fila.getText());
		columna_c=Integer.valueOf(txt_columna.getText());
		if (fila_c==columna_c){
			matriz[fila_c][columna_c]=Integer.valueOf(txt_cam_valor.getText());
			sumar_matriz();
			txt_total.setText(String.valueOf(total));
			total=0;
			llenar_matriz();
		}else{
			if(txt_cam_valor.getText()!=""){
				matriz[fila_c][columna_c]=Integer.valueOf(txt_cam_valor.getText());
				sumar_matriz();
				txt_total.setText(String.valueOf(total));
				total=0;
				llenar_con_aumento();
				//llenar_matriz();
				
			}else{
				txt_cam_valor.setText("0");
				matriz[fila_c][columna_c]=Integer.valueOf(txt_cam_valor.getText());
				sumar_matriz();
				txt_total.setText(String.valueOf(total));
				total=0;
				llenar_matriz();
			}
		}*/
		
		
		
	}
			
}

