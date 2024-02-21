package arrayInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements3 {

	public static void main(String[] args) {
		//Using HashTable	
		int [] a = {1,2,3,1,2,3,1,2,3,4,5};	//Initialization & Declaration3
		System.out.println("Duplicate Values In Given Array");
		Map <Integer, Integer> hm = new HashMap <> ();
		for (int num : a) {
			Integer count = hm.get(num);
			if (count == null) {
				hm.put(num, 1);
			}
			else {
				count=count+1;
				hm.put(num, count);
			}
		}
			Set<Map.Entry<Integer, Integer>> es=hm.entrySet();
			for (Map.Entry<Integer, Integer> me :es) {
				if (me.getValue()>1) {
					System.out.print(me.getKey()+ ", ");
				}
			}
		}
	}

