package br.unb.cic.companies;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCompany {

	@Test
	public void testNameOfOfficeForSpecificDepartment() {
		Company com = new Company("UNB");
		Department dep1 = new Department("FT", com);
		Department dep2 = new Department("CIC", com);
		Employee emp = new Employee("Rodrigo", 100.0, 20.0, "manager", dep2);
		Employee emp2 = new Employee("Walter", 100.0, 20.0, "developer", dep2);
		Employee emp3 = new Employee("Leomar", 100.0, 20.0, "developer", dep2);
		
		com.addDepartment(dep1);
		com.addDepartment(dep2);
		
		dep2.addEmployee(emp);
		dep2.addEmployee(emp2);
		dep2.addEmployee(emp3);
		
		assertEquals("Rodrigo", com.NameOfOfficeForSpecificDepartment(dep2, "manager"));
	}
}
