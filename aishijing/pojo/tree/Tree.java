package com.chuange.aishijing.pojo.tree;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author yuany
 * 树结构
 */
@Entity
@Table(name="ASJ_TREE")
public class Tree {
	@Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
	private String resourceID;
	private String accessPath;
	private String checked;
	private String delFlag;
	private String parentID;
	private String resourceCode;
	private String resourceDesc;
	private String resourceGrade;
	private String resourceName;
	private String resourceOrder;
	private String resourceType;
	public String getAccessPath() {
		return accessPath;
	}
	public void setAccessPath(String accessPath) {
		this.accessPath = accessPath;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getResourceCode() {
		return resourceCode;
	}
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	public String getResourceDesc() {
		return resourceDesc;
	}
	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}
	public String getResourceGrade() {
		return resourceGrade;
	}
	public void setResourceGrade(String resourceGrade) {
		this.resourceGrade = resourceGrade;
	}
	public String getResourceID() {
		return resourceID;
	}
	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceOrder() {
		return resourceOrder;
	}
	public void setResourceOrder(String resourceOrder) {
		this.resourceOrder = resourceOrder;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public Tree(String accessPath, String checked, String delFlag, String parentID, String resourceCode,
			String resourceDesc, String resourceGrade, String resourceID, String resourceName, String resourceOrder,
			String resourceType) {
		super();
		this.accessPath = accessPath;
		this.checked = checked;
		this.delFlag = delFlag;
		this.parentID = parentID;
		this.resourceCode = resourceCode;
		this.resourceDesc = resourceDesc;
		this.resourceGrade = resourceGrade;
		this.resourceID = resourceID;
		this.resourceName = resourceName;
		this.resourceOrder = resourceOrder;
		this.resourceType = resourceType;
	}
	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
