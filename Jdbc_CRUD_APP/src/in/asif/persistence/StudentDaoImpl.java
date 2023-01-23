package in.asif.persistence;

import java.io.IOException;
import java.sql.*;
import java.util.*;

import in.asif.dto.Student;
import in.asif.util.*;

//Persistence logic using jdbc api
public class StudentDaoImpl implements IstudentDao {
    
	@Override
	public String addStudent(String name, Integer age, String address) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		Scanner sc=null;
		
		try {
			connection = JdbcUtil.getJdbcConnection();
			if(connection!=null)
			{
				String sql="INSERT INTO student(`name`,`age`,`address`) VALUES(?,?,?)";
				 pstmt = connection.prepareStatement(sql);
			}
		    if(pstmt!=null)
		    {
		    	pstmt.setString(1,name);
		    	pstmt.setInt(2, age);
		    	pstmt.setString(3, address);
		    	
		    	int rowUpdated = pstmt.executeUpdate();
		    	if (rowUpdated==1) {
		    		
		    		return "SUCCESS";
					
				} 
		    }
				
			}
		
		 catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FAILURE";
	}

	@Override
	public Student searchStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
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