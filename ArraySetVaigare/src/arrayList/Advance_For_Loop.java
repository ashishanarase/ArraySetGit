package arrayList;

import java.util.ArrayList;  //traverses or Cross each element one by one.   
class Advance_For_Loop  //OR for each loop
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("kiwi");
		obj.add(12);

		for (Object var:obj)    //
		{
			System.out.println(var);
		}
	}
}
