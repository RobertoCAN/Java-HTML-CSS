package br.com.gui;

//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Quadro extends JFrame{

	//page 22 pdf
	
	public Quadro() {
		setTitle("Primeiro Frame!");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		///Colocando a para fechar a janela no mode de escuta. 
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing( WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}
}
