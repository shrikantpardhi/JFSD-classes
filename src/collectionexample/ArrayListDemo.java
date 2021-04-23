package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		
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
		
		list1.forEach(ele -> System.out.println(ele));
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
	}

}
