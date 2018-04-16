package com.lxzl.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author nannan.c.wang
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProjectInfoBean {

	/**
	 * 项目名称
	 */
	@XmlElement
	private String name;
	
	/**
	 * 项目类型
	 */
	@XmlElement
	private String type;
	
	/**
	 * 文档
	 */
	@XmlElement
	private DocInfoBean docInfo;
	
	/**
	 * 工作区间
	 */
	@XmlElement
	private WorkspaceInfoBean workspaceInfo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DocInfoBean getDocInfo() {
		return docInfo;
	}

	public void setDocInfo(DocInfoBean docInfo) {
		this.docInfo = docInfo;
	}

	public WorkspaceInfoBean getWorkspaceInfo() {
		return workspaceInfo;
	}

	public void setWorkspaceInfo(WorkspaceInfoBean workspaceInfo) {
		this.workspaceInfo = workspaceInfo;
	}
}
