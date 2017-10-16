package com.sample.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.employee.dao.JobDao;
import com.sample.employee.vo.Job;

public class App {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/app-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		JobDao dao = context.getBean(JobDao.class);
		
		dao.removeJob("IT_EDU");
		
		Job job = new Job();
		job.setId("IT_EDU");
		job.setTitle("IT 교육");
		job.setMinSalary(10000);
		job.setMaxSalary(16000);
		
		//Job job = dao.getJob("AD_PRES");
		//List<Job> jobs = dao.getAllJobs();
		//for(Job j : jobs) {
		//	System.out.println(j);
		//}
	}
}
