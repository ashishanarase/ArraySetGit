package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
class retains   // Remove Diffrent object from HashSet keep Same/comman object
{
	public static void main(String[] args) 
	{
		HashSet H=new HashSet();  //1st HashSet
		H.add("Apple");
		H.add("kiwi");
		H.add("Mango");
        System.out.println(H);

		HashSet H1=new HashSet();  //2nd HashSet
		H1.add("Apple");
		H1.add("Grapes");
		H1.add("Orange");
		System.out.println(H1);

		H1.retainAll(H);
		System.out.println(H1);
	}
}
