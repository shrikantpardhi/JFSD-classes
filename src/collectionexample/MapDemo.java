package collectionexample;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("a", 1);
		numbers.put("v", 2);
		numbers.put("c", 3);
		numbers.put("d", 4);
		numbers.put("h", 5);
		numbers.put("a", 6);
		System.out.println(numbers);
		numbers.putIfAbsent("a", 8);
		System.out.println(numbers);
		System.out.println(numbers.get("a"));  // return key value
		System.out.println(numbers.getOrDefault("b", 15));
		System.out.println(numbers.containsKey("a"));  //return true
		System.out.println(numbers.containsKey("b"));   //return false
		System.out.println(numbers.containsValue(2));  //return true
		System.out.println(numbers.containsValue(15));   //return false
		numbers.remove("v");
		System.out.println(numbers);
		numbers.remove("c", 3);
		System.out.println(numbers);
		System.out.println(numbers.keySet());   //print set of key
		System.out.println(numbers.values());   //print set of values
		System.out.println(numbers.entrySet());
		numbers.replace("a", 20);
		System.out.println(numbers);
		
	}

}
