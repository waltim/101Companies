package br.unb.cic.companies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCompany {
	
	@Test
	public void testCutSalaries() {
		Company com = new Company("UNB");
		Department dep1 = new Department("FT", com);
		Department dep2 = new Department("CIC", com);
		Employee emp = new Employee("Rodrigo", 5000.0, 900.0, "manager", dep2);
		Employee emp2 = new Employee("Walter", 100.0, 20.0, "developer", dep2);
		Employee emp3 = new Employee("João", 2000.0, 200.0, "developer", dep2);
		
		com.addDepartment(dep1);
		com.addDepartment(dep2);
		
		dep2.addEmployee(emp);
		dep2.addEmployee(emp2);
		dep2.addEmployee(emp3);
		
		dep2.cutSalaries(10.0);

		assertEquals(7510.0, dep2.totalSalary(),0.01);
	}
	
	@Test
	public void testTotalSalary() {
		Company com = new Company("UNB");
		Department dep1 = new Department("FT", com);
		Department dep2 = new Department("CIC", com);
		Employee emp = new Employee("Rodrigo", 5000.0, 900.0, "manager", dep2);
		Employee emp2 = new Employee("Walter", 100.0, 20.0, "developer", dep2);
		Employee emp3 = new Employee("João", 2000.0, 200.0, "developer", dep2);
		
		com.addDepartment(dep1);
		com.addDepartment(dep2);
		
		dep2.addEmployee(emp);
		dep2.addEmployee(emp2);
		dep2.addEmployee(emp3);
		
		assertEquals(8220.0, dep2.totalSalary(),0.01);
	}
}
