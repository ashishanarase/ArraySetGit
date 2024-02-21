package vector;

import java.util.Vector;                                      
class Note_2               
{                                
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		obj.add(20);   // 0     
		obj.add(35);   // 1  
		obj.add(11);   // 2
		System.out.println(obj);

		obj.remove(2);               //passing index value
		System.out.println(obj);

		obj.remove(Integer.valueOf(35));   //valueOf()
		System.out.println(obj);
	}
}
//Note 2:- remove integer value based on value with help of valueOf() method >>>(wrapper class)