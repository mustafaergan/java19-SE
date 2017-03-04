package com.swingvektorel.layout;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TabloLayout extends JFrame {

	
	public TabloLayout() {
		GridLayout gridLayout = 
				new GridLayout(2, 2, 30, 30);
		
		setLayout(gridLayout);
		
		add(new JLabel("adi"));
		add(new JTextField(15));
		
		add(new JLabel("soyadi"));
		add(new JTextField(15));
		
	}
	
}
