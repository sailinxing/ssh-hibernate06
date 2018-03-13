package com.lixinxin.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lixinxin.model.IDCard;
import com.lixinxin.utils.DBUtils;

public class IDCardDao {
	public IDCard selectById(Integer id){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		IDCard card=null;
		try {
			Query query = session.createQuery("from IDCard where id=?");
			query.setInteger(0, id);
			card= (IDCard) query.uniqueResult();
		tx.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return card;
	}
	
}
