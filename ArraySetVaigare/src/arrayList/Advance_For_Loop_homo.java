package arrayList;

import java.util.ArrayList;   //Advance for loop make for homogenus ArrayList  
class Advance_For_Loop_homo  //OR for each loop
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(11);
		obj.add(12);

		for (Object var:obj)  //Advance for loop OR For each loop  
		{
			System.out.println(var);
		}
	}
}
