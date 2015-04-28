package torreHanoi;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class fondo extends JPanel {
	
	@Override
	public void paintComponent (Graphics g){
		Dimension tamano=getSize();
		ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/imagen/torres.jpg")).getImage());
		g.drawImage(imagen.getImage(), 0, 0, tamano.width,tamano.height,null);
		
	}
	
	
}
