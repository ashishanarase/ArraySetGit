package treeset;

import java.util.TreeSet;
import java.util.ArrayList; //in TreeSet we can not allow duplicat value
class add_Object           //in TreeSet we can not maintain insertion (FIFO)
{
	public static void main(String[] args) 
	{
		TreeSet obj=new TreeSet();
		obj.add(true);
		obj.add("Hello");     
		obj.add('H');
		obj.add(12);
		obj.add("123");
		obj.add(13);                 //java.lang.ClassCastException:
		obj.add(true);
		obj.add(277);
		obj.add("Hello");
		System.out.println(obj);
	}
}