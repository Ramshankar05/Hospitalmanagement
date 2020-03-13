package com.demo.vo.copy;

public class PatientMedicineVO {
	private int pm_id;
	public int getPm_id() {
		return pm_id;
	}
	public void setPm_id(int pm_id) {
		this.pm_id = pm_id;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getMedicine_id() {
		return medicine_id;
	}
	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}
	private int patient_id;
	private int medicine_id;
	@Override
	public String toString() {
		return "patient_medicineVO [pm_id=" + pm_id + ", patient_id=" + patient_id + ", medicine_id=" + medicine_id
				+ ", getPm_id()=" + getPm_id() + ", getPatient_id()=" + getPatient_id() + ", getMedicine_id()="
				+ getMedicine_id() + "]";
	}
	

}
