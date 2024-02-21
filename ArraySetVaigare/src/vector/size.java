package vector;

import java.util.Vector;    //Count the no object present inside the Vector   
class size  
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

		obj1.add(obj);      //Entire object stored in another object
		System.out.println(obj1);
		System.out.println(obj1.size());  //size() method
	}
}
