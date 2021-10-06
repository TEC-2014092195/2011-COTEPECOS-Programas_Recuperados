import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;


public class Manejo_Caracter extends JFrame implements ActionListener{

	
	private JButton btn_comparar,btn_ignorar,btn_reemplazar,btn_minus,btn_mayus,btn_voltear;
	private JLabel lbl,lbl_hora,lbl_fecha;
	private JTextField txt_cadena1,txt_cadena2,txt_resultado;
	
	
	public static void main(String[] args) {
		Manejo_Caracter frame = new Manejo_Caracter();
		frame.setSize(300, 400);
		frame.crearGUI();
		frame.show();
		frame.setTitle("Manejo Caracteres");
		

	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container v = getContentPane();
		v.setLayout(new FlowLayout());
		
		lbl = new JLabel("Escribir cadena 1 ");
		v.add(lbl);
		
		txt_cadena1 = new JTextField(20);
		v.add(txt_cadena1);

		lbl = new JLabel("Escribir cadena 2 ");
		v.add(lbl);
		
		txt_cadena2 = new JTextField(20);
		v.add(txt_cadena2);
		
		lbl = new JLabel("RESULTADO");
		v.add(lbl);
		
		txt_resultado = new JTextField(20);
		v.add(txt_resultado);
		
		btn_comparar = new JButton("Comparar");
		v.add(btn_comparar);
		btn_comparar.addActionListener(this);
		
		btn_ignorar = new JButton("Ignorar");
		v.add(btn_ignorar);
		btn_ignorar.addActionListener(this);
		
		btn_mayus = new JButton("Mayuscula");
		v.add(btn_mayus);
		btn_mayus.addActionListener(this);
		
		
		btn_minus = new JButton("Minuscula");
		v.add(btn_minus);
		btn_minus.addActionListener(this);
		
		
		btn_reemplazar = new JButton("Reemplazar");
		v.add(btn_reemplazar);
		btn_reemplazar.addActionListener(this);
		
		
		btn_voltear = new JButton("Voltear");
		v.add(btn_voltear);
		btn_voltear.addActionListener(this);
		
		lbl_hora = new JLabel("Hora");
		v.add(lbl_hora);
		Obtener_fechahora();
	}
	
	public void Obtener_fechahora(){
		Calendar cld = Calendar.getInstance();
		int horas = cld.HOUR_OF_DAY;
		int minutos = cld.MINUTE;
		int segundos = cld.MILLISECOND;
		
		
		lbl_hora.setText(String.valueOf(horas)+":"+String.valueOf(minutos)+":"+String.valueOf(segundos));
		
	}
	
	public void actionPerformed(ActionEvent e){
		String texto1,texto2;
		texto1 = txt_cadena1.getText();
		texto2 = txt_cadena2.getText();
		
		
		
		if(e.getSource()==btn_comparar){
			if(texto1.equals(texto2) || texto2.equals(texto1)){
				txt_resultado.setText("Son Iguales");
			}else{
				txt_resultado.setText("Son Diferentes");
			}
			
		//--------------------------------------Comparar Fin	
			
		}else if(e.getSource()==btn_ignorar){
			
			if(texto1.equalsIgnoreCase(texto2) || texto2.equalsIgnoreCase(texto1)){
				txt_resultado.setText("Son Iguales");
			}else{
				txt_resultado.setText("Son Diferentes");
			}
			
			
			
		}else if(e.getSource()==btn_mayus){
			
			if(texto1.equalsIgnoreCase(texto2) || texto2.equalsIgnoreCase(texto1)){
				txt_resultado.setText(texto1.toUpperCase()+"\t"+texto2.toUpperCase());
			}else{
				txt_resultado.setText(texto1.toUpperCase()+"\t"+texto2.toUpperCase());
			}
			
			
			
			
		}else if(e.getSource()==btn_minus){
			
			
				txt_resultado.setText(texto1.toLowerCase()+"\t"+texto2.toLowerCase());
			
			
		}else if(e.getSource()==btn_reemplazar){
			
			
				txt_resultado.setText(texto1.replace("a", "Z")+"\t"+texto2.replace("a", "Z"));
			
			
			
		}else if(e.getSource()==btn_voltear){
			
			String aux="",aux2="";
			for (int i  = texto1.length()-1; i >= 0; i--) {
				aux = aux + texto1.charAt(i);
			}
			for (int i  = texto2.length()-1; i >= 0; i--) {
				aux = aux + texto2.charAt(i);
			}
			txt_resultado.setText(aux+"      "+aux2);
			
			
		}
		
		
	}
	
	

}
