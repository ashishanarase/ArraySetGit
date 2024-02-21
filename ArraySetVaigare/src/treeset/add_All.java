package treeset;

import java.util.TreeSet;  //add_All() take one one Element and stored Another TreeSet
class add_All 
{
	public static void main(String[] args) 
	{
		TreeSet obj=new TreeSet();    //1st
		obj.add("apple");
		obj.add("mango");
		obj.add("kiwi");
		System.out.println(obj);

		TreeSet obj1=new TreeSet();   //2nd
		obj1.add("chiku");
		obj1.add("orange");
		System.out.println(obj1);

		obj1.addAll(obj);     //addAll()
		System.out.println(obj1);

		System.out.println(obj1.size());
	}
}