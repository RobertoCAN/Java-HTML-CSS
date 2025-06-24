package br.com.gui2;

import java.awt.Container;

//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Quadro extends JFrame{

	//page 22 pdf
	
	public Quadro() {
		setTitle("Primeiro Frame!");
		setSize(300, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		///Colocando a para fechar a janela no mode de escuta. 
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing( WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
		Container container = getContentPane();
		container.add(new Painel());
	}
}
