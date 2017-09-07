package com.briup.test;

import java.awt.*;
import java.awt.datatransfer.FlavorEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test {

	public static void main(String[] args) {
		JTextField firstText;
		JButton btn;
		JLabel lab;
		JTextField resTxt;
		JFrame frame = new JFrame("测试事件");
		frame.setTitle("sfds");
		frame.setBounds(1000, 100, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Button btn = new Button("Fuck you");
//		btn.addActionListener(new TestListener());
//
//		frame.add(btn);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		firstText=new JTextField();
		lab=new JLabel("+");
		btn=new JButton("=");
		resTxt=new JTextField();
		frame.add(firstText);
		frame.add(lab);
		frame.add(resTxt);
		frame.add(btn);
		System.out.println();
	}
}

//class TestListener implements ActionListener {
//
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("dian ni ma ge b！！");
//	}
//
//}
