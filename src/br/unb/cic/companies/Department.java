package br.unb.cic.companies;

import java.util.ArrayList;
import java.util.List;

public class Department implements Unit {

	private String name;
	private List<Department> subdepts;
	private List<Employee> employees;
	private Company company;

	public Department(String name, Company company) {
		this.name = name;
		this.company = company;
		subdepts = new ArrayList<>();
		employees = new ArrayList<>();
	}

	public void addDepartment(Department d) {
		subdepts.add(d);
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public List<Employee> getEmployees() {
		return employees;
	}


	public void cutSalaries(double percent) {
		for(Employee e: employees) {
			e.cutSalaries(percent);
		}

		for(Department d: subdepts) {
			d.cutSalaries(percent);
		}
	}

	public double totalSalary() {
		double total = employees.stream().mapToDouble(Employee::totalSalary).sum();
		total += subdepts.stream().mapToDouble(Department::totalSalary).sum();
		return total;
	}

}
