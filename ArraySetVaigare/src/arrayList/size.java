package arrayList;

import java.util.ArrayList;    //Count the no object present inside the ArrayList   
class size  
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

		obj1.add(obj);      //Entire object stored in another object
		System.out.println(obj1);
		System.out.println(obj1.size());  //size() method
	}
}
