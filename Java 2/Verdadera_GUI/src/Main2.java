


import javax.swing.JOptionPane;

/*averiguar cuanto paga una persona por ir a una funcion de cine. 
El programa debe recibir una edad x pantalla y despues decidir con base a la tabla,
		***menores de 5 años : gratis
		***5-12 años : paga la mitad de la tarifa
		***13-54 años : paga la tarifa completa
		***55  o mayor : Funcion es gratis.

utilice objetos,metodos y parametros.
El programa ingresa los datos en el main y envia parametros 
y se retorna al main para imprimir.
Contemplar que para el dia jueves las mujeres acompañadas de un varon pagan el 25%, 
el valor de la entrada es de 2500 
Utilice de salida marco o panel de salida(joptionpane) con un boton que manda a imprimir
*/
public class Main2 {

	
	public static void main(String[] args) {
		int edad= Integer.parseInt(JOptionPane.showInputDialog("CUANTO PAGA UNA PERSONA POR LA FUNCION DE CINE \n Digite la edad: "));
		String dia=JOptionPane.showInputDialog("Si el dia de la función es jueves, favor digitar J");
		String mujer_varon=JOptionPane.showInputDialog("Si la entrada es para una mujer\nacompañada de un varón, favor digitar MV");
	
	 EntradasCine obj = new EntradasCine(edad,dia,mujer_varon);
	 obj.preciofuncion();
	 obj.descuentojueves();
	
	}

}
