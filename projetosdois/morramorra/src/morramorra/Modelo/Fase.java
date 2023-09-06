package morramorra.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener {

	private Image fundo;
	private Arma faca;
	private Timer timer;
	
	public Fase() {
		
		setFocusable(true);
		setDoubleBuffered(true);
		
		ImageIcon referencia = new ImageIcon("res\\rafaelal.jpg");
		fundo = referencia.getImage();
		
		faca = new Arma();
		faca.load();
		addMouseListener(new RatoAdapter());
		
		timer = new Timer(5,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo ,0,0, null);
		graficos.drawImage(faca.getImagem(), faca.getX(), faca.getY(),this);
		g.dispose();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		faca.update();
		repaint();
		
	}
	
	private class RatoAdapter extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			faca.MousePressed(e);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			faca.MouseRelease(e);
		}
	}
	
}
