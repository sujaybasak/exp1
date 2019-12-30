package col;

public class Student {
	private int id;
	private String name;
	
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
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null ||!(obj instanceof Student )) {
			return false;
		}
		Student e = (Student) obj;
		
			return e.id ==this.id;
	}
	
	@Override
	public int hashCode(){
		return id;
	}
}
