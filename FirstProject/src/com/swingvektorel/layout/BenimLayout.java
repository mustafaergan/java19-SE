package com.swingvektorel.layout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BenimLayout extends JFrame {

	public BenimLayout() {
		
		setLayout(null);

		JLabel jLabel1 = new JLabel("1");
		JLabel jLabel2 = new JLabel("2");
		JLabel jLabel3 = new JLabel("3");
		JLabel jLabel4 = new JLabel("4");

		jLabel1.setLocation(0, 0);
		jLabel1.setSize(25,25);
		
		jLabel2.setLocation(50, 50);
		jLabel2.setSize(25,25);
		
		jLabel3.setLocation(100, 100);
		jLabel3.setSize(25,25);
		
		jLabel4.setLocation(150, 150);
		jLabel4.setSize(25,25);
		
		
		add(jLabel1);
		add(jLabel2);
		add(jLabel3);
		add(jLabel4);

	}
	
}
