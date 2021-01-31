package com.cg.hsm.test;

import java.util.Scanner;

import javax.persistence.Query;

import java.util.List;
import com.cg.hsm.daoimpl.DoctorDaoImpl;
import com.cg.hsm.domain.Doctor;

/**
 * This class tests the functionalities of DoctorDaoImpl Class It checks whether
 * all CRUD operations are performed correctly and ensures data is stored in
 * database
 * 
 * @author Pranjali Chaudhari
 *
 */

public class DoctorDaoImplTest {
	private static void RegisterDocor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Please Provide below details---------");
		Doctor doctor = new Doctor();
		System.out.println("Enter Doctor's Name : ");
		doctor.setDoctorName(sc.nextLine());
		System.out.println("Enter Doctor's Contact Number : ");
		doctor.setContactNumber(sc.nextLong());
		System.out.println("Enter Number Of Hours Doctor is Available : ");
		doctor.setHoursOfAvailability(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Specializaion : ");
		doctor.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor's Degree Name : ");
		doctor.setDegree(sc.nextLine());
		System.out.println("Enter Doctor's Total Number of Experience : ");
		doctor.setYearsOfExperience(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Fees: ");
		doctor.setDoctorFee(sc.nextInt());

		DoctorDaoImpl impl = new DoctorDaoImpl();
		impl.addDoctor(doctor);
		System.out.println("Doctor Registered Successfully!");
	}

	private static void UpdateDoctorFee() {

		Scanner sc = new Scanner(System.in);
		System.out.println("-------Updating details-------- ");
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();
		System.out.println("Enter Doctor's updated Fee : ");
		int updatedDoctorFee = sc.nextInt();
		DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
		doctorDaoImpl.updateDoctorFee(doctorId, updatedDoctorFee);
		System.out.println("-------Updated Doctor Fees-------- ");

	}

	private static void UpdateDoctor() {

		Scanner sc = new Scanner(System.in);
		System.out.println("-------Updating details-------- ");
		Doctor doctor1 =new Doctor();
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Doctor's Name : ");
		doctor1.setDoctorName(sc.nextLine());
		System.out.println("Enter Doctor's Contact Number : ");
		doctor1.setContactNumber(sc.nextLong());
		System.out.println("Enter Number Of Hours Doctor is Available : ");
		doctor1.setHoursOfAvailability(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Specializaion : ");
		doctor1.setSpecialization(sc.nextLine());
		System.out.println("Enter Doctor's Degree Name : ");
		doctor1.setDegree(sc.nextLine());
		System.out.println("Enter Doctor's Total Number of Experience : ");
		doctor1.setYearsOfExperience(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Doctor's Fees: ");
		doctor1.setDoctorFee(sc.nextInt());
		
		DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
		doctorDaoImpl.updateDoctor(doctor1,doctorId);
		System.out.println("-------Updated Doctor Details-------- ");

	}
	
	private static void RemoveDoctor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Deleting details-------- ");
		Doctor doctor =new Doctor();
		System.out.println("Enter Doctor id : ");
		int doctorId = sc.nextInt();
		
		DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
		doctorDaoImpl.deleteDoctor(doctorId);
		System.out.println("-------Deleted Doctor Details-------- ");
		
		
	}

	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1. Test AddDoctor method");
		System.out.println("2. Test UpdateDoctorFee method");
		System.out.println("3. Test FindAll method");
		System.out.println("4. Test UpdateDoctor methd");
		System.out.println("5. Test RemoveDoctor method");
		System.out.println("Choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			RegisterDocor();
			break;
		case 2:
			UpdateDoctorFee();
			break;
		case 3 :
			DoctorDaoImpl doctorDaoImpl = new DoctorDaoImpl();
			doctorDaoImpl.findAll();
			break;
		case 4 :
			UpdateDoctor();
			break;
		case 5:
			RemoveDoctor();
		default:
			break;
			
		}
		
		
		
	

}
}
