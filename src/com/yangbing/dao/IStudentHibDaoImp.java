package com.yangbing.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yangbing.bean.Student;

public class IStudentHibDaoImp  implements IStudentDao
{
	private SessionFactory sf;

	public void setSf(SessionFactory sf)
	{
		this.sf = sf;
	}

	@Override
	public void add(Student s)
	{
		sf.getCurrentSession().save(s);
		
	}

	@Override
	public void move(int id)
	{
		Student s = (Student) sf.getCurrentSession().get(Student.class, id);
		sf.getCurrentSession().delete(s);
		
	}

	@Override
	public void modify(Student s)
	{
		
		sf.getCurrentSession().update(s);
		
	}

	@Override
	public String findNameByid(int id)
	{
		//		Student s =  this.findStudentByid(id);
//		if(s!=null)
//		{
//			return s.getName();
//		}
//		return null;
		
		//the good method
		String hql = "select name from Student where id=:id";
		String name = (String) sf.getCurrentSession().createQuery(hql).setInteger("id", id).uniqueResult();
		return name;
	}

	@Override
	public List<String> findAllName()
	{
		String hql = "select name from Student";
		return (List<String>) sf.getCurrentSession().createQuery(hql);
	}

	@Override
	public Student findStudentByid(int id)
	{
		return (Student) sf.getCurrentSession().load(Student.class, id);
	}

	@Override
	public List<Student> findAllStudents()
	{
		String hql = "from Student";
		return sf.getCurrentSession().createQuery(hql).list();
	}
	 

}
