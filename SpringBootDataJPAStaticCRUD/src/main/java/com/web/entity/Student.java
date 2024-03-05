package com.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(name="sid")
	private int stdId;
	@Column(name="sname")
	private String stdName;
	private String course;
	private double fee;
	public Student() {
		super();
		}
	public Student(int stdId, String stdName, String course, double fee) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.course = course;
		this.fee = fee;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", course=" + course + ", fee=" + fee + "]";
	}
	
	

}