package com.briup.ch15.exercise1;
import java.awt.*;
import javax.swing.*;

public class AWTCombinationFrame {

	public static void main(String[] args) {
		JFrame frame=new JFrame("exercise2");
		JLabel label=new JLabel("hello");
		JPanel panel=new JPanel();
		frame.setBounds(100,100, 200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout gridLayout = new GridLayout(4,4,4,4);
		panel.setLayout(gridLayout);
		for (int i = 1; i <=9; i++) {
			JButton btn1 = new JButton(i+""); 
			panel.add(btn1);
		}
		JButton button1=new JButton("0");
		JButton button2=new JButton("*");
		JButton button3=new JButton("#");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(label,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.CENTER);
		System.out.println();
	}

}
