package in.asif.controller;

import java.util.Scanner;

import in.asif.service.IstudentService;
import in.asif.servicefactory.StudentServiceFactory;

// controller logic
public class TestApp {

	public static void main(String[] args) {
		
		IstudentService studentServive = StudentServiceFactory.getStudentServive();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name::");
		String name=sc.next();
		System.out.println("Enter Student Age::");
		Integer age=sc.nextInt();
		System.out.println("Enter Student Address::");
		String address=sc.next();
		String msg = studentServive.addStudent(name, age, address);
		if (msg.equalsIgnoreCase("success")) {
			System.out.println("Data Inserted Successfully");
			
		} else {
			System.out.println("Data not Inserted ");
		}
		
	}

}
