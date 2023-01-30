package in.asif.service;

import in.asif.Daofactory.StudentDaoFactory;
import in.asif.dto.Student;
import in.asif.persistence.IstudentDao;
import in.asif.servicefactory.StudentServiceFactory;

// service layer logic 
public class StudentServiceImpl implements IstudentService {
	
	private IstudentDao stdDao ;
	@Override
	public String addStudent(String name, Integer age, String address) {
		 stdDao = StudentDaoFactory.getStudentDao();
		if (stdDao!=null) {
			return stdDao.addStudent(name, age, address);
		} else {
         return "FAILURE";		
         }
		
	}

	@Override
	public Student searchStudent(Integer id) {
		stdDao = StudentDaoFactory.getStudentDao();
		
		return stdDao.searchStudent(id);
	}

	@Override
	public String updateStudent(Integer id, String name, Integer age, String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
