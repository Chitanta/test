package com.briup.pattern.create.FactoryMethod.MoreFactory;

//发送短信的实现类 要生产的产品
public class SmsSender implements Sender {  
    public void Send() {  
        System.out.println("发送短信!");  
    }  
} 
