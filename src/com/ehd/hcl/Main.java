package com.ehd.hcl;

public class Main {

	
	public static void main(String ...args){
		
		ArrayPeople arrayPeople = new ArrayPeople();
		
		arrayPeople.printArray();
		
		arrayPeople.addPerson("Lalo", "Herrera", 22);
		arrayPeople.addPerson("Eduardo", "Herrera", 22);
		arrayPeople.printArray();



		
	}
}
