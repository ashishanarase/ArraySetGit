package vector;

import java.util.Vector;       //Add object inside the Vector
class add  
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(12);
		obj.add(true);
		obj.add("Hello");
		obj.add('H');
		System.out.println(obj);
		System.out.println(obj.isEmpty());
	}
}
