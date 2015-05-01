package torreHanoi;

import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class matriz {
//	int matriz[][]=new int [3][8];
	
	//VentanaJuego ventana = new VentanaJuego();
	static int t1=8;
		String torres = JOptionPane.showInputDialog("Ingrese el numero de discos con los que desea jugar: ");
		int t= Integer.parseInt(torres);{
		t1=t;}
		
	Scanner s= new Scanner(System.in);
		
	 static Stack torre1= new Stack();{
		if(t==3){
		torre1.push(juego.tres);
		torre1.push(juego.dos);
		torre1.push(juego.uno);
		}
		else if(t==4){
			torre1.push(juego.cuatro);
			torre1.push(juego.tres);
			torre1.push(juego.dos);
			torre1.push(juego.uno);
		}
		else if(t==5){
			
			torre1.push(juego.cinco);
			torre1.push(juego.cuatro);
			torre1.push(juego.tres);
			torre1.push(juego.dos);
			torre1.push(juego.uno);
		}
		else if(t==6){
			torre1.push(juego.seis);
			torre1.push(juego.cinco);
			torre1.push(juego.cuatro);
			torre1.push(juego.tres);
			torre1.push(juego.dos);
			torre1.push(juego.uno);
					
		}
		else if(t==7){
			torre1.push(juego.siete);
			torre1.push(juego.seis);
			torre1.push(juego.cinco);
			torre1.push(juego.cuatro);
			torre1.push(juego.tres);
			torre1.push(juego.dos);
			torre1.push(juego.uno);
			}
		else if(t==8){
			torre1.push(juego.ocho);
			torre1.push(juego.siete);
			torre1.push(juego.seis);
			torre1.push(juego.cinco);
			torre1.push(juego.cuatro);
			torre1.push(juego.tres);
			torre1.push(juego.dos);
			torre1.push(juego.uno);
		}
	}
	
	


	

}
