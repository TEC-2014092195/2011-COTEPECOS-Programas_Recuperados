/*Contemplar que para el dia jueves las mujeres acompañadas de un varon pagan el 25%, 
el valor de la entrada es de 2500 
Utilice de salida marco o panel de salida(joptionpane) con un boton que manda a imprimir
y la tabla es : 
menores de 5 años : gratis
5-12 años : paga la mitad de la tarifa
13-54 años : paga la tarifa completa
55  o mayor : Funcion es gratis.*/



import javax.swing.JOptionPane;

public class EntradasCine {

	private int edad;
	private String dia;
	private String mujer_varon;
	int tarifa=2500;
	
	public EntradasCine (int edad, String dia,String mujer_varon){
		this.edad = edad;
		this.dia= dia;
		this.mujer_varon= mujer_varon;
	}
	public void preciofuncion (){
		if (edad<5 || edad>=55) {
			JOptionPane.showMessageDialog(null, "La entrada a la funcion es gratis!");
		}else
		if (edad>=5 && edad<12){ 
			JOptionPane.showMessageDialog(null, "Paga la mitad de la tarifa: ¢"+tarifa/2);
		}else
			if (edad>13 && edad<54){
			JOptionPane.showMessageDialog(null, "Paga la tarifa completa: ¢"+tarifa);
		}
	}
	public void descuentojueves (){
		if (dia == "j" && mujer_varon=="mv") {
			JOptionPane.showMessageDialog(null, "La tarifa para la mujer es de: ¢"+(tarifa-(tarifa*0.25))+"\nEl acompañante paga la tarifa completa: ¢"+tarifa);
		}
	}
}

