package vector;

import java.util.Vector;         //Nature of Vector
                                    // 1) we can store duplicat data
class Nature_Of_ArrayList          // 2) insertion order mains FOFO concept
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(true);
		obj.add(true);
		obj.add("Hello");
		obj.add("Hello");
		System.out.println(obj);
	}
}