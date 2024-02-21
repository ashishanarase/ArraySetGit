package vector;

import java.util.Vector;     //use to remove not same object from the Vector                                   
class retain_All               
{                                
	public static void main(String[] args) 
	{
		Vector obj=new Vector();     //1st 
		obj.add("apple");
		obj.add("kiwi");
		System.out.println(obj);

		Vector obj1=new Vector();     //2nd 
		obj1.add("apple");
		obj1.add("grapes");
		System.out.println(obj1);

		obj1.retainAll(obj);        //retainAll()
		System.out.println(obj1);
	}
}
