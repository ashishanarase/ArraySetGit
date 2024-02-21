package arrayList;

import java.util.ArrayList;         //Nature of ArrayList
                                    // 1) we can store duplicat data
class Nature_Of_ArrayList          // 2) insertion order mains FOFO concept
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add(true);
		obj.add(true);
		obj.add("Hello");
		obj.add("Hello");
		System.out.println(obj);
	}
}