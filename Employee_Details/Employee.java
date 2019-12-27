
public class Employee {
	private int id;
	private String name;
	public Employee() {
		
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private double balance=1000;
	public double getBalance() {
		return balance;
	}
	public void addSalary(double salary) {
		balance+=salary;
	}
	

}
