package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KartLayout2 extends JFrame{

	public KartLayout2(){
		setSize(400,400);

		setLayout(new BorderLayout());
		
		CardLayout cardLayout = new CardLayout();
		
		JPanel jPanelButton = new JPanel(new FlowLayout());
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		
		jPanelButton.add(button1);
		jPanelButton.add(button2);
		
		JPanel jPanelGoster = new JPanel(cardLayout);
		
		jPanelGoster.add(new JLabel("1 Label"),"label1");
		jPanelGoster.add(new JLabel("2 Label"),"label2");
		
		add(jPanelButton,BorderLayout.NORTH);
		add(jPanelGoster,BorderLayout.CENTER);
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelGoster, "label1");
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelGoster, "label2");
			}
		});
		
		
		
		setVisible(true);
	}
	
	
}
