package com.ooooo;
import java.util.Date;
import java.io.*;
//import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;



public class Server {
	public static void main(String[] args) {
		Socket s = null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			s = new Socket("127.0.0.1", 10001);
			//获取输入、输出流
			//InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			//封装流
			//br=new BufferedReader(new InputStreamReader(is));
			bw=new BufferedWriter(new OutputStreamWriter(os));
			//读写数据
//			String line=br.readLine();
//			System.out.println("Client: "+line);
			Date string=new Date();
			bw.flush();
			bw.write(string.toLocaleString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//关闭资源
				try {
					if(bw!=null)
						bw.close();
					if(s!=null)
						s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}

