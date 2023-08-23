package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Personal_Details")
public class Details {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String Name;
private String Gender;
private int age;
private Date dob;
private long Ph_no;
private String emailid;
public Details() {
	super();
	// TODO Auto-generated constructor stub
}
public Details(int id, String name, String gender, int age, Date dob, long ph_no, String emailid) {
	super();
	this.id = id;
	Name = name;
	Gender = gender;
	this.age = age;
	this.dob = dob;
	Ph_no = ph_no;
	this.emailid = emailid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public long getPh_no() {
	return Ph_no;
}
public void setPh_no(long ph_no) {
	Ph_no = ph_no;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
