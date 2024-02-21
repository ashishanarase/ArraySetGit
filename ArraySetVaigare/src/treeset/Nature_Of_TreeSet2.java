package treeset;

import java.util.TreeSet;   //1].in TreeSet we can not allow duplicat value
public class Nature_Of_TreeSet2     //2].in TreeSet we can not maintain insertion (FIFO)
{
	public static void main(String[] args) 
	{
		TreeSet obj=new TreeSet();
		obj.add(true);
		obj.add("Hello");
		obj.add('H');             //java.lang.ClassCastException:
		obj.add(12);
		obj.add("123");
		obj.add(13);
		obj.add(true);
		obj.add(277);
		obj.add("Hello");
		System.out.println(obj);
	}
}
