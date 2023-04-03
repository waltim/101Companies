package br.unb.cic.companies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestEmployee {

	@Test
	public void testCutSalary() {
		Company com = new Company("name");
		Department dep = new Department("UNB", com);
		Employee emp = new Employee("Walter", 100.0, 20.0, "manager", dep);

		assertEquals(120.0, emp.totalSalary(),0.01);

		emp.cutSalaries(5.0);

		assertEquals(115.0, emp.totalSalary(),0.01);
	}

	@Test
	public void testCutSalaries() {
		Company com = new Company("name");
		Department dep = new Department("UNB", com);
		Employee emp = new Employee("Walter", 100.0, 20.0, "manager", dep);

		emp.cutSalaries(5.0);

		assertEquals(115.0, emp.totalSalary(),0.01);
	}

}
