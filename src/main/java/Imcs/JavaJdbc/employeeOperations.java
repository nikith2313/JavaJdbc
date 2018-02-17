package Imcs.JavaJdbc;

import java.util.List;

public interface employeeOperations {
	public void addEmployee(Employee e) throws EmployeeNotFoundException;

	public void deleteEmployee(int id) throws EmployeeNotFoundException;

	public void updateExistingEmployee(Employee e) throws EmployeeNotFoundException;

	public void displayEmployees(Employee e);

	public void displayAllEmployeesInfo();

	public StringBuilder displayEmp(Employee e);

}
