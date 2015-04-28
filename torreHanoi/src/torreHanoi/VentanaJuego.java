package torreHanoi;

import java.awt.EventQueue;

import javax.swing.JFrame;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJuego extends JFrame implements ActionListener{

	JButton instrucciones,demo, punteos,iniciar;
	
	 VentanaJuego() {
		 

	 
		setTitle("Torre de Hanoi");
		setBounds(100, 100, 1000, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		instrucciones = new JButton("Ver instrucciones");
		instrucciones.setBounds(400, 104, 166, 23);
		getContentPane().add(instrucciones);
		
		demo = new JButton("Ver demo");
		demo.setBounds(400, 138, 166, 23);
		getContentPane().add(demo);
		
		punteos = new JButton("Ver punteos");
		punteos.setBounds(400, 172, 166, 23);
		getContentPane().add(punteos);
		
		iniciar = new JButton("Iniciar Juego");
		iniciar.setBounds(400, 70, 166, 23);
		getContentPane().add(iniciar);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane()}));

		instrucciones.addActionListener( this);
		demo.addActionListener( this);
		punteos.addActionListener( this);
		iniciar.addActionListener( this);
}
	 
	
	/*public void actionPerformed(ActionEvent e) {
		if(e.getSource()==demo);
		
			
		

		
	}*/
	 
	public void actionPerformed(ActionEvent arg0) {
		juego vista2=new juego();
		vista2.setVisible(true);
		dispose();
	}
}
