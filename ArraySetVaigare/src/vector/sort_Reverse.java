package vector;

import java.util.Vector;      //sorting homogenous object 
import java.util.Collections;
class sort_Reverse  
{
	public static void main(String[] args) 
	{
		Vector<Integer> obj=new Vector<Integer>();
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
