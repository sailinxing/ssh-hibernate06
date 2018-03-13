package com.lixinxin.test;



import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.CourseDao;
import com.lixinxin.dao.IDCardDao;
import com.lixinxin.dao.StudentDao;
import com.lixinxin.dao.TeacherDao;
import com.lixinxin.model.Course;
import com.lixinxin.model.IDCard;
import com.lixinxin.model.Student;
import com.lixinxin.model.Teacher;

public class TestDao {
	private StudentDao sdao;
	private CourseDao cdao;
	private TeacherDao tdao;
	private IDCardDao idao;
	@Before
	public void init() {
		sdao = new StudentDao();
		cdao=new CourseDao();
		tdao=new TeacherDao();
		idao=new IDCardDao();
	}
	@Test
	public void selectBySid(){
		Student student = sdao.selectById(1);
		System.out.println(student);
//		System.out.println(student.getCourse());
//		System.out.println(student.getTeachers());
//		System.out.println(student.getCard());
	}
	@Test
	public void selectByCid(){
		Course course = cdao.selectById(1);
		System.out.println(course);
		System.out.println(course.getStudentSet());
	}
	@Test
	public void selectByTid(){
		 Teacher teacher = tdao.selectById(4);
		System.out.println(teacher);
		System.out.println(teacher.getStudents());
	}
	@Test
	public void selectByIid(){
		 IDCard card = idao.selectById(1);
		System.out.println(card);
		System.out.println(card.getStudent());
	}
	
}
