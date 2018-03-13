package com.lixinxin.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DBUtils {
	static SessionFactory sf;
	static {
		Configuration cfg = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	public static Session findSession(){
		return sf.getCurrentSession();
	}
	public static void main(String[] args) {
		System.out.println(findSession());
	}
}
