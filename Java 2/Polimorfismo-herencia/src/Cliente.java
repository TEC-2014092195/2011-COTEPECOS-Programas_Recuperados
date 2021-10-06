
public class Cliente {
	private String nombre;
	private String apellido;
	private String cedula;
	public Cliente(String nombre, String apellido,String cedula){
		this.nombre=nombre;
		this.apellido=apellido;
		this.cedula=cedula;
	}
	
	public String obtener_nombre(){
		return nombre;
	}
	
	public String obtener_apellido(){
		return apellido;
	}
	
	public String obtener_cedula(){
		return cedula;
	}

}
