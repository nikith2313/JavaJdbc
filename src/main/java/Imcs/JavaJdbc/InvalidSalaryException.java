package Imcs.JavaJdbc;

public class InvalidSalaryException extends RuntimeException {

	InvalidSalaryException(String s) {
		super(s);
		System.out.println("Salary should greater than 5000 ");
	}
}
