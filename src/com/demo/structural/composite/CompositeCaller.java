package com.demo.structural.composite;

//Caller class
public class CompositeCaller {

	//Client
	public static void call() {
		System.out.println("***Composite***");
		
		//These are all leaf nodes, setting only the name.
		//Calling leaf nodes getEmployeeDetails would return just the employee name
		Employee eng1 = new Engineer("John Doe");
		Employee eng2 = new Engineer("Matt Lee");
		Employee eng3 = new Engineer("Simon Wood");
		Employee eng4 = new Engineer("Bud Wiser");
		Employee eng5 = new Engineer("Carls Burg");
		Employee eng6 = new Engineer("Fosters Dope");
		
		//There are composite nodes, we set their names as well we can perform composite operations
		//Like add, remove.
		//calling composite nodes getEmployeeDetails will get their own name and their subordinates names.
		Employee lead1 = new Manager("Leader Byexample");
		lead1.addEmployee(eng5);
		lead1.addEmployee(eng6);
		
		Employee man1 = new Manager("Boss Man");
		man1.addEmployee(eng1);
		man1.addEmployee(eng2);
		man1.addEmployee(lead1);
		
		Employee man2 = new Manager("Chief Ten");
		man2.addEmployee(eng3);
		man2.addEmployee(eng4);
		
		Employee man3 = new Manager("Supreme Commander");
		man3.addEmployee(man1);
		man3.addEmployee(man2);
		
		man3.getEmployeeDetails("\t");
	}
}
