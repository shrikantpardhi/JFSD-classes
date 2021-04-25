package collectionexample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();

		// Add elements to the set1
		set1.add(2);
		set1.add(3);
		System.out.println("Set1: " + set1);
		
		Set<Integer> set2 = new HashSet<>();

        // Add elements
        set2.add(1);
        set2.add(2);
        set2.add(4);
        System.out.println("Set2: " + set2);

     // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);

     // Intersection of two sets
        set2.retainAll(set1);
        System.out.println("Intersection is: " + set2);
        
     // subset of two sets
        set2.containsAll(set1);
        System.out.println("Subset is: " + set2);
	}
}
