import javax.swing.JOptionPane;


public class Peliculas {
	//private String categoria;
	private String[] drama = {"Titanic","VIDA BELLA"};
	private String suspenso="SUSPENSO";
	private String comedia="COMEDIA";
	private int opcion;
	public Peliculas(){
		JOptionPane.showMessageDialog(null, "OPciones");
		opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1.DRAMA"));
		
		switch (opcion) {
		case 1: 
			JOptionPane.showInternalInputDialog(null, drama[0]);
			break;

		default:
			break;
		}
	}
	
//	public String obtener_drama(){
//		return drama;
//	}
	
	public String obtener_suspenso(){
		return suspenso;
	}
	
	public String obtener_comedia(){
		return comedia;
	}
}
