package col;

import java.util.*;


public class ArrayListEx {
public static void main(String[] args) {
	List<Integer> li =new LinkedList<>();
	li.add(3);
	li.add(5);
	li.add(4);
	li.add(9);
	li.add(7);
	Integer ele =li.get(0);
		System.out.println("Elements");
	ArrayListEx ex = new ArrayListEx();
	ex.print(li);
	li.remove(1);
	Object obj=3;
	li.remove(obj);
	ex.print(li);
	li.add(0,8);
	ex.print(li);
	int size = li.size();
	System.out.println("Size:"+size);
	boolean isEmpty = li.isEmpty();
	System.out.println("List contains elements:"+isEmpty);
	boolean isContains = li.contains(1);
	System.out.println("List contains 1:"+isContains);
	ex.printByIterator(li);
	IntegerComparator comparator = new IntegerComparator();
	System.out.println("Sorted List");
	li.sort(comparator);
	ex.print(li);
	
}

public void printByIterator(List<Integer> li) {
	Iterator<Integer> iterator = li.iterator();
	while(iterator.hasNext()) {
		//Object o= iterator.next();
		int num=iterator.next();
		System.out.println("elements:"+num);
	}
}


public void print(List<Integer> li) {
	for(Integer e: li) {
		int num=e;
		System.out.println(num);
	}
	System.out.println();
}

}
