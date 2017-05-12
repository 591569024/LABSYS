package com.yangbing.actions;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yangbing.bean.Student;
import com.yangbing.service.IStudentService;

public class ZhuCeAction
{
	String name;
	int age;
	//声明Service
	private IStudentService service;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public IStudentService getService()
	{
		return service;
	}
	public void setService(IStudentService service)
	{
		this.service = service;
	}
	public String execute() throws UnsupportedEncodingException
	{
		String sname = new String(name.getBytes("ISO-8859-1"));//解决乱码
		service.add(new Student(sname, age));
		return "success";
	}

}
