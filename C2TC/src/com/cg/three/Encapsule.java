package com.cg.three;

public class Encapsule {
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
