package arrayList;

import java.util.ArrayList;       //Add object inside the ArrayList
class add  
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
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
