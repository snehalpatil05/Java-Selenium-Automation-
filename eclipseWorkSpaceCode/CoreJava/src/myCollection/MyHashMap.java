package myCollection;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>(); // create object
		map.put(11, "Asha");     // it is a key , value.
		map.put(22, "Usha");
		map.put(33, "Nisha");
		map.put(44, "Anisha");
		map.put(33, "Misha");
		
		int mapSize = map.size();
		System.out.println(mapSize);  // Size of the HashMap 
		
		System.out.println(map.get(33)); // using value also we can access
		
		for (Map.Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey()+" : "+item.getValue());  //11 : Asha
		}
	}
	
}


// Are duplicate values allowed in HashMap? -> Yes
// Are duplicate Key allowed in HashMap? -> Yes, but it overrides the existing value.
// Hence, the Key should be unique in Hashmap
// Is insertion order maintained in HashMap? -> No