package com.lixinxin.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Course;
import com.lixinxin.utils.DBUtils;

public class CourseDao {
	public Course selectById(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		Course cou=null;
		try {
			Query query = session.createQuery("from Course where cid=?");
			query.setInteger(0, id);
		cou= (Course ) query.uniqueResult();
		tx.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return cou;
	}
	
}
