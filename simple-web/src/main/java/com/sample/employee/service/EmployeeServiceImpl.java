package com.sample.employee.service;

import java.util.List;

import com.sample.employee.dao.JobDao;
import com.sample.employee.vo.Job;

public class EmployeeServiceImpl implements EmlpoyeeService{

	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	@Override
	public void addNewJob(Job job) {
		// TODO Auto-generated method stub
		/*
		if(jobDao.getJob(job.getId())!=null) {
			throw new HRException("이미 등록된 job입니다");
		}
		*/
		jobDao.addJob(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		return jobDao.getAllJobs();
	}
}
