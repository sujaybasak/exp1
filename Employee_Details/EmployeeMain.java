
public class EmployeeMain {
	
	public void print(Employee[] st) {
		for(int i=0;i<3;i++) {
			System.out.println("ID: "+ st[i].getId());
			System.out.println("Name: "+ st[i].getName());
			System.out.println("Balance: "+ st[i].getBalance());
			
			 if(st[i] instanceof Manager ) {
				 Manager e1 = new Manager();
				 e1=(Manager) st[i];
				 System.out.println("Manager name: "+e1.getName());
				 System.out.println("Managed Employee:");
				 Employee[] empl = e1.getManagedEmployees();
				 for(int k=0;k<empl.length;k++) {
					 System.out.println("Name:"+ empl[k].getName());
				 }
			 }
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Employee store[]= new Employee[3];
		
		 store[0]= new Employee(1,"Sujay");
		 store[1]= new Employee(2,"Maiti");
		 Manager e= new Manager(3,"Diptajit");
		 store[2]=e;
		 
		 store[0].addSalary(100);
		 store[1].addSalary(200);
		 store[2].addSalary(300);
		
		
		 EmployeeMain emp = new EmployeeMain();		
		
		 e.addManagedEmployee(store[0]);
		 e.addManagedEmployee(store[1]);
		 emp.print(store);
	}

}
