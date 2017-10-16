package com.sample.employee.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.employee.service.EmlpoyeeService;
import com.sample.employee.vo.Job;

@Controller
public class EmployeeController {

	@Autowired
	private EmlpoyeeService emlpoyeeService;
	/*
	public ModelAndView jobs() {
		
	}
	*/
	@RequestMapping("/list.do")
	public String jobs(Model model) {
		
		List<Job> jobs = emlpoyeeService.getAllJobs();
		
		model.addAttribute("jobs", jobs);
		
		return "joblist";
	}
}
