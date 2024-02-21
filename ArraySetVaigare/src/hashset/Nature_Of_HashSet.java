package hashset;

import java.util.HashSet;   //1].in HashSet we can not allow duplicat value
class Nature_Of_HashSet       //2].in HashSet we can not maintain insertion (FIFO)
{
	public static void main(String[] args) 
	{
		HashSet obj=new HashSet();
		obj.add(true);
		obj.add("Hello");
		obj.add('H');
		obj.add(12);
		obj.add("123");
		obj.add(13);
		obj.add(true);
		obj.add(277);
		obj.add("Hello");
		System.out.println(obj);
	}
}
