package com.sample.demo.message;

public class KakaotalkMessageServiceImpl implements MessageService{

	public void send(String to, String from, String text) {
		// TODO Auto-generated method stub
		System.out.println("카톡 발송 : ["+to+"]님이 ["+from+"]님에게 카톡을 보냈습니다.");
		System.out.println(text);
	}
}
