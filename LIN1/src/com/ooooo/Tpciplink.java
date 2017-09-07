package com.ooooo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class Tpciplink {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ServerSocket
		ServerSocket ss=null;
		Socket socket=null;
		BufferedWriter bw=null;
		BufferedReader br=null;
		try {
			ss=new ServerSocket(10001);
			//等待客户端发送过来的socket
			System.out.println("等待客户端发送过来");
			while(true){
			socket=ss.accept();
			System.out.println("接受到socket:"+socket);
			new MyThread(socket).start();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally{
			try {
				if(socket!=null){
					socket.close();
				}
				if(br!=null){
					br.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		}

}
class MyThread extends Thread{
	private Socket socket;
	public MyThread (Socket socket) {
		this.socket=socket;
	}
	public void run() {
		BufferedReader br=null;
		//获取输出流
		//OutputStream os=socket.getOutputStream();
		try {
			InputStream is=socket.getInputStream();
			//包装输出流
			//bw=new BufferedWriter(new OutputStreamWriter(os));
			br=new BufferedReader(new InputStreamReader(is));
			//写数据
//		bw.write("Hello World");
//		bw.flush();
			String line=br.readLine();
			System.out.println("  "+line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
