package br.com.gui2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Bem vindo ao Swing", 100, 80);
	}
}
