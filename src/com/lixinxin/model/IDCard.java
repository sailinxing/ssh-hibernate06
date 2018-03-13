package com.lixinxin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="IDCARD")
public class IDCard implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="CARDNAME")
	private String cardName;
//	@OneToOne(fetch=FetchType.EAGER,mappedBy="card")
//	@PrimaryKeyJoinColumn
//	private Student student;
//	@ManyToOne(fetch=FetchType.EAGER)
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="SID")
	private Student student;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public IDCard() {
		super();
	}

	@Override
	public String toString() {
		return "IDCard [id=" + id + ", cardName=" + cardName + "]";
	}

}
