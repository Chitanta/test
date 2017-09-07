package com.briup.ch16.exercise2;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;

public class AWTCombinationFrame extends MouseAdapter {
	JFrame frame = new JFrame("exercise2");
	JButton buttons[];
	JLabel statusLabel;
	JTextField textField = new JTextField();
	Container contentPane;

	public AWTCombinationFrame() {
		contentPane = frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 3, 5, 5));
		buttons = new JButton[12];
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton(Integer.toString(i + 1));
			centerPanel.add(buttons[i]);

		}
		buttons[9] = new JButton("*");
		buttons[10] = new JButton("0");
		buttons[11] = new JButton("#");
		centerPanel.add(buttons[9]);
		centerPanel.add(buttons[10]);
		centerPanel.add(buttons[11]);
		for (int i = 0; i <12; i++) {
			final int j=i;
				buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String string = textField.getText();
					if(string.toCharArray().length<10){
					textField.setText(string + buttons[j].getText());
					}
					else{
						char[] arrs=string.toCharArray();
						List<Character> list=new ArrayList<Character>();
						for(Character arr:arrs){
							list.add(arr);
						}
							list.remove(0);
							String string2="";
							for(Character arr1:list){
								string2=string2+arr1;
							}
							textField.setText(string2+buttons[j].getText());
						}
				
					
				}
			});
		}
		contentPane.add(centerPanel, BorderLayout.CENTER);
		statusLabel = new JLabel("");
		contentPane.add(statusLabel, BorderLayout.NORTH);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.add(textField, BorderLayout.NORTH);

	}

	public static void main(String[] args) {
		new AWTCombinationFrame();
	}
}
