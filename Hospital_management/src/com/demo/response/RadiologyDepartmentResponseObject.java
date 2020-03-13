package com.demo.response;

import java.util.List;

import com.demo.vo.RadiologyDepartmentVO;

public class RadiologyDepartmentResponseObject {
	String successMessage;
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public String getFailureMessage() {
		return failureMessage;
	}
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
	public List<RadiologyDepartmentVO> getRadiology_departmentList() {
		return Radiology_departmentList;
	}
	public void setRadiology_departmentList(List<RadiologyDepartmentVO> radiology_departmentList) {
		Radiology_departmentList = radiology_departmentList;
	}
	public RadiologyDepartmentVO getRadiology_departmentVO() {
		return Radiology_departmentVO;
	}
	public void setRadiology_departmentVO(RadiologyDepartmentVO radiology_departmentVO) {
		Radiology_departmentVO = radiology_departmentVO;
	}
	String failureMessage;
	List<RadiologyDepartmentVO> Radiology_departmentList;
	RadiologyDepartmentVO Radiology_departmentVO;
}
