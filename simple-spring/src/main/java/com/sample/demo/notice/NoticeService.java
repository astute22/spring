package com.sample.demo.notice;

import com.sample.demo.message.MessageService;

public class NoticeService {
	
	private MessageService messageService;
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	public void notice(String title, String contents) {
	
		messageService.send("관리자", "이영호", "제목 : "+title+ "\n내용 : " + contents);
		messageService.send("관리자", "이제동", "제목 : "+title+ "\n내용 : " + contents);
		messageService.send("관리자", "송병구", "제목 : "+title+ "\n내용 : " + contents);
		messageService.send("관리자", "김택용", "제목 : "+title+ "\n내용 : " + contents);
	}
}
