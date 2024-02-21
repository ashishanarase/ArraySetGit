package hashset;

import java.util.HashSet;   // [<>]:- Making the HashSet as Homogenious.
import java.util.ArrayList;
import java.util.Collections;
class Diamond_Bracket //Angular Bracket
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(12);
		obj.add(13);
		obj.add(14);
		
		for (int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		HashSet H=new HashSet(obj);
		System.out.println(H);
	}
}
