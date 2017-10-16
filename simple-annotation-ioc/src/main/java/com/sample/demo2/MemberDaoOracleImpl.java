package com.sample.demo2;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class MemberDaoOracleImpl implements MemberDao{

	public void deleteAll() {
		// TODO Auto-generated method stub
		System.out.println("오라클 디비 다 지워");
	}
}
