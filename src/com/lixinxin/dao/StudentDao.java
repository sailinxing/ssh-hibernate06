package com.lixinxin.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Student;
import com.lixinxin.utils.DBUtils;

public class StudentDao {
	public Student selectById(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		Student stu=null;
		try {
			Query query = session.createQuery("from Student where sid=?");
			query.setInteger(0, id);
		stu= (Student) query.uniqueResult();
		tx.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return stu;
	}
	
}
