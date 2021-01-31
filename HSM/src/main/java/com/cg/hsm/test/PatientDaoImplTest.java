package com.cg.hsm.test;

import java.util.Scanner;

import com.cg.hsm.daoimpl.PatientDaoImpl;
import com.cg.hsm.domain.Patient;
/**
 * This class tests the functionalities of PatientDaoImpl Class
 * It checks whether all CRUD operations are performed correctly and ensures data is stored in database
 * @author jyothi
 *
 */


public class PatientDaoImplTest {
	

	private static void RegisterPatient() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Please Provide below details---------");
		Patient patient = new Patient();
		System.out.println("Enter Patient's Name : ");
		patient.setPatientName(sc.next());
		System.out.println("Enter Patient's Age : ");
		patient.setPatientAge(sc.nextInt());
		System.out.println("Enter Patient's Contact Number : ");
		patient.setPatientContact(sc.nextLong());
		System.out.println("Enter Patient's Address : ");
		patient.setAddress(sc.next());
		System.out.println("Enter Patient's Symptoms: ");
		patient.setSymptoms(sc.next());
		System.out.println("Enter Patients's Admission Fees: ");
		patient.setAdmissionFee(sc.nextInt());
		System.out.println("Enter Patient's Policy Id : ");
		patient.setPolicyId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Patient's Policy Name : ");
		patient.setPolicyName(sc.nextLine());
		
		PatientDaoImpl impl=new PatientDaoImpl();
		impl.addPatient(patient);
		System.out.println("Patient Registered Successfully!");
		
	}
	
	
	
	public static void UpdatePatient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Enter the data to be updated------------------");
		Patient patient1=new Patient();
		System.out.println("enter the id of the patient");
		int patientId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name ");
		patient1.setPatientName(sc.next());
		System.out.println("Enter Patient's Age : ");
		patient1.setPatientAge(sc.nextInt());
		System.out.println("Enter Patient's Contact Number : ");
		patient1.setPatientContact(sc.nextLong());
		System.out.println("Enter Patient's Address : ");
		patient1.setAddress(sc.next());
		System.out.println("Enter Patient's Symptoms: ");
		patient1.setSymptoms(sc.next());
		System.out.println("Enter Patients's Admission Fees: ");
		patient1.setAdmissionFee(sc.nextInt());
		System.out.println("Enter Patient's Policy Id : ");
		patient1.setPolicyId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Patient's Policy Name : ");
		patient1.setPolicyName(sc.nextLine());
		
		PatientDaoImpl impl=new PatientDaoImpl();
		impl.updatePatient(patient1,patientId);
		System.out.println("Patient updated Successfully!");
		
		
	}
	private static void RemovePatient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Deleting details-------- ");
		Patient patient = new Patient();
		System.out.println("Enter Patient id : ");
		int patientId = sc.nextInt();
		PatientDaoImpl impl=new PatientDaoImpl();
		
		impl.deletePatient(patientId);
		System.out.println("-------Deleted patient Details-------- ");
		
		
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int continueChoice;
			System.out.println("------MENU------");
			System.out.println("1. Register patient");
			System.out.println("2. FindAll ");
			System.out.println("3. UpdatePatient");
			System.out.println("4. RemovePatient");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
					RegisterPatient();
					break;
			case 2:
				PatientDaoImpl impl = new PatientDaoImpl();
				impl.findAll();
				System.out.println("-------------------");
				break;
			
			case 3:
					UpdatePatient();
					break;
			
			case 4:
					RemovePatient();
					break;
			default:
				break;
			}
	
		}

}
