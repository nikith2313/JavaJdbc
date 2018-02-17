package Imcs.JavaJdbc;

public enum Department {
	SALES(10), PURCHASE(20), ADMINISTRATION(30), RESEARCH(40);

	int values;

	Department(int values) {
		this.values = values;
	}

	static void displayDepartment(int input) {
		for (Department deptEnm : Department.values()) {
			if (deptEnm.getValues() == input) {
				System.out.println("The Department Name is :" + deptEnm);
			} else {
				System.out.println("The Department does not exist");
			}
		}

	}

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}
}