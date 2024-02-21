package treeset;

import java.util.TreeSet;    // remove():-remove same object inside the TreeSet
import java.util.ArrayList;
import java.util.Collections;
class remove_clear 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("Hello");
		obj.add(12);
		obj.add('G');
		System.out.println(obj);
		
	
		obj.remove("Hello");     // remove() 
		System.out.println(obj);

		obj.remove(0);           // remove()>> with help of index value  
		System.out.println(obj);

		obj.clear();             // clear()
		System.out.println();

		TreeSet H=new TreeSet(obj);
		System.out.println(H);

	}
}
