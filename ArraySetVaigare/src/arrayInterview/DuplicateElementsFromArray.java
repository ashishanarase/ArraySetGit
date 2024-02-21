package arrayInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsFromArray {

	public static void main(String[] args) {

		//Set Interface=Limitation Element can not be repeated more than two time
		int [] a = {1,2,3,1,2,3,1,2,3,4,5};	//Initialization & Declaration3

		System.out.println("Duplicate Values In Given Array");

		Set<Integer> s = new HashSet <> ();
		for (int num: a) {
			if (s.add(num)==false) {
				System.out.print(num+", ");
			}			
		}		
	}
}
