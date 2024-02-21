package hashset;

import java.util.HashSet; //contains():- use for cross verification
import java.util.ArrayList;
class Contains 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();   // HashSet--->>>>ArrayList
		obj.add(12);
		obj.add(true);
		obj.add("kiwi");
		System.out.println(obj);
		System.out.println(obj.get(0));  //index value
		System.out.println(obj.contains(12));
		
		HashSet H=new HashSet(obj);      
		System.out.println(H);


	}
}
