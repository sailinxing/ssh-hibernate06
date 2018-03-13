package com.lixinxin.cache;


import org.junit.Before;
import org.junit.Test;

public class StudentDaoTest {
	private StudentDao sdao;
	@Before
	public void init(){
		sdao=new StudentDao();
	}
	@Test
	public void testCache() {
		sdao.selectById(1);
	}
	@Test
	public void testCache1() {
		sdao.selectById1(1);
	}
	@Test
	public void testCache2() {
		sdao.selectByName("jack");
	}

}
