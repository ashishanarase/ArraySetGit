package arrayInterview;

import java.util.HashMap;

public class UniqueData {

	public static void main(String[] args) {
		
		int [] arr = {10,7,1,2,2,6,2,3,4,5,4,6};
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i=0; i<arr.length-1;i++) {
			if (map.containsKey(arr[i])) {
				map.remove(arr[i]);
			}
			map.put(arr[i], i);
		}
		map.forEach((k,v)-> System.out.print(k+" "));
	}
}
