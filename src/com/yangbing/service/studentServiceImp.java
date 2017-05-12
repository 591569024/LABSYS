package com.yangbing.service;

import java.util.List;

import com.yangbing.bean.Student;
import com.yangbing.dao.IStudentDao;

public class studentServiceImp implements IStudentService
{
	IStudentDao sDao;

	public IStudentDao getsDao()
	{
		return sDao;
	}

	public void setsDao(IStudentDao sDao)
	{
		this.sDao = sDao;
	}

	@Override
	public void add(Student s)
	{
		sDao.add(s);

	}

	@Override
	public void move(int id)
	{
		sDao.move(id);

	}

	@Override
	public void modify(Student s)
	{
		sDao.modify(s);

	}

	@Override
	public String findNameByid(int id)
	{
		// TODO 自动生成的方法存根
		return sDao.findNameByid(id);
	}

	@Override
	public List<String> findAllName()
	{
		// TODO 自动生成的方法存根
		return sDao.findAllName();
	}

	@Override
	public Student findStudentByid(int id)
	{
		// TODO 自动生成的方法存根
		return sDao.findStudentByid(id);
	}

	@Override
	public List<Student> findAllStudents()
	{
		// TODO 自动生成的方法存根
		return sDao.findAllStudents();
	}

}
