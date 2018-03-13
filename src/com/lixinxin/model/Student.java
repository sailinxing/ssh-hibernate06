package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="STUDENT")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
	@Column(name="NAME")
	private String name;
	@Column(name="AGE")
	private Integer age;
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CID")
	private Course course;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="STUDENT_TEACHER"
	,joinColumns=@JoinColumn(name="SID")
	,inverseJoinColumns=@JoinColumn(name="TID"))
	private Set<Teacher> teachers;
//	@OneToOne(fetch=FetchType.EAGER)
//	@PrimaryKeyJoinColumn
//	private IDCard card;
	@OneToOne(fetch=FetchType.EAGER,mappedBy="student")
	private IDCard card;
*/
	public Student(Integer sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/*public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	

	public IDCard getCard() {
		return card;
	}

	public void setCard(IDCard card) {
		this.card = card;
	}
*/
	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age+ "]";
	}

}
