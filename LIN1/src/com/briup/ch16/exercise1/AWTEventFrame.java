package com.briup.ch16.exercise1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AWTEventFrame extends MouseAdapter{
	JFrame frame=new JFrame("exercise1");
	JButton b1=new JButton("log in");
	JButton b2=new JButton("log out");
	public AWTEventFrame(){
		frame.setBounds(200, 200, 200, 200);
		frame.setLayout(new BorderLayout());
		frame.add(b1,BorderLayout.EAST);
		frame.add(b2,BorderLayout.WEST);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("successed");
				
			}
		});
		b1.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released");
				
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed");
				
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("mouse exited");
				
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouse entered");
				
			}
			public void mouseClicked(MouseEvent e) {
				System.out.println("log in");
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("successed");
				
			}
		});
		b2.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released");
				
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed");
				
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("mouse exited");
				
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouse entered");
				
			}
			public void mouseClicked(MouseEvent e) {
				System.out.println("log out");
				
			}
		});
	}
	public static void main(String[] args) {
	 new AWTEventFrame();
	}
	
}
