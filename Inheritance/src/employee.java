public class employee{
	private String name;
	private double salary;
	private String department;
	
	public employee (String name , double salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	
	public void Showinf () {
		System.out.println("Name : " + this.name);
		System.out.println("Salary : " + this.salary);
		System.out.println("Department : " + this.department);
	}
	
	
	
	//getter setters:
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}