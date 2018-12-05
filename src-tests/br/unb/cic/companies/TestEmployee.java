package br.unb.cic.companies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmployee {

	@Test
	public void testCutSalary() {
		Company com = new Company("name");
		Department dep = new Department("UNB", com);
		Employee emp = new Employee("Walter", 100.0, 20.0, "manager", dep);

		assertEquals(120.0, emp.totalSalary());

		emp.cutSalaries(5.0);

		assertEquals(115.0, emp.totalSalary());
	}

	@Test
	public void testCutSalaries() {
		Company com = new Company("name");
		Department dep = new Department("UNB", com);
		Employee emp = new Employee("Walter", 100.0, 20.0, "manager", dep);

		emp.cutSalaries(5.0);

		assertEquals(115.0, emp.totalSalary());
	}

	@Test

	public void testCompareEmployees() {
		Company com = new Company("name");
		Department dep = new Department("UNB", com);
		Employee emp = new Employee("Rodrigo", 10000.0, 500.0, "manager", dep);
		Employee emp2 = emp;
		Employee emp3 = new Employee("Leomar", 5000.0, 200.0, "developer", dep);

		Compare verify = new Compare() {
			@Override
			public boolean compareEmployees(Employee e1, Employee e2) {
				if (e1.equals(e2)) {
					return true;
				}
				return false;
			}
		};

//		Compare verify = (e1, e2) -> e1.equals(e2);

		assertTrue(verify.compareEmployees(emp, emp2));
	}

}
