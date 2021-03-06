package com.lixinxin.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lixinxin.model.Teacher;
import com.lixinxin.utils.DBUtils;

public class TeacherDao {
	public Teacher selectById(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		Teacher teacher=null;
		try {
			Query query = session.createQuery("from Teacher where id=?");
			query.setInteger(0, id);
			teacher= (Teacher) query.uniqueResult();
		tx.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return teacher;
	}
	
}
