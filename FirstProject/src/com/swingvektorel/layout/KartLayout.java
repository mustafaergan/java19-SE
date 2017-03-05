package com.swingvektorel.layout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KartLayout extends JFrame{

	CardLayout cardLayout;
	JPanel jPanelAna;
	JPanel jPanelLogin;
	JPanel jPanelShowMessage;
	
	public KartLayout(){
		setSize(400,400);

		setLayout(new BorderLayout());
		
//		setVisible(true);
	}
	
	public void anaGovdeOlustur(){
		cardLayout = new CardLayout();
		
		jPanelAna = new JPanel(cardLayout);
		
		jPanelLogin = new JPanel(new GridLayout(3, 3));
	
		jPanelShowMessage = new JPanel(new FlowLayout());
		
		jPanelAna.add(jPanelLogin,"login");
		
		jPanelAna.add(jPanelShowMessage,"message");
		
		add(jPanelAna,BorderLayout.CENTER);

	}
	
	public void jPanelLoginDoldur(){
		JTextField jTextFieldAd = new JTextField(20);
		JTextField jTextFieldSifre = new JTextField(20);
		
		JButton jButton = new JButton("Giriþ");
		
		jPanelLogin.add(new JLabel("Kullanici Adi"));
		jPanelLogin.add(jTextFieldAd);
		jPanelLogin.add(new JLabel("Sifre"));
		jPanelLogin.add(jTextFieldSifre);
		jPanelLogin.add(new JLabel(""));
		jPanelLogin.add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelAna, "message");
			}
		});
		
	}
	
	public void jPanelShowMessageDoldur(){
		
		JLabel jLabelKarsilama = new JLabel("Hoþ Geldin");
		
		jPanelShowMessage.add(jLabelKarsilama);
	}
	
	
}
