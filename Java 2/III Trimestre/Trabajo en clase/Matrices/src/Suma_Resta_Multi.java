import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Suma_Resta_Multi extends JFrame implements ActionListener{
	
	private int [][] matriz = new int [3][3];
	private int [][] matriz_dos = new int [3][3];
	private int [][] matriz_ope = new int [3][3];
	//private int [][] multi = new int [3][3];
	
	private JButton btn_llenar,btn;
	private JTextField txt_matriz,txt_matriz_dos;
	private JTextArea txt_area; 
	private JLabel lbl,lbl_matriz,lbl_evalua;
	
	private int fila=0,columna=0,total_multi=0;
	
	public static void main(String[] args){
		
		
		Suma_Resta_Multi frame = new Suma_Resta_Multi();
		
		frame.setSize(1000, 500);
		frame.crearGUI();
		frame.show();
		
	}
	
	public void crearGUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container v = getContentPane();
		v.setLayout(new FlowLayout());
		
		lbl = new JLabel("txt_matriz");
		lbl.setText(lbl.getText()+"["+fila+"] ["+columna+"]");
		v.add(lbl);
		
		txt_matriz = new JTextField(3);
		v.add(txt_matriz);
		
		
		
		
		lbl_matriz = new JLabel("txt_matriz_dos");
		lbl_matriz.setText(lbl_matriz.getText()+"["+fila+"] ["+columna+"]");
		v.add(lbl_matriz);
		
		txt_matriz_dos = new JTextField(3);
		v.add(txt_matriz_dos);
		
		
		btn_llenar = new JButton("Llenar Campo");
		v.add(btn_llenar);
		btn_llenar.addActionListener(this);
		
		
		btn = new JButton("Desplegar Matrices");
		v.add(btn);
		btn.addActionListener(this);
		
		txt_area = new JTextArea(30,20);
		v.add(txt_area);
		
		
		lbl_evalua = new JLabel("Nada");
		v.add(lbl_evalua);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btn_llenar){
			
			
			
			matriz[fila][columna]=Integer.parseInt(txt_matriz.getText());
			
			matriz_dos[fila][columna]=Integer.parseInt(txt_matriz_dos.getText());
			
			if(columna!=2){
				columna+=1;
			}else if(columna==2){
				columna=0;
				fila+=1;
			}
			
				
			lbl.setText("");
			lbl.setText("txt_matriz"+"["+fila+"] ["+columna+"]");
			txt_matriz.setText(""); 
			
			lbl_matriz.setText("");
			lbl_matriz.setText("txt_matriz_dos"+"["+fila+"] ["+columna+"]");
			txt_matriz_dos.setText("");
			
			if(fila==3){
				lbl.setText("");
				lbl.setText("txt_matriz"+"[-] [-]");
				txt_matriz.setText(""); 
				
				lbl_matriz.setText("");
				lbl_matriz.setText("txt_matriz_dos"+"[-] [-]");
				txt_matriz_dos.setText("");
				
				lbl_evalua.setText("Matrices llenas");
			}
			
		}else if(e.getSource()==btn){
			llenar_matriz();
		}
		
	}
	
	
	
	public void llenar_matriz(){
		txt_area.setText("");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				txt_area.setText(txt_area.getText()+Integer.toString(matriz[i][j])+"     "); 
			}
			txt_area.setText(txt_area.getText()+"\n"); 
		}
		
		txt_area.setText(txt_area.getText()+"\n");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				txt_area.setText(txt_area.getText()+Integer.toString(matriz_dos[i][j])+"     "); 
			}
			txt_area.setText(txt_area.getText()+"\n"); 
		}
		
		txt_area.setText(txt_area.getText()+"\nSuma\n");
		
		suma();
		
		txt_area.setText(txt_area.getText()+"\nResta\n");
		
		resta();
		
		txt_area.setText(txt_area.getText()+"\nMultiplicación\n");
		
		multi();
		
	}
	
	public void suma(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz_ope[i][j]=(matriz[i][j]+matriz_dos[i][j]);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				txt_area.setText(txt_area.getText()+Integer.toString(matriz_ope[i][j])+"     ");
			}
			txt_area.setText(txt_area.getText()+"\n");
		}
	}
	
	public void resta(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz_ope[i][j]=(matriz[i][j]-matriz_dos[i][j]);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				txt_area.setText(txt_area.getText()+Integer.toString(matriz_ope[i][j])+"     ");
			}
			txt_area.setText(txt_area.getText()+"\n");
		}
	}
	
	public void multi(){
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				for (int j2 = 0; j2 < 3; j2++) {
					matriz_ope[i][j]+=matriz[j][j2]*matriz_dos[j2][j];
				}
			}
		}
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				txt_area.setText(txt_area.getText()+Integer.toString(matriz_ope[i][j])+"     ");
			}
			txt_area.setText(txt_area.getText()+"\n");				
		}
	}

	
	
	
	
	
	
}
