	import java.awt.event.*;
	import java.util.*;
	import java.awt.*;
import javax.swing.*;
public class Dados_Con_Interfaz extends JFrame implements ActionListener{

		
		private Random random = new Random();
		private JButton boton,salir,prueba;
		private JPanel panel;
		private JLabel lbl;
		private JTextField txt1,txt2,txt_suma,txt_mensaje;
		private int num1=0,num2=0,suma=0;
		private String s;
		
		public static void main(String[] args){
			Dados_Con_Interfaz frame = new Dados_Con_Interfaz();
			frame.setSize(300, 300);
			frame.crearGUI();
			frame.show();
			
			
		}
		
		
		private void crearGUI(){
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container window = getContentPane();
			window.setLayout(new FlowLayout());
			
			lbl  = new JLabel();
			lbl.setText("Dado1 ");
			window.add(lbl);
			txt1 = new JTextField();
			txt1.setText("     ");
			window.add(txt1);
			lbl  = new JLabel();
			lbl.setText("+ Dado 2 ");
			window.add(lbl);
			
			txt2 = new JTextField();
			txt2.setText("     ");
			window.add(txt2);
			
			lbl  = new JLabel();
			lbl.setText(" = ");
			window.add(lbl);
			
			txt_suma = new JTextField();
			txt_suma.setText("       ");
			window.add(txt_suma);
			
			boton = new JButton("Press me");
			window.add(boton);
			boton.setVerticalAlignment(150);
			boton.addActionListener(this);
			
			lbl  = new JLabel();
			lbl.setText("Resultado");
			window.add(lbl);
			
			
			txt_mensaje = new JTextField();
			txt_mensaje.setText("                                  ");
			window.add(txt_mensaje);
			
			prueba = new JButton("Prueba");
			window.add(prueba);
			prueba.addActionListener(this);
			
			salir = new JButton("Salir");
			window.add(salir);
			salir.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Prueba del boton salir");
					System.exit(0);
				}
			});
			
		}


		
		public void actionPerformed(ActionEvent event) {
			if(event.getSource()  == prueba){									//Toma el evento del boton salir
				JOptionPane.showMessageDialog(null, "Evento para prueba (event.getSource()  == prueba)");
				
			}else if(event.getSource() == boton){								//Toma el evento del boton normal
			num1 = random.nextInt(6)+1;
			num2 = random.nextInt(6)+1;
			suma = num1+num2;
			txt1.setText(String.valueOf(num1));
			txt2.setText(String.valueOf(num2));
			txt_suma.setText(String.valueOf(suma));
			if (suma==7) {
				txt_mensaje.setText("Haz Ganado");
				
			}else{
				txt_mensaje.setText("Sigue intentando");
			}
			
			}

		}
		
	}
	

