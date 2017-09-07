package com.briup.ch19;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Copy {

	public static void readMessage() throws IOException {

		FileReader fis = null;
		BufferedReader br = null;
		while (true) {
			System.out.println("请输入需要查找的属性名:");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			try {
				fis = new FileReader("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");
				br = new BufferedReader(fis);
				String string = "";
				while ((string = br.readLine()) != null) {
					//System.out.println(string);
					String[] strings = string.split("=");//字符串拆分返回一个数组
					if (str.equals(strings[0])) {
						System.out.println(strings[1]);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fis!=null)fis.close();
					if(br!=null)br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		readMessage();
	}
}
