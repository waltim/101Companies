package br.unb.cic.companies;

public class Employee implements Unit{
	private String name; 
	private double salary;
	private double bonus;
	private String office;
	private Department department;
	
	public Employee(String name, double salary, double bonus, String office, Department department) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.office = office;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public double getBonus() {
		return bonus;
	}
		
	public String getOffice() {
		return office;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void cutSalaries(double percent) {
		salary -= salary * percent / 100; 
	}
	
	public double totalSalary() {
		return salary + bonus; 
	}

}
