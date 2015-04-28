package torreHanoi;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class juego extends JFrame  {

	static JButton uno;
	static JButton dos;
	static JButton tres;
	static JButton cuatro;
	static JButton cinco;
	static JButton seis;
	static JButton siete;
	static JButton ocho;
	int x1=146,y1=54;
	juego() {
		fondo fondo_ = new fondo();
		
		getContentPane().add(fondo_);
		fondo_.setLayout(null);
		//Container contener= getContentPane();
		
		JButton uno = new JButton(new ImageIcon("1.png"));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		uno.setBounds(x1, y1, 40, 25);
		fondo_.add(uno);
		
		uno.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyText(e.getKeyCode()));
				String l=e.getKeyText(e.getKeyCode());
				if (l.equals("Derecha")){
					x1+=333;
					uno.setBounds(x1, y1, 40, 25);
				}
				else if(l.equals("Izquierda")){
					x1-=333;
					uno.setBounds(x1, y1, 40, 25);}
						
					
			}
		});
				
		
		JButton dos = new JButton(new ImageIcon("2.png"));
		dos.setBounds(126, 79, 80, 25);
		
		
		JButton tres = new JButton(new ImageIcon("3.png"));
		tres.setBounds(106, 104, 120, 25);
		
		
		JButton cuatro = new JButton(new ImageIcon("4.png"));
		cuatro.setBounds(86, 129, 160, 25);
		
		
		JButton cinco = new JButton(new ImageIcon("5.png"));
		cinco.setBounds(66, 154, 200, 25);
		
		
		JButton seis = new JButton(new ImageIcon("6.png"));
		seis.setBounds(46, 179, 240, 25);
		
		
		JButton siete = new JButton(new ImageIcon("7.png"));
		siete.setBounds(36, 204, 260, 25);
		
		
		JButton ocho = new JButton(new ImageIcon("8.png"));
		ocho.setBounds(16, 229, 300, 25);
		
		if (matriz.t1==3){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
		}
		else if(matriz.t1==4){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
			fondo_.add(cuatro);
		}
		else if(matriz.t1==5){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
			fondo_.add(cuatro);
			fondo_.add(cinco);
		}
		else if(matriz.t1==6){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
			fondo_.add(cuatro);
			fondo_.add(cinco);
			fondo_.add(seis);
		}
		else if(matriz.t1==7){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
			fondo_.add(cuatro);
			fondo_.add(cinco);
			fondo_.add(seis);
			fondo_.add(siete);
		}
		else if(matriz.t1==8){
			fondo_.add(uno);
			fondo_.add(dos);
			fondo_.add(tres);
			fondo_.add(cuatro);
			fondo_.add(cinco);
			fondo_.add(seis);
			fondo_.add(siete);
			fondo_.add(ocho);
		}
		
		
		setTitle("juego");
		setBounds(10, 100, 1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}
