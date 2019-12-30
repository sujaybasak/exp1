package exception;

import col.Employee;

public class ExceptionEx {
private Employee employee;
public static void main(String[] args) {
	ExceptionEx ex = new ExceptionEx();
	try {
	ex.execute2();
	}
	catch(IncorrectIdException exception) {
		System.out.println("id was incorrect");
	}
	catch(Exception e) {
		System.out.println("Something went wrong");
	}
	finally {
		System.out.println("I always get executed");
	}
	System.out.println("After execute main");
}
public void execute() {
	try {
		throw new NullPointerException();
		
	}
	catch(Throwable e) {
		//e.printStackTrace();
		System.out.println("handeled exception");
	}
}
public void execute1() {
	RuntimeException e = new IncorrectIdException("Id cant be null");
	throw e;
}
public void execute2() throws Exception {
	if (employee.getId()<0) {
		Exception exception = new IncorrectIdException("id cant be negetive");
		throw exception;
	}
}
}
