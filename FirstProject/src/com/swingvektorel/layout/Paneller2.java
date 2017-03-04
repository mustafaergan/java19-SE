package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Paneller2 extends JFrame{
	
	public Paneller2() {
		JPanel ana = new JPanel(new BorderLayout());
		JPanel sol = new JPanel(new GridLayout(3, 1));
		sol.add(new JButton("1"));
		sol.add(new JButton("2"));
		sol.add(new JButton("3"));
		JPanel merkezi = new JPanel(new FlowLayout());
		merkezi.add(new  JTextArea(10, 10));
		ana.add(sol,BorderLayout.WEST);
		ana.add(merkezi,BorderLayout.CENTER);
		add(ana);
	}

}
