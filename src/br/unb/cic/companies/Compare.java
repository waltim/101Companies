package br.unb.cic.companies;

@FunctionalInterface

public interface Compare {
	public boolean compareEmployees(Employee e1, Employee e2);
}
