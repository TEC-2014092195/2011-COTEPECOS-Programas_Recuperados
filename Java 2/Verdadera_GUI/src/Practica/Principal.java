package Practica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Principal extends JFrame implements ActionListener {
	private JButton boton;
	private JLabel Etiqueta,espacio,lbldia,lblsexo;
	private JTextField texto,txt_sexo,txt_dia;
	private int edad;
	private double total;
	private String cadena;
	
	
	public Principal(){
		super("EDAD");
		definirVentana();
		this.setSize(400, 400);
		this.setLocation(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void definirVentana(){
		this.setLayout(new FlowLayout());
		Etiqueta = new JLabel("Etiqueta");
		espacio = new JLabel("Siga las siguientes instrucciones: ");
		lbldia = new JLabel("Digite la letra j en caso de ser jueves: ");
		lblsexo = new JLabel("Digite la letra (m=masculino, f=femenino): ");
		boton = new JButton("Imprimir");
		texto = new JTextField(20);
		txt_dia = new JTextField(1);
		txt_sexo = new JTextField(1);
		this.add(espacio);
		this.add(lbldia);
		this.add(txt_dia);
		this.add(lblsexo);
		this.add(txt_sexo);
		this.add(texto);
		this.add(boton);
		this.add(Etiqueta);
		
		
		boton.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton){
			
			this.edad=Integer.parseInt(texto.getText());
			if(txt_dia.getText()!="j"){
			if(edad<5){
				Etiqueta.setText("Gratis");
			}else if(edad >= 5 && edad <= 12){
				total=2500/2;
				cadena=Double.toString(total);
				Etiqueta.setText("La mitad de la Tarifa: "+cadena);
			}else if(edad>12 && edad<=54){
				Etiqueta.setText("Tarifa Completa: 2500");
			}else if(edad>54){
				Etiqueta.setText("Gratis");
			}
			}
		}		
	}
	
	
	
	
}
