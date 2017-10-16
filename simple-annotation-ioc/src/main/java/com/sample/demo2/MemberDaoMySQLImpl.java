package com.sample.demo2;

import org.springframework.stereotype.Repository;

@Repository("mysql")
public class MemberDaoMySQLImpl implements MemberDao{

	public void deleteAll() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 디비 다 지워");
	}
}
