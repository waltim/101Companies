package br.unb.cic.companies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		employees.stream().forEach(e -> e.cutSalaries(percent));
		subdepts.stream().forEach(d -> cutSalaries(percent));
//		for(Employee e: employees) {
//			e.cutSalaries(percent);
//		}
//		
//		for(Department d: subdepts) {
//			d.cutSalaries(percent);
//		}
	}

	public List<Employee> employeeWithHighSalaries(double salary) {
		return employees.stream().filter(e -> e.getSalary() > salary).collect(Collectors.toList());
//		
//		List<Employee> res = new ArrayList<>();
//		for(Employee e: employees) {
//			if(e.getSalary() > salary) {
//				res.add(e);
//			}
//		}
//		return res;
	}

	public double totalSalary() {
		double sum = 0;
		double total = employees.stream().map(e -> e.totalSalary()).reduce(sum,Double::sum);
		total += subdepts.stream().map(d -> d.totalSalary()).reduce(sum,Double::sum);
//		double total = 0;
//		for(Employee e: employees) {
//			total += e.totalSalary();
//		}
//		
//		for(Department d: subdepts) {
//			total += d.totalSalary();
//		}
//		System.out.println(total);
		return total;
	}

}
