package com.example.Crud.demo.crudCustomer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CrudCustomer {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;

@Column(name = "Name")
private String name;
@Column(name = "Address")
private String addr;
@Column(name = "MoblileNo")
private long mobNo;
@Column(name = "age")
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
}
