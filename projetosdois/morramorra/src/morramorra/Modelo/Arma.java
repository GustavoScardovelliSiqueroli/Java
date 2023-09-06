package morramorra.Modelo;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;

public class Arma {
	
	private int dx,dy;
	private Image imagem;
	private int altura,largura;
	
	PointerInfo a = MouseInfo.getPointerInfo();
	Point b = a.getLocation();
	int x;
	int y; 
	
	
	public Arma() {
		
		this.x = (int) b.getX();
		this.y = (int) b.getY();
		
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\faca.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getHeight(null);
		
	}
	
	public void update() {
		x = (int) b.getX();
		y = (int) b.getY();
	}
	
	public void MousePressed(MouseEvent e){
    
		
    }

	public void MouseRelease(MouseEvent e){
    
		
    }
	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
