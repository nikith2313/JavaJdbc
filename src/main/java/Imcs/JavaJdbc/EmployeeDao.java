package Imcs.JavaJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
	private Connection con;

	public EmployeeDao() {
		con = DBConnection.getConnection();
	}

	public boolean employeeInsert(Employee e) {
		try {
			PreparedStatement pst = con.prepareStatement("insert into employees VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, e.getemployeeID());
			pst.setString(2, e.getName());
			pst.setInt(3, e.getAge());
			pst.setInt(4, e.getSalary());
			pst.setString(5, e.getAddress());
			pst.setString(6, e.getCity());
			pst.setString(7, e.getState());
			pst.setString(8, e.getCountry());
			pst.setString(9, Employee.getCompanyName());
			pst.setDouble(10, e.getPhoneNumber());
			pst.setInt(11, e.getZipCode());
			pst.setInt(12, e.getDeptNo());
			pst.execute();
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;

	}

	public boolean deleteEmployee(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("delete from employees where employeeId=?");
			pst.setInt(1, e);
			if (pst.executeUpdate() == 1) {
				return true;
			} else
				return false;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

		return false;
	}

	public boolean updateAnEmployee(Employee e) {
		try {
			PreparedStatement pst = con
					.prepareStatement("update  employees SET empName=?,empSalary=?,empAge=? where employeeId=?");
			pst.setString(1, e.getEmpName());
			pst.setInt(1, e.getSalary());
			pst.setInt(1, e.getAge());
			if (pst.executeUpdate() == 1) {
				return true;
			} else
				return false;

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

		return false;
	}

	public Employee DisplayAnEmployee(Employee e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e.getEmployeeID());
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));

			}
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> DisplayAllEmployee() {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees");
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(10), rs.getInt(11),
						rs.getInt(12));
				user.add(u);
			}
			return user;

		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> sortAllEmployee(String sortBy) {

		try {
			PreparedStatement pst = null;
			if (sortBy.equalsIgnoreCase("Namesalary"))
				pst = con.prepareStatement("select * from employee ORDER BY empName,empSalary");
			else if (sortBy.equalsIgnoreCase("salary"))
				pst = con.prepareStatement("select * from employee ORDER BY empSalary");
			else if (sortBy.equalsIgnoreCase("ID"))
				pst = con.prepareStatement("select * from employee ORDER BY empId");
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));
				user.add(u);
			}
			return user;

		} catch (Exception e) {
			e.getMessage();
			return null;
		}

	}

	public Employee calculateHra(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));

			}
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public Employee calculateGrossSalary(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where employeeId=?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));

			}
			return u;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

	public ArrayList<Employee> calculateHighSalary(int e) {
		try {
			PreparedStatement pst = con.prepareStatement("select * from employees where empSalary>?");
			pst.setInt(1, e);
			pst.execute();
			Employee u = null;
			ResultSet rs = pst.getResultSet();
			ArrayList<Employee> user = new ArrayList<Employee>();
			while (rs.next()) {
				u = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getInt(10),
						rs.getInt(11));
				user.add(u);
			}
			return user;

		} catch (Exception e1) {
			e1.getMessage();
			return null;
		}
	}

}
