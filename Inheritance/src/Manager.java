public class Manager extends employee {
	private int incharge ;

	
	public Manager(String name,double salary,String department,int incharge) {
        super(name,salary,department);
        this.incharge = incharge;
        
    }
	
	public void Showinf() {
		super.Showinf();
		System.out.println("In-charge : " + this.incharge);
		
	}
	public void wageincrease (employee employee, int amount) {
		System.out.println("do wage increase");
		employee.setSalary(amount + employee.getSalary());
	}
	
}