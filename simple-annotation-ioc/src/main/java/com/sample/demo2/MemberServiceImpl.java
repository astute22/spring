package com.sample.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl {

	//@Autowired
	@Resource(name="mysql")
	private MemberDao memberDao;
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("객체 생성 직후 실행");
	}
	
	@PreDestroy
	public void destroyer() {
		System.out.println("객체 파괴 전 실행");
	}
	
	public void removeAllMembers() {
		memberDao.deleteAll();
	}
}
