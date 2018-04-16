package com.lxzl.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WorkBean {

	/**
	 * 工作名
	 */
	@XmlElement
	private String name;
	
	/**
	 * 工程列表
	 */
	@XmlElements(value={@XmlElement(name="project", type=ProjectInfoBean.class)})
	private List<ProjectInfoBean> projectList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProjectInfoBean> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<ProjectInfoBean> projectList) {
		this.projectList = projectList;
	}
}
