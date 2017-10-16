package com.sample.demo.order;

import com.sample.demo.notice.NoticeService;

public class OrderService {

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	public void sendOrderState() {
	
		noticeService.notice("결재완료", "결재가 확인되어 고오급레스토랑 상품권 2장이 발송되었습니다.");
	}
}
