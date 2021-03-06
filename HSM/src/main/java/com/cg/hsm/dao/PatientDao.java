package com.cg.hsm.dao;

import java.util.List;


import com.cg.hsm.domain.Patient;
/**
 * This class perform CRUD operations on database
 * @author  Jyothi
 *
 */

public interface PatientDao {
	
	/**
	 * This addPatient method will add new patient to database
	 * @param patient
	 */
	public void addPatient(Patient patient);
	/**
	 * This updatePatient will update doctor details in database
	 * @param patient
	 */
	public void updatePatient(Patient patient,int patientId);
	/**
	 * This deletePatient method will delete record of patient from database
	 * @param patient
	 */
	public void deletePatient(int patientId);
	/**
	 * This will return the list of all the doctors from database
	 * @return
	 */
	List<Patient> findAll();
	/**
	 * This patientHistory method will add the history of the patient
	 * @param patientHistory
	 * @param patientId
	 */
	public void patientHistory(PatientHistory patientHistory , int patientId);
	/**
	 * This patientCase method will add patientcase details to patient table
	 * @param patientId
	 */
	public void patientCase(int patientId);
}
	

