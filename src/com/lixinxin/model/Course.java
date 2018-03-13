package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="COURSE")
public class Course implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer cid;
@Column(name="NAME")
private String name;
@OneToMany(fetch=FetchType.EAGER,mappedBy="course")
//@JoinColumn(name="CID")
private Set<Student> studentSet;
public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Set<Student> getStudentSet() {
	return studentSet;
}
public void setStudentSet(Set<Student> studentSet) {
	this.studentSet = studentSet;
}

@Override
public String toString() {
	return "Course [cid=" + cid + ", name=" + name + "]";
}
public Course() {
	super();
}

}
