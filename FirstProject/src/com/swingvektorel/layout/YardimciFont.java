package com.swingvektorel.layout;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class YardimciFont extends JFrame {

	public YardimciFont() {
		
		setLayout(null);
		
		Font font = new Font("Arial", Font.ITALIC, 10);
		
		JLabel jLabel = new JLabel("Merhaba Dünya");
		
		jLabel.setSize(200,200);
		
		jLabel.setFont(font);
		
		add(jLabel);
				
	}
	
	
}
