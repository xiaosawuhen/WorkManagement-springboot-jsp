package com.lxzl.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lxzl.bean.ProjectInfoBean;

@Controller
@RequestMapping("/")
public class HomePageController {

	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		
		List<ProjectInfoBean> projects = new ArrayList<>();
		
		mv.addObject("projects", projects);
		
		mv.setViewName("index");
		
		return mv;
	}
}
