package hashset;

import java.util.HashSet;   
import java.util.ArrayList;
import java.util.Collections;
class Note_2 
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();
		obj.add(20);
		obj.add(35);
		obj.add(11);
		System.out.println(obj);
                              
		
		obj.remove(1);      //index value
		System.out.println(obj);

		obj.remove(Integer.valueOf(35));
		System.out.println(obj);
	}
}
//Note 2:- remove integer value based on value with help of valueOf() method >>>(wrapper class)