package arrayList;

import java.util.ArrayList;   //read the object present inside the ArrayList based on index value
class get 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(12);
		obj.add(true);
		obj.add("Hello");
		for (int i=0;i<obj.size();i++ )
		{
			System.out.println(obj.get(i));
		}
	}
}
