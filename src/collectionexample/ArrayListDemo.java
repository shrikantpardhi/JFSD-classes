package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list1 = new Vector<>();
		
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		System.out.println(list1.remove(2));
		System.out.println(list1);
		System.out.println(list1.contains(8));
		
		Iterator<Integer> itr = list1.iterator();
		
//		for (Iterator<Integer> iter = list1.iterator(); iter.hasNext(); ) {
//			System.out.println(iter.next());
//		}
		
		//lambda function| anonymous statement
		list1.forEach(ele -> System.out.println(ele));
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}

}
