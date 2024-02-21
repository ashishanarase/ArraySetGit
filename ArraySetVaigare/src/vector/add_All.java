package vector;

import java.util.Vector;    //Count the no object present inside the Vector   
class add_All  
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();    //1st object
		obj.add("apple");
		obj.add("mango");
		obj.add("kiwi");
		System.out.println(obj);

		Vector obj1=new Vector();    //2nd object
		obj1.add("chiku");
		obj1.add("orange");
		System.out.println(obj1);

		obj1.addAll(obj);       //one-one Object stored inside the another object
		System.out.println(obj1);
		System.out.println(obj1.size());  //size() method
	}
}
