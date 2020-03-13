package com.demo.response;

import java.util.List;

import com.demo.vo.PatientMedicineVO;

public class PatientMedicineResponseObject {
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
	public List<PatientMedicineVO> getPatient_medicineList() {
		return patient_medicineList;
	}
	public void setPatient_medicineList(List<PatientMedicineVO> patient_medicineList) {
		this.patient_medicineList = patient_medicineList;
	}
	public PatientMedicineVO getPatient_medicineVO() {
		return Patient_medicineVO;
	}
	public void setPatient_medicineVO(PatientMedicineVO patient_medicineVO) {
		Patient_medicineVO = patient_medicineVO;
	}
	String failureMessage;
	List<PatientMedicineVO> patient_medicineList;
	PatientMedicineVO Patient_medicineVO;

}
