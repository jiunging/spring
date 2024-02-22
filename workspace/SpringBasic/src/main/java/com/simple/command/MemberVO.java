package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	
	private String id;
	private String name;
	private int age;
	private ArrayList<String> inter;
	
	public MemberVO() {
		
	}

	public MemberVO(String id, String name, int age, ArrayList<String> inter) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.inter = inter;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}
	
	
	
	
	
	
	
	
	

}
