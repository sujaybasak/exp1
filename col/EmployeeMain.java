package col;

import java.util.*;

public class EmployeeMain {
	
	public void print() {
		Set <Integer> keys =store.keySet();
		for(Integer id: keys) {
			Employee e= store.get(id);
			System.out.println(e.getName() +" "+e.getBalance());
			boolean isManager =e instanceof Manager;
			 if(isManager) {
				 Manager m = (Manager)e;
				 System.out.println("Managed Employee:");
				 Employee empl[] = m.getManagedEmployees();
				 for(Employee managed: empl) {
					if(managed != null) {
						System.out.println(managed.getName()+" "+managed.getBalance());
					}
				 }
			 }
			
		}
		
	}
	public Employee findById(int id) {
		Employee e=store.get(id);
		return e;
	}
	Map<Integer,Employee> store =new HashMap<>();
	public void execute() {
		Employee e1 = new Employee(1,"Sujay");
		Manager m1 = new Manager(2,"Sourav");
		e1.addSalary(500);
		m1.addSalary(1000);
		store.put(1,e1);
		store.put(2,m1);
		m1.addManagedEmployee(e1);
		print();
		Employee fetched =findById(2);
		System.out.println(fetched.getName());
		
	}
	
	public static void main(String[] args) {
		
		 EmployeeMain emp = new EmployeeMain();		
		emp.execute();
	}

}
