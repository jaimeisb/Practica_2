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
	int x2,y2;
	int x3,y3;
	int x4,y4;
	int x5,y5;
	int x6,y6;
	int x7,y7;
	int x8,y8;
	juego() {
		
		fondo fondo_ = new fondo();
		
		
		//posiciones iniciales
		if (matriz.t1==3){
			
			x1=146;y1=179; x2=126;y2=204;x3=106;y3=229;
		}
		else if(matriz.t1==4){
			
			x1=146;y1=154;x2=126;y2=179;x3=106;y3=204;x4=86;y4=229;
		}
		else if(matriz.t1==5){
		
			x1=146;y1= 129;x2=126;y2= 154;x3=106;y3=179;x4=86;y4=204;x5=66;y5=229;
		}
		else if(matriz.t1==6){
		
			x1=146; y1=104;x2=126;y2= 129;x3=106;y3= 154;x4=86;y4=179;x5=66;y5= 204;x6=45;y6=229;
		}
		else if(matriz.t1==7){
			
			x1=146;y1=79; x2=126; y2=104;x3=106;y3= 129;x4=86;y4= 154;x5=66;y5=179;x6=45;y6= 204;x7=36;y7=229;
		}
		else if(matriz.t1==8){
			
			x1=146; y1=54; x2=126;y2=79;x3=106; y3=104;x4=86;y4= 129;x5=66;y5= 154;	x6=45;y6 =179;
			x7=36;y7= 204;x8=16;y8=229;
	
		}
		
		getContentPane().add(fondo_);
		fondo_.setLayout(null);
		
		
		JButton uno = new JButton(new ImageIcon("1.png"));
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		uno.setBounds(x1, y1, 40, 25);
		fondo_.add(uno);
		
		//acciones del boton 1
		uno.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyText(e.getKeyCode()));
				String l=e.getKeyText(e.getKeyCode());
				if (l.equals("Derecha")){
					x1+=333;
					y1=y1+((matriz.t1-1)*25);
					uno.setBounds(x1, y1, 40, 25);
					matriz2.torre2.push(matriz.torre1.pop());
					System.out.println(matriz2.torre2.peek());
				}
				else if(l.equals("Izquierda")){
					x1-=333;
					uno.setBounds(x1, y1, 40, 25);}
				
					
					
			}
		});
				
		
		JButton dos = new JButton(new ImageIcon("2.png"));
		dos.setBounds( x2, y2, 80, 25);
		
		
		JButton tres = new JButton(new ImageIcon("3.png"));
		tres.setBounds(x3, y3, 120, 25);
		
		
		JButton cuatro = new JButton(new ImageIcon("4.png"));
		cuatro.setBounds(x4, y4, 160, 25);
		
		
		JButton cinco = new JButton(new ImageIcon("5.png"));
		cinco.setBounds(x5, y5, 200, 25);
		
		
		JButton seis = new JButton(new ImageIcon("6.png"));
		seis.setBounds(x6, y6, 240, 25);
		
		
		JButton siete = new JButton(new ImageIcon("7.png"));
		siete.setBounds(x7, y7, 260, 25);
		
		
		JButton ocho = new JButton(new ImageIcon("8.png"));
		ocho.setBounds(x8, y8, 300, 25);
		
		/*
		fondo_.add(uno);
		fondo_.add(dos);
		fondo_.add(tres);
		fondo_.add(cuatro);
		fondo_.add(cinco);
		fondo_.add(seis);
		fondo_.add(siete);
		fondo_.add(ocho);
		*/
		//agregar botones
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
