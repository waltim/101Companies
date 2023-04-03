package br.unb.cic.companies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Company implements Unit {

	private String name;
	private List<Department> departments;

	public Company(String name) {
		this.name = name;
		this.departments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void addDepartment(Department d) {
		departments.add(d);
	}


	public void cutSalaries(double percent) {
//		for(Department d: departments) {
//			d.cutSalaries(percent);
//		}
		departments.stream().forEach( d -> d.cutSalaries(percent));
	}

	public double totalSalary() {
		double total = 0;
//		for (Department d : departments) {
//			total += d.totalSalary();
//		}
//		return total;
		return departments.stream().mapToDouble(Department::totalSalary).sum();
	}

}
