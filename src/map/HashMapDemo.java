package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for(int i = 0; i < 10; i++) {
			map.put(i, String.valueOf(i));
		}
		System.out.println(map.keySet());
		System.out.println(map.remove(5));
		System.out.println(map.keySet());
	}
}