package in.asif.controller;

import java.util.Scanner;

import in.asif.dto.Student;
import in.asif.service.IstudentService;
import in.asif.servicefactory.StudentServiceFactory;

// controller logic
public class TestApp {

	public static void main(String[] args) {
		
		insertOperation();
		searchOperation();
		
	}


	private static void searchOperation() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id::");
		Integer id=sc.nextInt();
		IstudentService studentServive = StudentServiceFactory.getStudentServive();
		Student std = studentServive.searchStudent(id);
		if (std!=null) {
			//System.out.println(std);
			System.out.println("ID\tNAME\tAGE\tADDRESS");
			System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getAge()+"\t"+std.getAddress());
			
		} else {
          System.out.println("Student with id no "+id+" Not Found !");
		}
		sc.close();
	}
	

	private static void insertOperation() {
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
		sc.close();
	}

}
