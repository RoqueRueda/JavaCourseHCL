package com.ehd.hcl;

import java.util.ArrayList;

public class ArrayPeople {

	private ArrayList<Persona> people;
	public int id = 0;
	private int value;
	
	public ArrayPeople(){
		people = new ArrayList<Persona>();
		fillArray();
	}
	
	private void fillArray(){
		people.add(new Persona("Eduardo","Herrera",22,id++));
		people.add(new Persona("Carlos","Uscanga",22,id++));
		people.add(new Persona("Juan","Jasso",22,id++));
		people.add(new Persona("Andres","Juarez",22,id++));
		people.add(new Persona("Josue","Hernandez",22,id++));
		people.add(new Persona("Yair","Quijano",23,id++));
		people.add(new Persona("Eduardo","Herrera",22,id++));
		people.add(new Persona("Eduardo","Herrera",22,id++));
		people.add(new Persona("Yair","Quijano",23,id++));
		people.add(new Persona("Daniel","Merino",23,id++));

	}
	
	public void printArray(){
		for(int i=0; i<people.size(); i++){
			System.out.println("ID: "+people.get(i).getID()+" "+people.get(i).getFirstname()+ " "+people.get(i).getLastname()+ " "+people.get(i).getAge());
		}
	}
	
	public void addPerson(String firstname, String lastname, int age){
		
		Persona persona = new Persona(firstname,lastname,age,id++);
		
		boolean valid = validate(persona);
		if(!valid){
			people.add(new Persona(firstname,lastname,age,id));
			System.out.println("Persona agregada");
		}
		else
			System.out.println("La persona que intentas agregar ya existe y su id es "+ this.getValueFound());
	}
	
	
	private boolean validate(Object o){
		for(int i=0; i<people.size(); i++){

			if(people.get(i).equals(o)){
				value = i;
				return true;
			}
		}
		return false;
		
	}
	
	private int getValueFound(){
		return value;
	}
	
	
	
}
