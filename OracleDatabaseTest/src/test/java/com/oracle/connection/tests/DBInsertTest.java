package com.oracle.connection.tests;


import com.oracle.connection.dao.Student_infoDao;
import com.oracle.connection.entity.Student_info;

public class DBInsertTest {
	public static void main(String[] args) {
		
		Student_info stu_info = new Student_info();
		stu_info.setStudent_id(1009L);
		stu_info.setFirst_name("Muzappar");
		stu_info.setLast_name("Rahman");
		stu_info.setBirth_date("05-23-1980");
		stu_info.setAge(41L);
		
		Student_infoDao.addStudent(stu_info);
	}

}
