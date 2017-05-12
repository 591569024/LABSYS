package com.yangbing.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangbing.bean.Student;
import com.yangbing.service.IStudentService;

public class test
{

	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentService service =  (IStudentService)ac.getBean("studentService");
		service.add(new Student("杨兵", 22));
		List<Student> s = service.findAllStudents();
		System.out.println(s);
	}

}
