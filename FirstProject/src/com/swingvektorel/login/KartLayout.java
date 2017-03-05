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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class KartLayout extends JFrame {

	CardLayout cardLayout;
	JPanel jPanelAna;
	JPanel jPanel404;
	JPanel jPanelLogin;
	JPanel jPanelShowMessage;

	private JTextField jTextFieldAd;
	private JTextField jTextFieldSifre;
	JButton jButton;

	JLabel jLabelKarsilama;
	
	JLabel jLabelSayac;
	
	int sayac = 5;
	Timer timer;

	public KartLayout() {
		setSize(400, 400);

		setLayout(new BorderLayout());

		anaGovdeOlustur();
		jPanelLoginDoldur();
		loginControl();
		jPanel404Doldur();
		jPanelShowMessageDoldur();
	}

	public void anaGovdeOlustur() {
		cardLayout = new CardLayout();

		jPanelAna = new JPanel(cardLayout);

		jPanelLogin = new JPanel(new GridLayout(3, 3));

		jPanelShowMessage = new JPanel(new FlowLayout());

		jPanel404 = new JPanel(new FlowLayout());

		jPanelAna.add(jPanelLogin, "login");

		jPanelAna.add(jPanelShowMessage, "message");

		jPanelAna.add(jPanel404, "404");

		add(jPanelAna, BorderLayout.CENTER);

	}

	public void jPanel404Doldur() {
		JButton jButton = new JButton("Geri");
		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(jPanelAna, "login");
			}
		});
		JLabel jLabel = new JLabel("Kullanýcý Adý Þifre Yanlýþ");
		
		jLabelSayac = new JLabel("");

		jPanel404.add(jLabel);
		jPanel404.add(jButton);
		jPanel404.add(jLabelSayac);

	}

	public void jPanelLoginDoldur() {
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

	public void loginControl() {
		
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (sayac == 0) {
					timer.stop();
					cardLayout.show(jPanelAna, "login");
				} else {
					sayac--;
					
					jLabelSayac.setText("Saniye"+sayac);
				}
			}
		};

		ActionListener ac = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("girdi");
				Kisi kisi = new Kisi();
				if (jTextFieldAd.getText().equals(kisi.getKullaniciAdi())
						&& jTextFieldSifre.getText().equals(kisi.getSifre())) {
					jLabelKarsilama.setText("Hoþ geldin " + kisi.getKullaniciAdi());
					cardLayout.show(jPanelAna, "message");
				} else {
					JOptionPane.showMessageDialog(jTextFieldSifre, "My Goodness");
					cardLayout.show(jPanelAna, "404");
					sayac = 5;
					timer = new Timer(500, action);
					timer.start();
				}
			}
		};

		jButton.addActionListener(ac);
	}

	public void jPanelShowMessageDoldur() {
		jLabelKarsilama = new JLabel("Hoþ Geldin");
		jPanelShowMessage.add(jLabelKarsilama);
	}

}
