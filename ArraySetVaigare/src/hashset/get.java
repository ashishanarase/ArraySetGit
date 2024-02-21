package hashset;

import java.util.HashSet;  //get():- Read the object inside the HashSet
import java.util.ArrayList;
class get 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList(); //in index concept present then Convert 
		obj.add(12);                   // HashSet into ArrayList
		obj.add(true);
		obj.add("kiwi");
		for (int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		HashSet H=new HashSet(obj); 
		System.out.println(H);

	}
}