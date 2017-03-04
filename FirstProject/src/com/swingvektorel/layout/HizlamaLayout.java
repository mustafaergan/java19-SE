package com.swingvektorel.layout;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HizlamaLayout extends JFrame{
	
	public HizlamaLayout() {
		BorderLayout borderLayout = new BorderLayout();
		
		setLayout(borderLayout);
		
		add(new JLabel("dogu"),BorderLayout.EAST);
		add(new JLabel("Kuzey"),BorderLayout.NORTH);
		add(new JLabel("Guney"),BorderLayout.SOUTH);
		add(new JLabel("bati"),BorderLayout.WEST);
		add(new JLabel("merkez"),BorderLayout.CENTER);
		
		
	}

}
