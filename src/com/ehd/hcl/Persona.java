package com.ehd.hcl;

public class Persona {

	
	private String firstname;
	private String lastname;
	private int age;
	public int id;
	
	public Persona(String firstname, String lastname, int age, int id){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getID(){
		return this.id;
	}
	
	public boolean equals(Object o){
		if(( o instanceof Persona) && (((Persona)o).getFirstname() == this.getFirstname()) &&
		  (((Persona)o).getLastname() == this.getLastname()) &&
		  (((Persona)o).getAge() == this.getAge())
		  )
		{
			return true;
		}
		else{
			return false;
		}
	}
	
}
	

	
	
