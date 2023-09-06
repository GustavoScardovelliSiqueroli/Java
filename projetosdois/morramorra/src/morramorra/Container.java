package morramorra;

import javax.swing.JFrame;

import morramorra.Modelo.Fase;

public class Container extends JFrame {

	public Container() {
		add(new Fase());
		setTitle("morramorra");
		setSize(1080, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[]args) {
		new Container();
	}
}
