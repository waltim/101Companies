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

	public Employee managerForSpecificDepartment(Department department) {
		Department dep = departments.stream().filter(d -> d.equals(department)).findFirst().orElse(null);
		return dep.getEmployees().stream().filter(e -> e.getOffice().equals("manager")).findFirst().orElse(null);
//		Employee manager = null;
//		for (Department d : departments) {
//			if (d.equals(department)) {
//				for (Employee e : d.getEmployees()) {
//					if (e.getOffice() == "manager") {
//						manager = e;
//						break;
//					}
//				}
//			}
//		}
//		return manager;
	}

	public void cutSalaries(double percent) {
		departments.stream().forEach(d -> cutSalaries(percent));
//		for(Department d: departments) {
//			d.cutSalaries(percent);
//		}
	}

	public double totalSalary() {
		double total = departments.stream().map(e -> e.totalSalary()).reduce(Double::sum).get();
//		double total = 0;
//		for (Department d : departments) {
//			total += d.totalSalary();
//		}
		return total;
	}

}
