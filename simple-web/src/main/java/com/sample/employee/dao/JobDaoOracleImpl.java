package com.sample.employee.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.sample.employee.vo.Job;

public class JobDaoOracleImpl implements JobDao{

	private SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	@Override
	public void addJob(Job job) {
		// TODO Auto-generated method stub
		template.insert("addJob",job);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return template.queryForList("getAllJobs");
	}
}
	