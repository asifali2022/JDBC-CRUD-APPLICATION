package in.asif.service;

import in.asif.dto.Student;

public interface IstudentService {


	// operation 
	public String addStudent(String name,Integer age,String address);
	
	public Student searchStudent(Integer id);
	
	public String updateStudent(Integer id,String name,Integer age,String address);
	
	public String deleteStudent(Integer id);
	

}
