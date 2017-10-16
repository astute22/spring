package com.sample.demo.event;

import com.sample.demo.notice.NoticeService;

public class EventService {

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	public void newEventNotice() {
	
		String title = "추석쿠폰이 발송되었습니다";
		String contents = "♚♚히어로즈 오브 더 스☆톰♚♚가입시$$전원 카드팩☜☜뒷면100%증정※ ♜월드오브 워크래프트♜펫 무료증정￥ 특정조건 §§디아블로3§§★공허의유산★초상화♜오버워치♜겐지스킨￥획득기회@@@ 즉시이동http://kr.battle.net/heroes/ko/";
		noticeService.notice(title, contents);
	}
}
