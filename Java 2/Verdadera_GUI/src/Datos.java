import javax.swing.JOptionPane;


public class Datos {

	private String sexo,nombre;
	private int edad;
	
	
	public Datos(String sexo, int edad,String nombre){
		this.sexo=sexo;
		this.edad=edad;
		this.nombre=nombre;
		
	}
	
	public void asig_nombre(String nombre){
		this.nombre=nombre;
	}
	public void asig_edad(int edad){
		this.edad=edad;
	}
	
	public void asig_sexo(String sexo){
		this.sexo=sexo;
	}
	public void mayor_edad(){
		if (edad >= 18 && edad<65) {
			JOptionPane.showMessageDialog(null, "Mayor de edad\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo);
		}
			
		
		}
	public void adulto_mayor(){
		if (edad >= 65 ){
			JOptionPane.showMessageDialog(null, "Adulto Mayor\nNombre: "+nombre+"\nEdad: "+edad+"\nSexo: "+sexo);
		}
			
	}
	
	

	
}
