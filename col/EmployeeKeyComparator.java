package col;

import java.util.Comparator;

public class EmployeeKeyComparator implements Comparator<Integer> {
public int compare(Integer o1,Integer o2) {
		
		if(o1>o2) {
			return 1;
		}
		if(o2>o1) {
			return -1;
		}
		return 0;

}
}


