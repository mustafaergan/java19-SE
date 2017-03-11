package com.swingvektorel.dosyaokuyucu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JFile extends JFrame implements ActionListener {
	JPanel jPanelFileOkuyucu;
	JPanel jPanelFileYAzici;
	JFileChooser fileChooser;
	JButton jButton;
	JTextArea jTextArea;
	public JFile() {
		setLayout(new BorderLayout());
		panelOlustur();
		okuyucuDoldur();
		yaziciDoldur();
	}
	
	public void panelOlustur(){
		jPanelFileOkuyucu = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jPanelFileYAzici = new JPanel(new FlowLayout(FlowLayout.CENTER));
		add(jPanelFileOkuyucu,BorderLayout.NORTH);
		add(jPanelFileYAzici,BorderLayout.CENTER);
	}
	public void okuyucuDoldur(){
		jButton = new JButton("Git");
		jButton.addActionListener(this);
		JButton jButtonKapat = new JButton("kapat");
		jPanelFileOkuyucu.add(jButton);
		
		jButtonKapat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				Gecis gecis = new Gecis();
			}
		});
		
		jPanelFileOkuyucu.add(jButtonKapat);
	}
	public void yaziciDoldur(){
		jTextArea = new JTextArea(300,30);
		jTextArea.setAutoscrolls(true);
		jPanelFileYAzici.add(jTextArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setCurrentDirectory(new java.io.File("."));
		int sonuc =fileChooser.showOpenDialog(null) ;
		
		if(fileChooser.showOpenDialog(null) 
			== JFileChooser.APPROVE_OPTION){
			File myfile = fileChooser.getSelectedFile();
			Okuyucu okuyucu = new Okuyucu();
			String veri = okuyucu.dosyaOku(myfile);
			jTextArea.setText(veri);
		}
		
	}
	
	
	
	
}
