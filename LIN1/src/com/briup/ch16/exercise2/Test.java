package com.briup.ch16.exercise2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Test extends JFrame {
	JButton buttons[];
	JLabel statusLabel;
	Container contentPane;

	public Test(String title) {
		contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		contentPane.setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 3, 5, 5));
		buttons = new JButton[12];

		for (int i = 0; i < 9; i += 1) {

			buttons[i] = new JButton(Integer.toString(i + 1));

			centerPanel.add(buttons[i]);

		}
		buttons[9] = new JButton("*");
		buttons[10] = new JButton("0");
		buttons[11] = new JButton("#");
		centerPanel.add(buttons[9]);
		centerPanel.add(buttons[10]);
		centerPanel.add(buttons[11]);
		
		for (int j = 0; j < buttons.length; j++) {
			final JButton button = buttons[j];
			buttons[j].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String string = statusLabel.getText();
					//转换成字符数组<10直接赋值给statusLable
					if (string.toCharArray().length < 10) {
						statusLabel.setText(string + button.getText());
					} else {
						//int a = string.toCharArray().length;
						//System.out.println(a);
						char[] arrs = string.toCharArray();
						//转换成字符装进集合
						List<Character> list = new ArrayList<Character>();
						for (Character arr : arrs) {
							list.add(arr);
						}
						//System.out.println(list.get(0));
						list.remove(0);//每次触发移除第一个字符
						String string2 = "";
						//遍历集合并加上添加的
						for (Character arr1 : list) {
							string2 = string2 + arr1;
						}
						statusLabel.setText(string2 + button.getText());
						//System.out.println("溢出后" + a);

					}

				}
			});
		}
		contentPane.add(centerPanel, BorderLayout.CENTER);
		statusLabel = new JLabel("");
		contentPane.add(statusLabel, BorderLayout.NORTH);
		setSize(150, 230);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test("AWT Combo Demo");
	}
}