package vector;

import java.util.Vector;                                      
class Note_1               
{                                
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		obj.add(20);   // 0     
		obj.add(35);   // 1  
		obj.add(11);   // 2
		System.out.println(obj);

		//obj.remove(11);             // Get>>>CTE
		//System.out.println(obj);

		obj.remove(2);         //Passing index value
		System.out.println(obj);
	}
}
//Note 1 :- when we try to remove integer object based on index value,compiler 
//      convert integer value into index value .
//     - integer object remove based on index value.