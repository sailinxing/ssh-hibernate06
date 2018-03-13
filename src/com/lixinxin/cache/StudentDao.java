package com.lixinxin.cache;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Student;
import com.lixinxin.utils.DBUtils;

public class StudentDao {
	public Student selectById(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Student student = (Student) session.get(Student.class, id);
			Student student1 = (Student) session.get(Student.class, id);
			System.out.println(student.hashCode()+","+student1.hashCode());
			tx.commit();		
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
	public Student selectById1(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		Student student = (Student) session.get(Student.class, id);
		tx.commit();
		
		Session session1 = DBUtils.findSession();
		Transaction tx1 = session1.beginTransaction();
		Student student1 = (Student) session1.get(Student.class, id);		
		tx1.commit();
		System.out.println(student.hashCode()+","+student1.hashCode());
		return null;
	}	
	public Student selectByName(String name){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Query query = session.createQuery("from Student where name=?");
			query.setString(0, name);
			query.setCacheable(true);
			Student student = (Student) query.uniqueResult();
			
			Query query1 = session.createQuery("from Student where name=?");
			query1.setString(0, name);
			query1.setCacheable(true);
			Student student1= (Student) query1.uniqueResult();
			System.out.println(student.hashCode()+","+student1.hashCode());
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}		
		return null;
	}	
	
}
