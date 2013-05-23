package com.warn.calender;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarPanel extends JPanel {
	Toolkit tool = getToolkit();

	//Image bj =  new ImageIcon(getClass().getClassLoader().getResource("ChatFormBG.jpg")).getImage();

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawImage(bj, 0, 0, this);
	}
	
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setLayout(null);
		CalendarFrame panel = new CalendarFrame();
		//panel.add(new JLabel("test"));
		//frame.pack();
		//panel.setSize(350,200);
		frame.setSize(550,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}

}
