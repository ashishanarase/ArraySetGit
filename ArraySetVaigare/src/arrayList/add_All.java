package arrayList;

import java.util.ArrayList;    //Count the no object present inside the ArrayList   
class add_All  
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();    //1st object
		obj.add("apple");
		obj.add("mango");
		obj.add("kiwi");
		System.out.println(obj);

		ArrayList obj1=new ArrayList();    //2nd object
		obj1.add("chiku");
		obj1.add("orange");
		System.out.println(obj1);

		obj1.addAll(obj);       //one-one Object stored inside the another object
		System.out.println(obj1);
		System.out.println(obj1.size());  //size() method
	}
}
