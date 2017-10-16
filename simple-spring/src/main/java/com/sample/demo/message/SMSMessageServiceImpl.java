package com.sample.demo.message;

public class SMSMessageServiceImpl implements MessageService{
	
	public void send(String to, String from, String text) {
		// TODO Auto-generated method stub
		System.out.println("문자 발송 : ["+to+"]님이 ["+from+"]님에게 문자를 보냈습니다.");
		System.out.println(text);
	}
}
