import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
public class Main {

	
	public static void main(String[] args) {
		int opcion;
		opcion=Integer.parseInt(JOptionPane.showInputDialog("1. Para Rectangulo\n2. Para Ovalo\n Digite la opcion deseada: "));
		Figuras fig = new Figuras(opcion);
		
		JFrame marco = new JFrame();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.add(fig);
		marco.setSize(300, 300);
		marco.setVisible(true);
		
		
		
		
		
	}

}
