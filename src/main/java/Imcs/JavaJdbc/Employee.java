package Imcs.JavaJdbc;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int employeeID;
	private String empName;
	static String companyName;
	private int age;
	private int deptNo;
	private int salary;
	private String address;
	private String city;
	private String state;
	private String country;
	private int zipCode;
	private double phoneNumber;

	public Employee(int employeeID, String name, int age, int salary, String address, String city, String state,
			String country, double phoneNumber, int zipCode, int deptNo) {
		super();
		this.employeeID = employeeID;
		this.empName = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.deptNo = deptNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	Employee() {

	}

	Employee(Employee e) {
		employeeID = e.employeeID;
		empName = e.empName;
		this.age = e.age;
		this.salary = e.salary;
		this.address = e.address;
		this.city = e.city;
		this.state = e.state;
		this.country = e.country;
		this.zipCode = e.zipCode;
		this.phoneNumber = e.phoneNumber;

	}

	static {
		companyName = "XYZ";
	}
	{
		salary = 10000;
	}

	public int getemployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int compareTo(Employee e) {
		// TODO Auto-generated method stub

		if (salary > e.salary)
			return 1;
		if (salary < e.salary)
			return -1;
		if (empName.compareTo(e.empName) > 0)
			return 1;
		if (empName.compareTo(e.empName) < 0)
			return -1;

		return 0;
	}

	class EmployeeSalaryComparator implements Comparator<Employee> {

		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub

			if (e1.getSalary() > e2.getSalary())
				return 1;
			if (e1.getSalary() < e2.getSalary())
				return -1;

			return 0;
		}

	}

	class EmployeeDepartmentComparator implements Comparator<Employee> {

		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub

			if (e1.getDeptNo() > e2.getDeptNo())
				return 1;
			if (e1.getDeptNo() < e2.getDeptNo())
				return -1;
			return 0;
		}

	}

}
