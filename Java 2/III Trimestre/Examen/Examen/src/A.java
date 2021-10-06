import javax.swing.*;
import java.awt.*;
public class A {
public static void main(String[] args) {
	
	
	JFrame f = new JFrame();
	Container container = f.getContentPane();
	container.setLayout(new GridBagLayout());
	((JPanel)container).setBorder(BorderFactory.createTitledBorder(
			"Entrada al sistema"));
GridBagConstraints c = new GridBagConstraints();
c.weightx=0.4; c.weighty=1.0;
c.gridwidth=GridBagConstraints.RELATIVE;
c.gridheight=GridBagConstraints.RELATIVE;
c.fill=GridBagConstraints.BOTH;
c.anchor = GridBagConstraints.WEST;
c.insets = new Insets(2,5,2,0);
container.add(new JLabel("Usuario"),c);
c.gridwidth=GridBagConstraints.REMAINDER;
c.gridheight=GridBagConstraints.RELATIVE;
c.weightx=1.0;
c.insets = new Insets(2,0,2,5);
container.add(new JTextField(),c);
c.gridwidth=GridBagConstraints.RELATIVE;
c.gridheight=GridBagConstraints.REMAINDER;
c.weightx=0.4;
c.insets = new Insets(2,5,2,0);
container.add(new JLabel("Contraseña"),c);
c.gridwidth=GridBagConstraints.REMAINDER;
c.gridheight=GridBagConstraints.REMAINDER;
c.weightx=1.0;
c.insets = new Insets(2,0,2,5);
container.add(new JTextField(),c);
f.setSize(220,110);
f.setTitle("Login");
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}