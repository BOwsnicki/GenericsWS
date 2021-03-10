package types.errors;

class Employee { 
	private String name;
	private String department;
		
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

public class TypeError1 {
	public static void main(String[] args) {
		int x = 2,y = 3;
		Employee e1 = new Employee("Hugo","Sales"),
				 e2 = new Employee("Helga","Management");
		
		System.out.println(x + y);
		System.out.println(e1 + e2);
		
		System.out.println(e1.getName());
		System.out.println(x.getName());		
	}
}
