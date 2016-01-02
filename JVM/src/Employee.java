
public class Employee {
	private int empId;
	private int name;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		System.out.println("integer");
		this.empId = empId;
	}
	public void setEmpId(double empId) {
	System.out.println("double");
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}

}
