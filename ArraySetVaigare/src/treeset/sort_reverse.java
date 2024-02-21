package treeset;

import java.util.TreeSet;   
import java.util.ArrayList;
import java.util.Collections;
class sort_reverse 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(3);
		obj.add(1);
		obj.add(2);
		System.out.println(obj);
		
        TreeSet H=new TreeSet(obj);

		Collections.sort(obj);   //sort():- Ascending order
		System.out.println(obj);

		Collections.reverse(obj); //reverse():- Dscending order
		System.out.println(obj);
	}
}