package treeset;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
class retains   // Remove Diffrent object from TreeSet keep Same/comman object
{
	public static void main(String[] args) 
	{
		TreeSet H=new TreeSet();  //1st TreeSet
		H.add("Apple");
		H.add("kiwi");
		H.add("Mango");
        System.out.println(H);

		TreeSet H1=new TreeSet();  //2nd TreeSet
		H1.add("Apple");
		H1.add("Grapes");
		H1.add("Orange");
		System.out.println(H1);

		H1.retainAll(H);
		System.out.println(H1);
	}
}
