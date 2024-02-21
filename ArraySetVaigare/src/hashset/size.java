package hashset;

import java.util.HashSet;  // size() Count no of object inside the HashSet
class size 
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();    //1st
		obj.add("apple");
		obj.add("mango");
		obj.add("kiwi");
		System.out.println(obj);

		HashSet obj1=new HashSet();   //2nd
		obj1.add("chiku");
		obj1.add("orange");
		System.out.println(obj1);

		obj1.add(obj);   // Enter 1st object of HashSet add in 2nd HashSet
		System.out.println(obj1);

		System.out.println(obj1.size());  // size() method
	}
}
