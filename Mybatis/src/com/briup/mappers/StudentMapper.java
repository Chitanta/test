package com.briup.mappers;

import java.util.List;

import com.briup.pojo.Student;

public interface StudentMapper {
	List<Student> findAllStudents();
	Student findStudentById(Integer id);
	void insertStudent(Student student);
	public void deleteStudent(Integer id); 
}
