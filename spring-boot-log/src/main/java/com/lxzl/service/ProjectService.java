package com.lxzl.service;

import java.util.List;

import com.lxzl.bean.ProjectInfoBean;

public interface ProjectService {

	List<ProjectInfoBean> getProjects(String workUrl);
	
	ProjectInfoBean getProject(String workUrl, String name);
	
	String updateProject(String workUrl, ProjectInfoBean projectInfoBean);
	
	String deleteProjest(String workUrl, String name);
	
	String insertProject(String workUrl, ProjectInfoBean projectInfoBean);
}
