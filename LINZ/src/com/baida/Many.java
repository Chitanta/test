package com.baida;

public class Many {

	public static void main(String[] args) {
		String s = "afsdgdfhsdhfghdfgaregsudrhbvbxrgagbfdherwgbfdsfgsdhdfy";
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				num++;
			}
		}
		System.out.println("一共有" + num + "个a！");
	}

}
