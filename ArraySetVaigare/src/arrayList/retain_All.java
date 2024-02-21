package arrayList;

import java.util.ArrayList;     //use to remove not same object from the ArrayList                                   
class retain_All               
{                                
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();     //1st 
		obj.add("apple");
		obj.add("kiwi");
		System.out.println(obj);

		ArrayList obj1=new ArrayList();     //2nd 
		obj1.add("apple");
		obj1.add("grapes");
		System.out.println(obj1);

		obj1.retainAll(obj);        //retainAll()
		System.out.println(obj1);
	}
}
