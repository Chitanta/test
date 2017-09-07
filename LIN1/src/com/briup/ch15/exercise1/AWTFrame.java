package com.briup.ch15.exercise1;
import java.awt.*;

import javax.swing.*;

public class AWTFrame {

	public static void main(String[] args) {
		JLabel lab=new JLabel("nihao");
		JPanel pa = new JPanel();
		JButton Btn1;
		JButton Btn2;
		JFrame frame =new JFrame("AWTFrame");
		frame.setBounds(100,100, 200, 200);
//		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(lab,BorderLayout.NORTH);
		pa.setLayout(new FlowLayout());
		Btn1=new JButton("left");
		Btn1.setForeground(Color.orange);
		Btn1.setBackground(Color.blue);
		pa.add(Btn1);
		Btn2=new JButton("right");
		Btn2.setForeground(Color.orange);
		Btn2.setBackground(Color.blue);
		pa.add(Btn2);
		frame.add(pa,BorderLayout.SOUTH);
		System.out.println();
	}

}
