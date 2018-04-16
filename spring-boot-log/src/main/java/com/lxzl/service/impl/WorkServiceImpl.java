package com.lxzl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lxzl.bean.ProjectInfoBean;
import com.lxzl.service.ProjectService;
import com.lxzl.service.WorkService;

@Service("workService")
public class WorkServiceImpl implements WorkService {

	@Value("work.url")
	private String workUrl;
	
	@Autowired
	private ProjectService projectService;

	@Override
	public List<ProjectInfoBean> getProjects() {
		return projectService.getProjects(workUrl);
	}

	@Override
	public ProjectInfoBean getProject(String name) {
		return projectService.getProject(workUrl, name);
	}

	@Override
	public String updateProject(ProjectInfoBean projectInfoBean) {
		return projectService.updateProject(workUrl, projectInfoBean);
	}

	@Override
	public String deleteProjest(String name) {
		return projectService.deleteProjest(workUrl, name);
	}

	@Override
	public String insertProject(ProjectInfoBean projectInfoBean) {
		return projectService.insertProject(workUrl, projectInfoBean);
	}
	
	
}
