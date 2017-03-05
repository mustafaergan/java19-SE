package com.swingvektorel.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionSwing extends JFrame implements ActionListener{

	int a;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bu = (JButton) e.getSource();
		System.out.println(bu.getText());
		System.out.println("Merhaba Dünya");
	}
	public ActionSwing() {
		
		JButton button = new JButton("git");
	
//		MyAction myAction = new MyAction();
//		MyAction2 myAction2 = new MyAction2();

		button.addActionListener(this);
		
		add(button);
		
		setSize(400,400);
		
		setVisible(true);
		
	}


}
