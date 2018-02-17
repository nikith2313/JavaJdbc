package Imcs.JavaJdbc;

public class EmployeeUtill {
	static Employee toGetOlderEmployee(Employee e1, Employee e2) {
		Employee e;
		if (e1.getAge() > e2.getAge()) {
			return e = e1;

		} else {
			return e = e2;
		}

	}

	static Employee toGetUpdatedSalary(Employee e) {
		if (e.getSalary() < 10000 && e.getAge() > 35) {
			e.setSalary(((e.getSalary() * 15) / 100) + e.getSalary());
			return e;
		} else if (e.getSalary() < 15000 && e.getAge() > 45) {
			e.setSalary(((20 * e.getSalary()) / 100) + e.getSalary());
			return e;
		} else if (e.getSalary() < 20000 && e.getAge() > 55) {
			e.setSalary(((25 * e.getSalary()) / 100) + e.getSalary());
			return e;
		} else {
			System.out.println("Employee Salary is not updated as it is not matching the requirements");
			return e;

		}
	}

	static void calculateDaHraGrossSalary(Employee e) {

		if (e.getSalary() < 10000) {
			int da = 8 * e.getSalary() / 100;
			int hra = 15 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			System.out.println("Gross salary of an Employee is :" + grossSalary + "DA of an Employee" + da
					+ "HRA of an Employee" + hra);
		} else if (e.getSalary() < 20000) {
			int da = 10 * e.getSalary() / 100;
			int hra = 20 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			System.out.println("Gross salary of an Employee is :" + grossSalary + "DA of an Employee" + da
					+ "HRA of an Employee" + hra);
		} else if (e.getSalary() < 30000 && e.getAge() >= 40) {
			int da = 15 * e.getSalary() / 100;
			int hra = 27 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			System.out.println("Gross salary of an Employee is :" + grossSalary + "DA of an Employee" + da
					+ "HRA of an Employee" + hra);
		} else if (e.getSalary() < 30000 && e.getAge() < 40) {
			int da = 13 * e.getSalary() / 100;
			int hra = 25 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			System.out.println("Gross salary of an Employee is :" + grossSalary + "DA of an Employee" + da
					+ "HRA of an Employee" + hra);
		} else {
			int da = 17 * e.getSalary() / 100;
			int hra = 30 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			System.out.println("Gross salary of an Employee is :" + grossSalary + "DA of an Employee" + da
					+ "HRA of an Employee" + hra);
		}
	}

	public static int calculateHra(Employee e) {

		if (e.getSalary() < 10000) {

			int hra = 15 * e.getSalary() / 100;
			return hra;

		} else if (e.getSalary() < 20000) {
			int hra = 20 * e.getSalary() / 100;
			return hra;

		} else if (e.getSalary() < 30000 && e.getAge() >= 40) {

			int hra = 27 * e.getSalary() / 100;
			return hra;

		} else if (e.getSalary() < 30000 && e.getAge() < 40) {

			int hra = 25 * e.getSalary() / 100;
			return hra;
		} else {

			int hra = 30 * e.getSalary() / 100;

			return hra;
		}
	}

	public static int calculateGrossSalary(Employee e) {

		if (e.getSalary() < 10000) {
			int da = 8 * e.getSalary() / 100;
			int hra = 15 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			return grossSalary;
		} else if (e.getSalary() < 20000) {
			int da = 10 * e.getSalary() / 100;
			int hra = 20 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			return grossSalary;
		} else if (e.getSalary() < 30000 && e.getAge() >= 40) {
			int da = 15 * e.getSalary() / 100;
			int hra = 27 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			return grossSalary;
		} else if (e.getSalary() < 30000 && e.getAge() < 40) {
			int da = 13 * e.getSalary() / 100;
			int hra = 25 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			return grossSalary;
		} else {
			int da = 17 * e.getSalary() / 100;
			int hra = 30 * e.getSalary() / 100;
			int grossSalary = e.getSalary() + da + hra;
			return grossSalary;
		}
	}

}
