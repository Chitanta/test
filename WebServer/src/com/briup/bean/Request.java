package com.briup.bean;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Request {
	private Socket socket;
	private OutputStream os;
	private String s1;
	private FileInputStream fis;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	Response rs=new Response();
	public void getURL() {

		try {
			os = socket.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out
					.println("************************************************");
			s1 = br.readLine();
			System.out.println(s1);
			String[] s2 = s1.split(" ");
			System.out.println(s2[0] + " " + s2[1]);
			//File file = new File("." + s2[1]);
			if (s2[0].equals("GET")) {
				rs.Strat();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
