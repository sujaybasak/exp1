package col;

import java.util.*;

public class SetEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Sujay");
		Employee e2 = new Employee(2,"Maiti");
		Employee e3 = new Employee(7,"Neeraj");
		Employee e4 = new Employee(1,"Sujay");
		Employee e5 = new Employee(3,"Diptait");
		boolean same =e1==e4;
		System.out.println("e1 and e4 same: "+same);
		boolean equals =e1.equals(e4);
		System.out.println("e1.equals(e4): "+equals);
		Comparator<Employee> comparator = new EmployeeComparator();
	//	Set<Employee> set = new HashSet();
	//	Set<Employee> set = new LinkedHashSet<>();
		Set<Employee> set = new TreeSet<>(comparator);
		set.add(e1);
		set.add(e3);
		set.add(e2);
		set.add(e4);
		set.add(e5);
		int size = set.size();
		System.out.println("size="+size);
		boolean contains =set.contains(e2);
		System.out.println("set contains e2:"+contains);
		SetEx ex = new SetEx();
		ex.print(set);
		boolean removed =set.remove(e2);
		System.out.println("removed: "+removed);
		ex.print(set);
		
	}
	//public void print2(Set set) {
		//for(Object o:set) {
		//	Employee e =(Employee) o;
		//	System.out.println(e.getId()+" "+e.getName());
		//}
//	}
	public void print(Set<Employee> set) {
		for(Employee o:set) {
			Employee e =(Employee) o;
			System.out.println(e.getId()+" "+e.getName());
		}
	}
}