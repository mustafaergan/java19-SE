package com.swingvektorel.action2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyAction extends JFrame implements ActionListener{

	JButton jbutton;
	JTextField jTextField;
	JTextArea jTextArea;
	String myText = "";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		myText += jTextField.getText()+"\n";
		jTextArea.setText(myText);
	}
	
	public MyAction() {
		setSize(400,400);
		setLayout(new FlowLayout());
		jbutton = new JButton("Gonder");
		jTextField = new JTextField(20);
		jTextArea = new JTextArea(10, 10);
		add(jbutton);
		add(jTextField);
		add(jTextArea);
		jbutton.addActionListener(this);
		
		jbutton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				myText += jTextField.getText()+"\n";
				jTextArea.setText(myText);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("keyReleased");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed");
			}
		});
		
		
		setVisible(true);
	}

}
