package com.briup.ch18;
import java.io.*;
public class FileInOutStreamTest {

	public static void main(String[] args) throws IOException {
		FileInputStream[] fis=new FileInputStream[10];
		FileOutputStream[] fos = new FileOutputStream[10];
		for(int i=0;i<10;i++){
			fis[i]=new FileInputStream("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt");
			fos[i]=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\"+i+".txt");
			byte[] buf=new byte[1024];
			int len=0;
			while ((len=fis[i].read(buf))!=-1) {
				fos[i].write(buf);	
			}try {
				fos[i].flush();	
				if(fis[i]!=null){
					fis[i].close();
				}
				if(fos[i]!=null){
					fos[i].close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
//		for(int i=0;i<10;i++){
//			if(fis[i]!=null){
//				fis[i].close();
//			}
//			if(fos[i]!=null){
//				fos[i].close();
//			}
//		}
		
		
	}

}
