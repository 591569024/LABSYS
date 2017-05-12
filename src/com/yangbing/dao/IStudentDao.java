package com.yangbing.dao;

import java.util.List;

import com.yangbing.bean.Student;

public interface IStudentDao
{
	void add(Student s);

	void move(int id);

	void modify(Student s);

	String findNameByid(int id);

	List<String> findAllName();

	Student findStudentByid(int id);

	List<Student> findAllStudents();

}
