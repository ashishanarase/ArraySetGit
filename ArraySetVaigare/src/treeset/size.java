package treeset;

import java.util.TreeSet;
import java.util.*; // size() Count no of object inside the TreeSet
class size 
{
	public static void main(String[] args) 
	{
		TreeSet obj=new TreeSet();    //1st
		obj.add("apple");
		obj.add("mango");
		obj.add("kiwi");                           //java.lang.ClassCastException:
		System.out.println(obj);

		TreeSet obj1=new TreeSet();   //2nd
		obj1.add("chiku");
		obj1.add("orange");
		System.out.println(obj1);

		obj1.add(obj);   // Enter 1st object of TreeSet add in 2nd TreeSet
		System.out.println(obj1);

		System.out.println(obj1.size());  // size() method
	}
}