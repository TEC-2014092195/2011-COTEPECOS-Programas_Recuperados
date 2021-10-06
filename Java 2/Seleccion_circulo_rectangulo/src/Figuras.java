import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;


public class Figuras extends JPanel {
	
	private int opcion;
	
	public Figuras(int opcion){
		this.opcion = opcion;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for (int i = 0; i < 10; i++) {
			
			switch (opcion) {
			case 1:
				g.drawRect(140-i*10, 100-i*5, 25+i*20, 25+i*10);
				
				break;

			default:
				break;
			}
			
		}
	}
	/*paper.setColor(Color.red);
	//paper.drawLine(0, 0, 100, 100);
	paper.drawLine(70,70, 100, 20);
	paper.drawLine(100,20, 120, 70);
	paper.drawLine(70,70, 120, 70);
	paper.drawLine(150,70, 170, 20);
	paper.drawLine(170,20, 195, 70);
	paper.drawLine(150,70, 195, 70);*/
	
}
	
	
	/*paper.drawLine(75,100, 150, 65);  Este Bloque Crea un triangulo en el centro
	paper.drawLine(75,100, 150, 135);	
	paper.drawLine(150,65, 150, 135);
	paper.drawLine(0, 100, 300, 100);
	*/
