package treeset;

import java.util.TreeSet;   
import java.util.ArrayList;
import java.util.Collections;
class Note_1 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(20);
		obj.add(35);
		obj.add(11);
		System.out.println(obj);
                              
		
		obj.remove(1);      //index value
		System.out.println(obj);

		TreeSet H=new TreeSet(obj);
		System.out.println(H);
		
	}
}
//Note:- when we try to remove integer object based on index value,compiler 
//      convert integer value into index value .
//     - integer object remove based on index value.