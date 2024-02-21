package vector;

import java.util.Vector;      //use for cross verificatin
class contains  
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		obj.add(12);
		obj.add(true);
		System.out.println(obj);
		System.out.println(obj.get(1));  //Access boolean based on index value
		System.out.println(obj.contains(12));  //cross verificatin integer value
	}
}
