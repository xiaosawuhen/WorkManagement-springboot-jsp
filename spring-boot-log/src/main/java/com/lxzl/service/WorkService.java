package com.lxzl.service;

import java.util.List;

import com.lxzl.bean.ProjectInfoBean;

public interface WorkService {

	List<ProjectInfoBean> getProjects();
	
	ProjectInfoBean getProject(String name);
	
	String updateProject(ProjectInfoBean projectInfoBean);
	
	String deleteProjest(String name);
	
	String insertProject(ProjectInfoBean projectInfoBean);
}
