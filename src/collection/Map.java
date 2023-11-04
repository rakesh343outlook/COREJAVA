package collection;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Item1", 100);
		map1.put("Item2", 200);
		map1.put("Item3", 100);
		map1.put("Item4", 50);
		
		System.out.println(map1);
		
		// update the value of already present item
		map1.put("Item3", 300);
		System.out.println(map1);
		
		// find the price of item4 from map
		System.out.println("price of item4 is " + map1.get("Item4"));
		
		// remove item2 from the map
		map1.remove("Item2");
		System.out.println(map1);

	

	//iterate through map
			for(int value:map1.values()) {
				
				System.out.println("value is " + value);
			}
			
			for(String key:map1.keySet()) {
				
				System.out.println("The key is " + key);
				System.out.println("The value is " + map1.get(key));
			}


			String str1 = "clean world green world happy world";
			
			 
			 
			 
		        // Splitting the words of string
		        // and storing them in the array.
		        String[] words = str1.split(" ");
		 
		        for (String word : words) {
		 
		            // Asking whether the HashMap contains the
		            // key or not. Will return null if not.
		            Integer integer = map1.get(word);
		 
		            if (integer == null)
		                // Storing the word as key and its
		                // occurrence as value in the HashMap.
		                map1.put(word, 1);
		 
		            else {
		                // Incrementing the value if the word
		                // is already present in the HashMap.
		                map1.put(word, integer + 1);
		            }
		        }
		        System.out.println(map1);
	}
}
