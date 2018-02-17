package Imcs.JavaJdbc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeOperationsApp {
	static Scanner sc;
	private static final String CSV_SEPARATOR = ",";
	private EmployeeArrayOperationsImple eao;

	public EmployeeOperationsApp() {
		// TODO Auto-generated constructor stub
		eao = new EmployeeArrayOperationsImple();
	}

	public static void main(String[] args) {
		{
			EmployeeOperationsApp eoa = new EmployeeOperationsApp();

			/*
			 * try { FileReader fr=new
			 * FileReader("C:\\Users\\nikith kumar\\Desktop\\Employee.csv");
			 * BufferedReader br=new BufferedReader(fr);
			 * 
			 * String line =br.readLine(); while(line!=null){ String[] columns =
			 * line.split(","); int id=Integer.parseInt(columns[0]); String name
			 * = columns[1]; int age=Integer.parseInt(columns[2]); int
			 * salary=Integer.parseInt(columns[3]); String address = columns[4];
			 * String city = columns[5]; String state = columns[6]; String
			 * country = columns[7]; int zipCode=Integer.parseInt(columns[8]);
			 * int phoneNumber=Integer.parseInt(columns[9]); int
			 * deptNo=Integer.parseInt(columns[10]); Employee eadd = new
			 * Employee(id, name, age, salary, address, city, state, country,
			 * zipCode, phoneNumber,deptNo); eoa.addEmployee(eadd); line
			 * =br.readLine(); } br.close(); fr.close(); } catch
			 * (FileNotFoundException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (IOException e1) { // TODO
			 * Auto-generated catch block e1.printStackTrace(); }
			 */
			while (true) {
				System.out.print("\nWelcome to Employee APP\n" + "\nChoose an option:\n" + "1-Add Employee\n"
						+ "2-Delete Employee\n" + "3-Update Employee\n" + "4-Display an Employee Details\n"
						+ "5-Display all Employee Details\n" + "6-Calculate HRA of an  Employee\n"
						+ "7-Calculate Gross Salary of an  Employee\n" + "8-Sort Employees by Salary\n"
						+ "9-Sort Employees by Department\n" + "10-Sort Employees by Name and Salary\n"
						+ "11-Sort Employees by Id\n" + "12-Highest salary Iterator\n" + "13-Exit program\n");

				sc = new Scanner(System.in);
				int choice = sc.nextInt();
				if (choice <= 13) {
					switch (choice) {

					case 1:
						eoa.addEmployeeOption();
						break;
					case 2:
						eoa.deleteAnEmployee();
						break;

					case 3:
						eoa.updateAnEmployee();
						break;
					case 4:
						eoa.displayANEmployeeDetails();
						break;
					case 5:

						eoa.displayAllEmployeesInfo();
						;
						break;
					case 6:
						eoa.calculateTheHra();
						break;
					case 7:
						eoa.calculateTheGrossSalary();
						break;

					case 8:
						// Collections.sort(eoa.eao.al,new Employee().new
						// EmployeeSalaryComparator());
						eoa.eao.sortBy("salary");
						break;
					case 9:
						// Collections.sort(eoa.eao.al,new Employee().new
						// EmployeeDepartmentComparator());
						eoa.eao.sortBy("Department");
						break;
					case 10:
						// Collections.sort(eoa.eao.al);
						eoa.eao.sortBy("Namesalary");
						break;
					case 11:
						// Collections.sort(eoa.eao.al,new
						// Comparator<Employee>(){
						eoa.eao.sortBy("Id");
						// @Override
						/*
						 * public int compare(Employee o1, Employee o2) { //
						 * TODO Auto-generated method stub
						 * if(o1.getDeptNo()>o2.getDeptNo()) return 1;
						 * if(o1.getDeptNo()<o2.getDeptNo()) return -1; return
						 * 0; }
						 * 
						 * });
						 */
						break;
					case 12:
						System.out.println("Enter Highest salary");
						int salary = sc.nextInt();
						eoa.eao.highestSalary(salary);
						// System.out.println("Enter the highest salary");
						// int highestsalary=sc.nextInt();
						// eoa.eao.getHighestSalary(highestsalary);
						break;

					case 13:
						eoa.exitProgram();
						break;

					default:
						System.out.println("Please choose a valid Choise");
						break;

					}
				}
			}

		}

	}

	private void displayAllEmployeesInfo() {
		// TODO Auto-generated method stub
		eao.displayAllEmployeesInfo();
	}

	private void calculateTheGrossSalary() {
		// TODO Auto-generated method stub
		System.out.println("Enter an Employee ID");
		int employeeId = sc.nextInt();
		Employee e = new Employee();
		e.setEmployeeID(employeeId);
		eao.displayEmployeesGrossSalary(e);
	}

	private void exitProgram() {
		// TODO Auto-generated method stub

		/*
		 * List<Employee> emp=eao.getAllEmployees(); try { FileOutputStream
		 * fout= new
		 * FileOutputStream("C:\\Users\\nikith kumar\\Desktop\\Emp1.csv");
		 * BufferedWriter buffer = new BufferedWriter(new
		 * OutputStreamWriter(fout)); for(Employee obj:emp){
		 * System.out.println(obj.getemployeeID()); StringBuffer oneLine = new
		 * StringBuffer(); oneLine.append(eao.displayEmp(obj));
		 * buffer.write(oneLine.toString()); buffer.newLine();
		 * 
		 * } buffer.close(); System.exit(8); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	private void deleteAnEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter an Employee ID");
		int employeeId = sc.nextInt();
		try {
			eao.deleteEmployee(employeeId);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Employee is deleted");
	}

	private void updateAnEmployee() {
		// TODO Auto-generated method stub

		System.out.println("1)Do you want to update Employee Name");
		System.out.println("2)Do you want to update Employee Salary");
		System.out.println("3)Do you want to update Employee Age");
		System.out.println("4)Do you want to update Employee Address");
		System.out.println("5)Do you want to update Employee PhoneNumber");
		int input = sc.nextInt();
		switch (input) {

		case 1:

			updateEmployeeName();
			break;
		case 2:

			updateEmployeeSalary();
			break;
		case 3:

			updateEmployeeAge();
			break;
		case 4:

			updateEmployeeAddress();
			break;
		case 5:

			updatEmployeePhoneNumber();
			break;
		default:
			System.out.println("Make a Valid Choise");
		}

	}

	private void updateEmployeeAddress() {
		// TODO Auto-generated method stub

		System.out.println("Enter Employee ID ");
		int empID = sc.nextInt();
		System.out.println("Enter the Address of the Employee");
		String updateAddress = sc.next();
		System.out.println("Enter the city of the Employee");
		String updateCity = sc.next();
		System.out.println("Enter the state of the Employee");
		String updateState = sc.next();
		System.out.println("Enter the Country of the Employee");
		String updateCountry = sc.next();
		System.out.println("Enter the Zip of the Employee");
		int updateZip = sc.nextInt();
		Employee e = new Employee();
		e.setAddress(updateAddress);
		e.setCity(updateCity);
		e.setState(updateState);
		e.setCountry(updateCountry);
		e.setZipCode(updateZip);
		e.setEmployeeID(empID);
		try {
			eao.updateExistingEmployee(e);
		} catch (EmployeeNotFoundException ea) {
			ea.printStackTrace();
		}
	}

	private void updatEmployeePhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID ");
		int empID = sc.nextInt();
		System.out.println("Enter the PhoneNumber of the Employee");
		int updatePhoneNumber = sc.nextInt();
		Employee e = new Employee();
		e.setEmployeeID(empID);
		e.setPhoneNumber(updatePhoneNumber);
		EmployeeArrayOperationsImple eao = new EmployeeArrayOperationsImple();
		try {
			eao.updateExistingEmployee(e);
		} catch (EmployeeNotFoundException f) {
			f.printStackTrace();
		}
	}

	private void updateEmployeeAge() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID ");
		int empID = sc.nextInt();
		System.out.println("Enter the Age of the Employee");
		int updateAge = sc.nextInt();
		Employee e = new Employee();
		e.setAge(updateAge);
		e.setEmployeeID(empID);
		try {
			eao.updateExistingEmployee(e);
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void updateEmployeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID ");
		int empID = sc.nextInt();
		System.out.println("Enter the Updated Salary of the Employee");
		int updateSalary = sc.nextInt();
		Employee e = new Employee();
		e.setEmployeeID(empID);
		e.setSalary(updateSalary);

		try {
			eao.updateExistingEmployee(e);
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void updateEmployeeName() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID ");
		int empID = sc.nextInt();

		System.out.println("Enter the Name of the Employee");
		String updateName = sc.next();
		Employee e = new Employee();
		e.setEmployeeID(empID);
		e.setName(updateName);
		try {
			eao.updateExistingEmployee(e);
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private void displayANEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee ID ");
		int employeeID = sc.nextInt();
		Employee e = new Employee();

		e.setEmployeeID(employeeID);
		EmployeeArrayOperationsImple eao = new EmployeeArrayOperationsImple();
		eao.displayEmployees(e);
	}

	private void calculateTheHra() {
		// TODO Auto-generated method stub
		System.out.println("Enter an Employee ID");
		int employeeId = sc.nextInt();
		Employee e = new Employee();
		e.setEmployeeID(employeeId);
		eao.displayEmployeesHra(e);
	}

	/*
	 * private void addEmployee(Employee e){ try { eao.addEmployee(e); } catch
	 * (InvalidSalaryException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); } catch (EmployeeNotFoundException e1) { // TODO
	 * Auto-generated catch block e1.printStackTrace(); } }
	 */
	private void addEmployeeOption() {
		System.out.println("Enter an Employee ID");
		int Employeeid = sc.nextInt();
		System.out.println("Enter Name of the Employee");
		String name = sc.next();
		System.out.println("Enter Age of the Employee");
		int age = sc.nextInt();
		System.out.println("Enter Salary of the Employee");
		int salary = sc.nextInt();
		System.out.println("Enter PhoneNumber of the Employee");
		Double PhoneNumber = sc.nextDouble();

		System.out.println("Enter the Address of the Employee");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the Country");
		String country = sc.next();
		System.out.println("Enter the Zip Code");
		int zipCode = sc.nextInt();
		System.out.println("Enter the DeptartmentNumber");
		int deptNo = sc.nextInt();
		Employee eadd = new Employee(Employeeid, name, age, salary, address, city, state, country, PhoneNumber, zipCode,
				deptNo);

		try {
			eao.addEmployee(eadd);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Exception raised");
		}

		System.out.println("Employee has been added");

	}

}
