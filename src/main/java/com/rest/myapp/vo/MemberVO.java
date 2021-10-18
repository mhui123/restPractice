package com.rest.myapp.vo;

public class MemberVO {
	private int id;
	private String name;
	private int age;
	private String dept;
	
	public MemberVO() {
		this.id = id;
		this.name= name;
		this.age = age;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "member = [ id =" +id +",name = "+ name +", age = " + age +", dept = "+ dept +"]";
	}
	
	
}
