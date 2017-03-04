package com.swingvektorel.layout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlwLayout extends JFrame{
	
	public FlwLayout() {
		
		setDefaultCloseOperation
		(JFrame.EXIT_ON_CLOSE);
		
		
		setLocationRelativeTo(null);
		
		java.awt.FlowLayout flowLayout = new 
				java.awt.FlowLayout(FlowLayout.LEFT,30,30);
		
		setLayout(flowLayout);
		
		add(new JLabel("1"));
		
		add(new JLabel("2"));
		add(new JLabel("3"));
		add(new JLabel("4"));

		
	}

}
