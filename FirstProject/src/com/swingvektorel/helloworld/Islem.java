package com.swingvektorel.helloworld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Islem {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("pencerem");
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jFrame.setSize(200, 200);
		
		JLabel jLabel = new JLabel("Hello World");
		
		JButton button = new JButton("Týkla");
		
		button.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("týklandý");
			}
		});
		
		jFrame.add(button);
		
		jFrame.add(new JButton("dene"));

		
		jFrame.setLocationRelativeTo(null);
		
		jFrame.setVisible(true);
		
	}

}
