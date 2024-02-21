package treeset;

import java.util.TreeSet; //contains():- use for cross verification
import java.util.ArrayList;
class Contains 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();   // TreeSet--->>>>ArrayList
		obj.add(12);
		obj.add(true);
		obj.add("kiwi");   
		System.out.println(obj);
		System.out.println(obj.get(0));  //index value
		System.out.println(obj.contains(12));
		
		TreeSet H=new TreeSet(obj);     //java.lang.ClassCastException: 
		System.out.println(H);


	}
}