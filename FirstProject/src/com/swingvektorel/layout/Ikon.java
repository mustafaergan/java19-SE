package com.swingvektorel.layout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.html.ImageView;

public class Ikon extends JFrame {

	public Ikon() {
		
		ImageIcon icon = 
				new ImageIcon
				(getClass().getResource("/1.jpg"));
		
		add(new JButton(icon));
		
	}
	
}
