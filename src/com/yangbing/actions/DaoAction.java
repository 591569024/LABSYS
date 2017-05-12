package com.yangbing.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.yangbing.bean.Student;
import com.yangbing.service.IStudentService;

public class DaoAction extends ActionSupport
{
	Integer id;
	String name;
	int age;
	IStudentService service;
	public void setService(IStudentService service)
	{
		this.service = service;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
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
	public String query() throws Exception
	{
		Student s = service.findStudentByid(id);
		System.out.println(s.toString());
		return SUCCESS;
	}
	public String regist() throws Exception
	{
		String sname = new String(name.getBytes("ISO-8859-1"));//解决乱码
		service.add(new Student(sname, age));
		return "success";
	}
	
}
