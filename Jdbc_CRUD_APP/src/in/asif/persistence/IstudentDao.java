package in.asif.persistence;

import in.asif.dto.Student;

public interface IstudentDao {
	
	// operation 
	public String addStudent(String name,Integer age,String address);
	
	public Student searchStudent(Integer id);
	
	public String updateStudent(Integer id,String name,Integer age,String address);
	
	public String deleteStudent(Integer id);
	

}
