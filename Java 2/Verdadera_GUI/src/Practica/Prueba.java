package Practica;

import java.awt.FlowLayout;

import javax.swing.*;

public class Prueba extends JFrame {
	private JButton boton;
	
	
	public Prueba (){
		super("Prueba");
		Ventana();
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void Ventana(){
		this.setLayout(new FlowLayout());
		boton = new JButton("Imprimir");
		this.add(boton);
		
	}
	
	
}
