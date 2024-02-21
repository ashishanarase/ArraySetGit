package hashset;

import java.util.HashSet;  //add_All() take one one Element and stored Another HashSet
class add_All 
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

		obj1.addAll(obj);     //addAll()
		System.out.println(obj1);

		System.out.println(obj1.size());
	}
}