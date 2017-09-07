package com.briup.ch03;
import java.awt.*;
import javax.swing.*;

public class Txest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FNNDP");
		frame.setLocation(100, 500);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gridLayout = new GridLayout(1,3);
		GridLayout gridLayout2 = new GridLayout(3, 3);
		TextField tf = new TextField(40);
		p1.add(tf);

		JButton b1 = new JButton("Backspace");
		JButton b2 = new JButton("CE");
		JButton b3 = new JButton("C");
		b1.setForeground(Color.red);
		b1.setBackground(Color.blue);
		b2.setForeground(Color.red);
		b2.setBackground(Color.blue);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.setLayout(gridLayout);
		for (int i = 1; i <10; i++) {
			JButton btn1 = new JButton(i + ""); 
			p3.add(btn1);
		}
		p3.setLayout(gridLayout2);
		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.add(p3, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
