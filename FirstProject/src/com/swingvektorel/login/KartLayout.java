package com.swingvektorel.login;

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
	
	private JTextField jTextFieldAd;
	private JTextField jTextFieldSifre;
	JButton jButton;
	
	JLabel jLabelKarsilama;
	
	public KartLayout(){
		setSize(400,400);

		setLayout(new BorderLayout());
		
		anaGovdeOlustur();
		jPanelLoginDoldur();
		loginControl();
		jPanelShowMessageDoldur();
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
		jTextFieldAd = new JTextField(20);
		jTextFieldSifre = new JTextField(20);
		jButton = new JButton("Giriþ");
		jPanelLogin.add(new JLabel("Kullanici Adi"));
		jPanelLogin.add(jTextFieldAd);
		jPanelLogin.add(new JLabel("Sifre"));
		jPanelLogin.add(jTextFieldSifre);
		jPanelLogin.add(new JLabel(""));
		jPanelLogin.add(jButton);
	
	}
	
	public void loginControl(){
	jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Kisi kisi = new Kisi();
				if(jTextFieldAd.getText().equals(kisi.getKullaniciAdi())
					&&jTextFieldSifre.getText().equals(kisi.getSifre())){
					jLabelKarsilama.setText("Hoþ geldin "+kisi.getKullaniciAdi());
				}else{
					jLabelKarsilama.setText("Yanlýþ Kullanýcý Adý Þifre");
				}
				
				cardLayout.show(jPanelAna, "message");
			}
		});
	}
	
	public void jPanelShowMessageDoldur(){
		
		jLabelKarsilama = new JLabel("Hoþ Geldin");
		
		jPanelShowMessage.add(jLabelKarsilama);
	}
	
	
}
