package br.unb.cic.companies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmployee {

	@Test
	public void testCutSalary() {
		Company com = new Company("name");
		Department dep = new Department("UNB",com);
		Employee emp = new Employee("Walter", 100.0,  20.0, "gerente",dep);
		
		assertEquals(120.0,emp.totalSalary());
		
		emp.cutSalaries(5.0);
		
		assertEquals(115.0, emp.totalSalary()); 
	}

}
