package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KartLayout extends JFrame{

	public KartLayout(){
		setSize(400,400);

		setLayout(new BorderLayout());
		
		CardLayout cardLayout = new CardLayout();
		
		JPanel jPanelAna = new JPanel(cardLayout);
		
		JPanel jPanelLogin = new JPanel(new GridLayout(3, 3));
	
		JPanel jPanelShowMessage = new JPanel(new FlowLayout());
		
		jPanelAna.add(jPanelLogin,"login");
		
		jPanelAna.add(jPanelShowMessage,"message");
		
		JTextField jTextFieldAd = new JTextField(20);
		JTextField jTextFieldSifre = new JTextField(20);
		
		JButton jButton = new JButton("Giriþ");
		
		jPanelLogin.add(new JLabel("Kullanici Adi"));
		jPanelLogin.add(jTextFieldAd);
		jPanelLogin.add(new JLabel("Sifre"));
		jPanelLogin.add(jTextFieldSifre);
		jPanelLogin.add(new JLabel(""));
		jPanelLogin.add(jButton);
		
		JLabel jLabelKarsilama = new JLabel("Hoþ Geldin");
		
		jPanelShowMessage.add(jLabelKarsilama);
		
		setVisible(true);
	}
	
	
}
