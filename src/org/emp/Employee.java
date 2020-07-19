package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		// TODO Auto-generated method stub
System.out.println("Employee Name : Meena");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		Company c = new Company();
				c.companyName();
				Client l = new Client();
				l.clientName();
				Project p = new Project();
				p.projectName();
		
	}

}
