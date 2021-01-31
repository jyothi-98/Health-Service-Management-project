package com.cg.hsm.daoimpl;

import java.util.List;

import javax.persistence.Query;

import com.cg.hsm.dao.PatientDao;
import com.cg.hsm.domain.Patient;
import com.cg.hsm.util.DbUtil;

public class PatientDaoImpl extends DbUtil implements PatientDao {
	/**
	 * This addPatient method will add patient details in patients table in database
	 */
	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		entityManager.persist(patient);
		entityManager.getTransaction().commit();
		entityManager.close();
		  
		
	}
	/**
	 * This updatePatient method will update patient details in patients table in database
	 */
	@Override
	public void updatePatient(Patient patient1, int patientId) {
		entityManager.getTransaction().begin();	
		
		Patient patient=entityManager.find(Patient.class, patientId);
		patient.setPatientName(patient1.getPatientName());
	    patient.setPatientAge(patient1.getPatientAge());
		patient.setPatientContact(patient1.getPatientContact());
		patient.setAddress(patient1.getAddress());
		patient.setAdmissionFee(patient1.getAdmissionFee());
		patient.setPolicyId(patient1.getPolicyId());
		patient.setPolicyName(patient1.getPolicyName());
		 entityManager.getTransaction().commit();
		 entityManager.close();
		  
	}
	
	/**
	 * This deletePatient method will delete patient details from patients table in database
	 */
	@Override
	public void deletePatient(int patientId) {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
		Patient patient=entityManager.find(Patient.class, patientId);
		
		entityManager.remove(patient);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		  
	}
	/**
	 * This findAll method will list all patient details 
	 */
	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from Patient");	
		List<Patient> patients =  query.getResultList();
		for(Patient patient:patients) {
			System.out.println("Patient ID : " + patient.getPatientId());
			System.out.println("Patient Name : "+ patient.getPatientName());
			System.out.println("Patient Age : "+patient.getPatientAge());
			System.out.println("Contact Number : "+ patient.getPatientContact());
			System.out.println("Address : " +patient.getAddress());
			System.out.println("Symptoms : "+patient.getSymptoms());
			System.out.println("Admission Fee : "+ patient.getAdmissionFee());
			System.out.println("Policy Id : " + patient.getPolicyId());
			System.out.println("Policy Name : "+patient.getPolicyName());
		}
		return null;
	}
	

}
