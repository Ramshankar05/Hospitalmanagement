package com.demo.bo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.demo.dao.PatientmedicineDAO;
import com.demo.dao.RadiologyDepartmentDAO;
import com.demo.exception.PatientMedicineManagementException;
import com.demo.exception.PatientMedicineNotFoundException;
import com.demo.exception.RadiologyDepartmentManagementException;
import com.demo.exception.ScanNotFoundException;
import com.demo.vo.PatientMedicineVO;
import com.demo.vo.RadiologyDepartmentVO;

//import com.demo.dao.MaintenanceInfoDAO;
//import com.demo.dao.StaffTimingsDAO;
//import com.demo.exception.MaintenanceInfoManagementException;
//import com.demo.exception.MaintenanceInfoNotFoundException;
//import com.demo.exception.StaffTimingsManagementException;
//import com.demo.exception.StaffTimingsNotFoundException;
//import com.demo.vo.MaintenanceInfoVO;
//import com.demo.vo.StaffTimingsVO;

public class HospitalManagementBO1 {

	/*MaintenanceInfoDAO dao1 = new MaintenanceInfoDAO();

	public boolean addmaintenance_details(MaintenanceInfoVO vo) throws MaintenanceInfoManagementException {
		boolean flag;
		flag = dao1.addmaintenance_details(vo);
		return flag;
	}

	public MaintenanceInfoVO fetchMaintenanceById(int maintenance_id) throws MaintenanceInfoNotFoundException {

		try {
			MaintenanceInfoVO vo = new MaintenanceInfoVO();
			vo = dao1.fetchMaintenanceById(maintenance_id);
			return vo;
		} catch (MaintenanceInfoNotFoundException e) {
			throw new MaintenanceInfoNotFoundException("Error while fetching " + e.getMessage());
		}
	}

	public Map<String, MaintenanceInfoVO> fetchstaffBymaintenance_details(String maintenance_details)
			throws MaintenanceInfoNotFoundException {
		try {
			Map<String, MaintenanceInfoVO> map = new HashMap<String, MaintenanceInfoVO>();
			map = dao1.fetchbymaintenance_details(maintenance_details);
			return map;
		} catch (MaintenanceInfoNotFoundException e) {

			throw new MaintenanceInfoNotFoundException("Error while fetching " + e.getMessage());

		}
	}

	public boolean updatemaintenance_details(MaintenanceInfoVO vo) throws MaintenanceInfoManagementException {
		boolean flag;
		flag = dao1.updatemaintenance_details(vo);
		return flag;

	}
*/
	
	
	PatientmedicineDAO dao2=new PatientmedicineDAO(); 
	public boolean addPatientMedicineDetails(PatientMedicineVO vo)throws PatientMedicineManagementException 
	{
		try{
			boolean flag;
			flag=dao2.addPatientMedicineDetails(vo);
			return flag;
		}catch (PatientMedicineManagementException e) {
			throw new PatientMedicineManagementException("Error when Adding Patient medicine details"+e.getMessage());
		}
	}
	public Map<Integer,PatientMedicineVO> fetchbybillid(int bill_id)throws PatientMedicineNotFoundException 
	{
		try{
			Map<Integer,PatientMedicineVO> map= new HashMap<Integer,PatientMedicineVO>();
			map=dao2.fetchbybillid(bill_id);
			return map;
			}catch (PatientMedicineNotFoundException e) {
				throw new PatientMedicineNotFoundException("Error when fetching"+e.getMessage());
			}
	}
	public Map<Integer,PatientMedicineVO> fetchbyMedicineid(int medicine_id)throws PatientMedicineNotFoundException 
	{
		try{Map<Integer,PatientMedicineVO> map= new HashMap<Integer,PatientMedicineVO>();
		map=dao2.fetchbyMedicineid(medicine_id);
		return map;

	}catch(PatientMedicineNotFoundException e) {
		throw new PatientMedicineNotFoundException("Error when fetching"+e.getMessage());
	}
	}
	public boolean updatePatientMedicineDetails(PatientMedicineVO vo)throws  PatientMedicineManagementException 
	{
		try{
			boolean flag;
			flag=dao2.updatePatientMedicineDetails(vo);
			return flag;
		}catch (PatientMedicineManagementException e) {
			throw new PatientMedicineManagementException("Error when Adding Patient medicine details"+e.getMessage());
		}
	}





	  
	  
	  RadiologyDepartmentDAO dao3=new RadiologyDepartmentDAO(); 
	  public boolean addscan_details(RadiologyDepartmentVO vo) throws RadiologyDepartmentManagementException
	  {
	  
	  boolean flag; 
	  flag=dao3.addscan_details(vo);
	  return flag; } 
	  public RadiologyDepartmentVO fetchscanDetailsById(int scan_id) throws ScanNotFoundException 
	  { RadiologyDepartmentVO vo=new RadiologyDepartmentVO();
	  vo=dao3.fetchscan_details(scan_id);
	  return vo; 
	  } 
	  public Map<Integer, RadiologyDepartmentVO> fetchscanDetails(String scan_details) throws ScanNotFoundException 
	  {
	  Map<Integer,RadiologyDepartmentVO> map=new HashMap<Integer,RadiologyDepartmentVO>();
	  map=dao3.fetchscan_details(scan_details); 
	  return map;
	  } 
	  public boolean updatescan_details(RadiologyDepartmentVO vo) throws RadiologyDepartmentManagementException 
	  { boolean flag;
	  flag=dao3.updatescan_details(vo); 
	  return flag;
	  }
	 

	/*
	 * StaffInfoDAO dao4 = new StaffInfoDAO();
	 * 
	 * public boolean addStaff(StaffInfoVO vo) throws StaffManagementException {
	 * boolean flag; flag = dao4.addStaff(vo); return flag;
	 * 
	 * } public StaffInfoVO fetchStaffById(int staff_id) throws
	 * StaffNotFoundException { try { StaffInfoVO vo = new StaffInfoVO(); vo =
	 * dao4.fetchStaffById(staff_id); return vo; } catch (StaffNotFoundException
	 * e) { throw new StaffNotFoundException("Error while fetching " +
	 * e.getMessage()); } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public Map<String, StaffInfoVO> fetchstaffByDesignation(String
	 * Designation) throws StaffNotFoundException { try{ Map<String,
	 * StaffInfoVO> map = new HashMap<String, StaffInfoVO>(); map =
	 * dao4.fetchstaffByDesignation(Designation); return map; }
	 * catch(StaffNotFoundException e) { throw new StaffNotFoundException(
	 * "Error while fetching " + e.getMessage()); }
	 * 
	 * 
	 * }
	 * 
	 * public boolean updateStaffDetails(StaffInfoVO vo )throws
	 * StaffManagementException { boolean flag; flag =
	 * dao4.updateStaffDetails(vo); return flag; }
	 * 
	 * 
	 */

	/*StaffTimingsDAO dao = new StaffTimingsDAO();

	public boolean addStaffdetails(StaffTimingsVO vo) throws StaffTimingsManagementException {
		boolean flag;
		flag = dao.addStaffdetails(vo);
		return flag;
	}

	public StaffTimingsVO fetchStaffById(int Staff_id)
			throws StaffTimingsManagementException, StaffTimingsNotFoundException {
		{
			try {
				StaffTimingsVO vo = new StaffTimingsVO();
				vo = dao.fetchStaffById(Staff_id);
				return vo;
			} catch (StaffTimingsNotFoundException e) {
				throw new StaffTimingsNotFoundException("Error while fetching " + e.getMessage());
			}
		}
	}

	public Map<String, StaffTimingsVO> fetchstaffByTime_in(String Time_in) throws StaffTimingsNotFoundException {
		try {
			Map<String, StaffTimingsVO> map = new HashMap<String, StaffTimingsVO>();
			map = dao.fetchstaffByTime_in(Time_in);
			return map;
		} catch (StaffTimingsNotFoundException e) {
			throw new StaffTimingsNotFoundException("Error while fetching " + e.getMessage());
		}
	}

	public boolean updateStaff(StaffTimingsVO vo) throws StaffTimingsManagementException {
		boolean flag;
		flag = dao.updateStaff(vo);
		return flag;
	}*/

}
