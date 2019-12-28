package col;
import java.util.*;
public class MapEx {
	public static void main(String[] args) {
		Map<Integer,Employee> map =new HashMap<>();
		Employee e1 = new Employee(1,"Sujay");
		Employee e2 = new Employee(2,"Sourav");
		Employee e3 = new Employee(3,"Neeraj");
		map.put(1, e1);
		map.put(2,e2);
		map.put(3,e3);
		Employee fetched1 =map.get(1);
		Employee fetched2 =map.get(2);
		Employee fetched3 =map.get(3);
		
		MapEx ex =new MapEx();
		ex.print(map);
		map.remove(2);
		ex.print(map);
	}
	public void print(Map<Integer,Employee> map) {
		Set<Integer> keys =map.keySet();
		for(int key :keys) {
			Employee value = map.get(key);
			System.out.println(value.getId()+" "+value.getName());
		}
		System.out.println();
	}

}
