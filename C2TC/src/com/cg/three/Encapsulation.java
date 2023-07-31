package com.cg.three;

public class Encapsulation {
	private int id;
	private String name;
	private String email;
	private long phone;
	private Encapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Encapsulation(int id, String name, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return (int) phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

public static void main(String[] args) {
	Encapsulation obj1=new Encapsulation();
	obj1.setId(1028);
	obj1.setName("Hari");
	obj1.setEmail("Sample123@gmail.com");
	obj1.setPhone(254333154);
	
	System.out.println(obj1.getId());
	System.out.println(obj1.getName());
	System.out.println(obj1.getEmail());
	System.out.println(obj1.getPhone());
}
}
