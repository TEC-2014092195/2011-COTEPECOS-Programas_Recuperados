import java.util.Random;


import javax.swing.JOptionPane;





public class Dados {

	
	public static void main(String[] args) {
		int suma = 0,dado1 = 0,dado2 = 0;
		Random random = new Random();
		do {
			dado1 = random.nextInt(6)+1;
			dado2 = random.nextInt(6)+1;
			suma = dado1+dado2;
			JOptionPane.showMessageDialog(null, "Dado(1)   "+dado1+"    Dado(2)   "+dado2+" =    "+suma);
			
		} while (suma!=7);
		

	}

}
