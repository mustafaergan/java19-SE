package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Paneller extends JFrame {

	public Paneller() {
		
		JPanel merkezi = 
				new JPanel(new BorderLayout());
		
		JPanel jPanelButtonlar =
				new JPanel(new FlowLayout());
		
		jPanelButtonlar.add(new JButton("1"));
		jPanelButtonlar.add(new JButton("2"));
		
		merkezi.add(jPanelButtonlar,BorderLayout.NORTH);
		
		JPanel jPanelTablo = new JPanel(new GridLayout(2, 2));
		
		jPanelTablo.add(new JLabel("1"));
		jPanelTablo.add(new JTextField(15));
		jPanelTablo.add(new JLabel("2"));
		jPanelTablo.add(new JTextField(15));
		
		merkezi.add(jPanelTablo,BorderLayout.CENTER);
		
		add(merkezi);
		
	}
	
}
