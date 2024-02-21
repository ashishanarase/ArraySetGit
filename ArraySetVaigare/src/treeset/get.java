package treeset;

import java.util.TreeSet;  //get():- Read the object inside the TreeSet
import java.util.ArrayList;
class get 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList(); //in index concept present then Convert 
		obj.add(12);                   // TreeSet into ArrayList
		obj.add(true);
		obj.add("kiwi");
		for (int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		TreeSet H=new TreeSet(obj); 
		System.out.println(H);

	}
}