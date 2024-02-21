package arrayInterview;

import java.util.ArrayList;

public class Occurance_of_Integer_Count_in_ArrayList {
	
	    public static void main(String[] args) {
	        
	        // create an ArrayList
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        // add some integers to the ArrayList
list.add(3);list.add(7);list.add(4);list.add(3);list.add(1);list.add(9);list.add(3);list.add(8);
	       // specify the integer to count
	        int num = 3;
	        
	        // loop through the ArrayList and count the occurrences of the integer
	        int count = 0;
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i) == num) {
	                count++;
	            }
	        }	        
	        // print the result
	        System.out.println("The integer " + num + " appears " + count + " times in the ArrayList.");
	    }

	}
