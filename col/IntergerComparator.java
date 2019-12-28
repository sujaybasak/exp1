package col;

import java.util.Comparator;

 class IntegerComparator implements Comparator<Integer> {
	
	
	public int compare(Integer num1,Integer num2) {
	
	if(num1>num2) {
		return 1;
	}
	if(num1<num2) {
		return -1;
	}
	return 0;
	
}


}
