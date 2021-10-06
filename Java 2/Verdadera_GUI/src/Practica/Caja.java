package Practica;
/**
 * Examen programacion 30 Agosto
 * Kevin Hernandez Rostran
 * 11-4
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Caja extends JFrame implements ActionListener{
	private JButton boton;
	public double pago_cliente,sub_total,descuento=0.02,total=0,vuelto=0,billetes=0,restante=10;
	public double bille_diez=0,bille_cinco,bille_dos,bille_mil,mon_quinientos,mon_cien,mon_cincuenta,mon_veinticinco,mon_diez,mon_cinco; 
	public String diez,cinco,dos,uno,quini,cien,cin,vein,ten,cinc;		
	public Caja (){
		super("Caja");
		Ventana();
		this.setSize(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public void Ventana(){
		this.setLayout(new FlowLayout());
		boton=new JButton("Calculo");
		this.add(boton);
		boton.addActionListener(this);
	}

	public void total(double sub_total,double pago_cliente){
		this.sub_total=sub_total;
		this.pago_cliente=pago_cliente;
		
		//billetes=vuelto;
		
		
	}

	
	/*public String obtener10mil(){
		diez=String.valueOf(bille_diez);
		return diez;
	}*/
	
	/*public String obtener10mil(){
		diez=String.valueOf(bille_diez);
		return diez;
	}*/
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton){
			if (sub_total>100000) {
				total=sub_total;
				total-=(sub_total*descuento);
			}else{
				total=sub_total;
			}
			
			vuelto=pago_cliente-total;
			billetes=vuelto;
			JOptionPane.showMessageDialog(null, "SubTotal: "+sub_total+"\nDescuento: "+descuento+"\nTotal pagar: "+total+"\nCliente Pago: "+pago_cliente+"\nVuelto: "+vuelto);
			while(vuelto!=0){
				if(vuelto>=10000){
				vuelto=vuelto-10000;
				bille_diez=bille_diez+1;
				}else if(vuelto>=5000){
					vuelto=vuelto-5000;
					bille_cinco=bille_cinco+1;
				}else if(vuelto>=2000){
					vuelto=vuelto-2000;
					bille_dos=bille_dos+1;
				}else if(vuelto>=1000){
					vuelto=vuelto-1000;
					bille_mil=bille_mil+1;
				}else if(vuelto>=500){
					vuelto=vuelto-500;
					mon_quinientos=mon_quinientos+1;
				}else if(vuelto>=100){
					vuelto=vuelto-100;
					mon_cien=mon_cien+1;
				}else if(vuelto>=50){
					vuelto=vuelto-50;
					mon_cincuenta+=1;
				}else if(vuelto>=25){
					vuelto=vuelto-25;
					mon_veinticinco+=1;
				}else if(vuelto>=10){
					vuelto=vuelto-10;
					mon_diez+=1;
				}else if(vuelto>=5){
					vuelto=vuelto-5;
					mon_cinco+=1;
				}
				
					
			}
			//
			
			
			JOptionPane.showMessageDialog(null, "Billetes de 10000= "+bille_diez+"\nBilletes de 5000= "+bille_cinco+"\nBilletes de 2000= "+bille_dos+"\nBilletes de 1000= "+bille_mil+
					"\nMonedas de 500= "+mon_quinientos+"\nMonedas de 100= "+mon_cien+"\nMonedas de 50= "+mon_cincuenta+"\nMonedas de 25= "+mon_veinticinco+"\nMonedas de 10= "+mon_diez+"\nMonedas de 5= "+mon_cinco+"\nTotal Vuelto= "+billetes);
				
			}
		}
		
	}


