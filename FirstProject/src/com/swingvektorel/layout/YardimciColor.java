package com.swingvektorel.layout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class YardimciColor extends JFrame{
	
	public YardimciColor() {
		Color color = new Color(0,0,100);
		
		JButton benimDugmem = new JButton("Bas");
		
		benimDugmem.setBackground(color);
		
		add(benimDugmem);
	}

}
