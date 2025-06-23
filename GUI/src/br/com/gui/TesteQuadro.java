package br.com.gui;

import javax.swing.JFrame;

public class TesteQuadro {

	public static void main(String[] args) {
		JFrame frame = new Quadro();
//		frame.show();
//		Deprecated. As of JDK version 1.5, replaced by setVisible(boolean).
//Makes the Window visible. If the Window and/or its owner are not yet displayable, 
//both are made displayable. The Window will be validated prior to being made visible. 
//If the Window is already visible, this will bring the Window to the front.
		frame.setVisible(true);
	}

}
