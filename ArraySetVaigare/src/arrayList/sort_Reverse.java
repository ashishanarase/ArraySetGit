package arrayList;

import java.util.ArrayList;      //sorting homogenous object 
import java.util.Collections;
class sort_Reverse  
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(2);
		obj.add(1); 
		obj.add(3);
		System.out.println(obj);

		Collections.sort(obj);      //sort()>>>>>>> Ascending 
		System.out.println(obj);

		Collections.reverse(obj);   //reverse()>>>>> Descending
		System.out.println(obj);
	}
}
