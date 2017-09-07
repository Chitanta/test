package com.briup.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ServerImp implements IServer {

	ServerSocket ss = null;
	Socket s = null;
	OutputStream os = null;
	BufferedWriter bw = null;

	@Override
	public void init() {
		try {
			// 创建服务器端
			ss = new ServerSocket(5461);
			System.out.println("等待接收:");
			// 等待客户端发送链接
			while (true) {
				s = ss.accept();
				new MyThread(s).start();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (ss != null) {
				try {
					ss.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}

	@Override
	public void receive() {

	}

	public static void main(String[] args) {
		ServerImp si = new ServerImp();
		si.init();
	}

}

class MyThread extends Thread {
	private Socket s;
	OutputStream os = null;
	BufferedWriter bw = null;
	FileInputStream fis = null;
	BufferedOutputStream bos = null;
	String str = null;
	BufferedInputStream bis = null;

	

	public MyThread(Socket s) {
		this.s = s;
	}

	public void run() {
		System.out.println(getName() + "接收到了");

		try {
			os = s.getOutputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));

			System.out.println("*********************************************");
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			
			
			str = br.readLine();
			//System.out.println(str);
			String[] string = str.split(" ");
			System.out.println(string[0] + " " + string[1]);
			File file = new File("."+string[1]);
			
//			System.out.println(file.exists());

			 if (file.exists()) {
				 fis = new FileInputStream(file);
				 bis = new BufferedInputStream(fis);
				 // 封装输入、输出流
				 bos = new BufferedOutputStream(os);
				 // 读写数据
				 byte[] buf1 = new byte[1024];
				 while ((bis.read(buf1)) != -1) {
//					 System.out.println(new String(buf1));
					 bos.write(buf1);
					 bos.flush();
				 }
				 
				 char[] s1 = new char[1024];
					br.read(s1);
					System.out.println(s1);
					List<String> list = new ArrayList<String>();
					String[] st = String.valueOf(s1).split("\r\n");
					for (String sst : st) {
						list.add(sst);
					}
					String s8=(list.get(0));
					System.out.println(s8);
					String s4 = (list.get(list.size() - 1)).trim();
					System.out.println(s4);
					// String[] s5=new String[2];
					String[] s5 = s4.split("&");

					String[] s9=s8.split(" ");
					String[] s6 = s5[0].split("=");
					String[] s7 = s5[1].split("=");
					if (s6.length < 2 || s7.length < 2) {
						bw=new BufferedWriter(new OutputStreamWriter(os));
						bw.write("用户名或密码错误");
						bw.flush();
					} else {
						
						if (s6[1].equals("ljq") && s7[1].equals("123")) {
							System.out.println("登陆成功！");
							bw=new BufferedWriter(new OutputStreamWriter(os));
							bw.write("ljq");
							bw.flush();
						} else {
							fis = new FileInputStream("Error.html");
							bis = new BufferedInputStream(fis);
							bos = new BufferedOutputStream(os);
							byte[] buf = new byte[1024];
							while ((bis.read(buf) != -1)) {
								bos.write(buf);
								bos.flush();
							}
						}
					}
			
			 } 
			 else {
				 bw = new BufferedWriter(new OutputStreamWriter(os));
				 bw.write("没有找到文件");
				 bw.flush();
			 }
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (s != null) {
					s.close();
				}
				if (fis != null)
					fis.close();
				if (bos != null)
					bos.close();
				if (bis != null) {
					bis.close();
				}
				// if(isr!=null)isr.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

