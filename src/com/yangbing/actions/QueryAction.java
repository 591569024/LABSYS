package com.yangbing.actions;


import com.opensymphony.xwork2.ActionSupport;
import com.yangbing.bean.Student;
import com.yangbing.service.IStudentService;

public class QueryAction extends ActionSupport
{
	Integer id;
	IStudentService service;
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setService(IStudentService service)
	{
		this.service = service;
	}
	public String execute()
	{
		Student s = service.findStudentByid(id);
		if(s==null)
		{
			return ERROR;
		}
		System.out.println(s.toString());
		return SUCCESS;
	}
	

}
